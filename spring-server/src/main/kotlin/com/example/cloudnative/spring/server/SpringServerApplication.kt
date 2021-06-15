package com.example.cloudnative.spring.server

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringServerApplication

fun main(args: Array<String>) {
	runApplication<SpringServerApplication>(*args)
}
