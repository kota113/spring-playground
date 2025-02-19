package com.example.demo.entity

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table
import java.time.Instant

@Table(name = "user_guilds", schema = "public")
class UserGuild {
    @Id
    @Column(value = "user_id")
    var id: Long? = null

    @Column(value = "guilds")
    var guilds: Any? = null

    @Column(value = "updated_at")
    var updatedAt: Instant? = null
}