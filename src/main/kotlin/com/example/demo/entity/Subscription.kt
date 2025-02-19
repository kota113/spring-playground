package com.example.demo.entity

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table
import java.time.LocalDate

@Table(name = "subscriptions", schema = "public")
class Subscription {
    @Id
    @Column(value = "sub_id")
    var subId: String? = null

    @Column(value = "guild_id")
    var guildId: Long? = null

    @Column(value = "user_id")
    var userId: Long? = null

    @Column(value = "sub_start")
    var subStart: LocalDate? = null

    @Column(value = "plan")
    var plan: String? = null

    @Column(value = "last_updated")
    var lastUpdated: LocalDate? = null
}