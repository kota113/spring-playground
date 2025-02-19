package com.example.demo.entity

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table
import java.time.Instant

@Table(name = "stripe_webhook_log", schema = "public")
class StripeWebhookLog {
    @Id
    @Column(value = "event_id")
    var eventId: String? = null

    @Column(value = "event_type")
    var eventType: String? = null

    @Column(value = "received_at")
    var receivedAt: Instant? = null

    @Column(value = "object_id")
    var objectId: String? = null

    @Column(value = "obj_id")
    var objId: String? = null
}