package com.example.demo1.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class HealthController {
    @GetMapping("/v1/demo1/health")
    fun health(): String {
        return "ok"
    }
//    @GetMapping("/v1/demo1/test")
//    open fun test(): List<Message> = listOf(
//        Message("1", "hello"),
//        Message("2", "world"),
//    )
}

//data class Message(val id: String?, val text: String)