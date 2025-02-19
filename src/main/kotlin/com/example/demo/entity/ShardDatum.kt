package com.example.demo.entity

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table

@Table(name = "shard_data", schema = "public")
class ShardDatum {
    @Id
    @Column(value = "shard_id")
    var id: Int? = null

    @Column(value = "guilds_num")
    var guildsNum: Int? = null

    @Column(value = "connected_num")
    var connectedNum: Int? = null

    @Column(value = "is_assigned")
    var isAssigned: Boolean? = null

    @Column(value = "tts_key")
    var ttsKey: String? = null

    @Column(value = "shardd_token")
    var sharddToken: String? = null

    @Column(value = "latest_command_fetch")
    var latestCommandFetch: Int? = null

    @Column(value = "openai_key")
    var openaiKey: String? = null

    @Column(value = "fetched_cached_settings_at")
    var fetchedCachedSettingsAt: Int? = null
}