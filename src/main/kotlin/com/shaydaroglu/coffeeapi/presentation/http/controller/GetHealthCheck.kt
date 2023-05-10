package com.shaydaroglu.coffeeapi.presentation.http.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
class GetHealthCheck {
    @RequestMapping(
        value = ["/healthcheck"],
        method = [RequestMethod.GET],
        produces = ["application/json"]
    )
    operator fun invoke(): Map<String, String> {
        return mapOf("coffeeApi" to "Is Alive")
    }
}