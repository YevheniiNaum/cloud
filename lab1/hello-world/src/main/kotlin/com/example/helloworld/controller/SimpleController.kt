package com.example.helloworld.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SimpleController {

    @GetMapping("/")
    fun helloWorld(): String {
        return "Hello EUGENE. It's kotlin's world"
    }
}