package com.example.demo.entity

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table

@Table(name = "settings_data", schema = "public")
class SettingsDatum {
    @Id
    @Column(value = "guild_id")
    var id: Long? = null

    @Column(value = "lang")
    var lang: String? = null

    @Column(value = "word_limit")
    var wordLimit: Int? = null

    @Column(value = "speech_speed")
    var speechSpeed: Double? = null

    @Column(value = "read_name")
    var readName: Boolean? = null

    @Column(value = "custom_voice")
    var customVoice: String? = null

    @Column(value = "translate")
    var translate: Boolean? = null

    @Column(value = "read_name_on_join")
    var readNameOnJoin: Boolean? = null

    @Column(value = "read_name_on_leave")
    var readNameOnLeave: Boolean? = null

    @Column(value = "read_guild")
    var readGuild: Boolean? = null

    @Column(value = "read_not_joined_users")
    var readNotJoinedUsers: Boolean? = null

    @Column(value = "expand_message_link")
    var expandMessageLink: Boolean? = null

    @Column(value = "audio_api")
    var audioApi: String? = null

    @Column(value = "character_limit")
    var characterLimit: Int? = null
}