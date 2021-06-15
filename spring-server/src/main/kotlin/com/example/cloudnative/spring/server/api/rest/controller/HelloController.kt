package com.example.cloudnative.spring.server.api.rest.controller

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

/**
 * @author Viacheslav Petriaiev
 *         created on 2021-06-15
 */
@RestController
class HelloController {

    @PostMapping("/hello", consumes = [MediaType.APPLICATION_JSON_VALUE], produces = [MediaType.APPLICATION_JSON_VALUE])
    fun hello(@RequestBody nameDTO: NameDTO): GreetingDTO {
        println(nameDTO.name)
        return GreetingDTO(
            greeting = "Hello ${nameDTO.name}"
        )
    }

    data class NameDTO(
        var name: String? = null
    )

    data class GreetingDTO(
        var greeting: String? = null
    )

}