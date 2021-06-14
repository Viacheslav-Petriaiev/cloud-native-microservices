package com.example.cloudnative.quarkus.api.rest.resource

import javax.ws.rs.Consumes
import javax.ws.rs.POST
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

/**
 * @author Viacheslav Petriaiev
 *         created on 2021-06-13
 */
@Path("/hello")
class HelloResource {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    fun hello(nameDTO: NameDTO): GreetingDTO {
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