package com.example.demo.entity

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table

@Table(name = "connect_command", schema = "public")
class ConnectCommand {
    @Id
    @Column(value = "guild_id")
    var id: Long? = null

    @Column(value = "command")
    var command: String? = null

    @Column(value = "unix_last_update")
    var unixLastUpdate: Int? = null
}