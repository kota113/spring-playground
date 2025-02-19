package com.example.demo.entity

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table

@Table(name = "trusted_roles", schema = "public")
class TrustedRole {
    @Id
    @Column(value = "guild_id")
    var id: Long? = null

    @Column(value = "is_enabled")
    var isEnabled: Boolean? = null

    @Column(value = "role_ids")
    var roleIds: Any? = null
}