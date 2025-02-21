package com.example.demo

import com.example.demo.entity.SettingsDatum
import com.example.demo.entity.WordCount
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.*

@SpringBootApplication
class DemoApplication

fun main(args: Array<String>) {
    runApplication<DemoApplication>(*args)
}

@RestController
@RequestMapping("/guilds/{guildId}/settings")
class GuildSettingsResource(val service: GuildSettingsService) {
    @GetMapping
    fun index(@PathVariable guildId: Long) = service.get(guildId)
}

@Service
class GuildSettingsService(val db: GuildSettingsRepository) {
    fun get(guildId: Long) = db.findById(guildId)
}

interface GuildSettingsRepository: CrudRepository<SettingsDatum, Long> {}


@RestController
@RequestMapping("/guilds/{guildId}/connection_state")
class ConnectionStateResource(val service: ConnectionStateService) {
    @PostMapping
    fun post(@RequestBody props: ConnectionStateProps, @PathVariable guildId: Long) {
        service.create(guildId, props)
    }
}

@Service
class ConnectionStateService(val settingsDb: GuildSettingsRepository, val characterUsageDb: CharacterUsageRepository) {
    fun create(guildId: Long, props: ConnectionStateProps) {
        val settings = settingsDb.findById(guildId)
        val characterUsages = characterUsageDb.findById(guildId)
        TODO()
    }
}

interface CharacterUsageRepository: CrudRepository<WordCount, Long> {}

data class ConnectionStateProps(
    val vcId: Long,
    val tcId: Long,
    val readGuild: Boolean?,
    val readName: Boolean?,
    val speechSpeed: Float?,
    val lang: String?,
    val maxMessageLength: Int?,
    val translate: Boolean?
)
