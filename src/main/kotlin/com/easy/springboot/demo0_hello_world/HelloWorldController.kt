package com.easy.springboot.demo0_hello_world

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController {
    @GetMapping(value = ["", "/", "/hello"])
    fun hello(): Greeting {
        return Greeting(name = "World", greeting = "Hello")
    }

    data class Greeting(var name: String, var greeting: String)
}