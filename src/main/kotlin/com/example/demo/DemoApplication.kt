package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class DemoApplication

fun main(args: Array<String>) {
    runApplication<DemoApplication>(*args)
}


@RestController
class MessageResource(val service: MessageService) {
    @GetMapping
    fun index(): List<Message> = listOf(
        Message("1", "Hello"),
        Message("2", "こんにちは")
    )
}

@Service
class MessageService(val db: MessageRepository) {
    fun findMessages(): List<Message> = listOf(
        TODO()
    )

    fun post(message: Message) {

    }
}

class MessageRepository {

}

data class Message(
    val id: String,
    val text: String?
)
