package com.example.demo

import com.example.demo.entity.SettingsDatum
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
class GuildSettingsService(val db: GuildRepository) {
    fun get(guildId: Long) = db.findById(guildId)
}

interface GuildRepository: CrudRepository<SettingsDatum, Long> {

}
