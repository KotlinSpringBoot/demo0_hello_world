package com.easy.springboot.demo0_hello_world

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class Demo0HelloWorldApplication

fun main(args: Array<String>) {
    println("Spring Boot 2.0极简教程")
    runApplication<Demo0HelloWorldApplication>(*args)
}
