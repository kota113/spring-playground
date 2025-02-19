package com.example.demo.entity

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table
import java.time.LocalDate

@Table(name = "word_count", schema = "public")
class WordCount {
    @Id
    @Column(value = "guild_id")
    var id: Long? = null

    @Column(value = "wavenet_count_now")
    var wavenetCountNow: Int? = null

    @Column(value = "standard_count_now")
    var standardCountNow: Int? = null

    @Column(value = "limit_word_count")
    var limitWordCount: Any? = null

    @Column(value = "subscription")
    var subscription: String? = null

    @Column(value = "created_at")
    var createdAt: LocalDate? = null

    @Column(value = "voice_channel_count")
    var voiceChannelCount: Int? = null

    @Column(value = "is_overwritten")
    var isOverwritten: Boolean? = null

    @Column(value = "is_connected")
    var isConnected: Boolean? = null
}