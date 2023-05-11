package com.shaydaroglu.coffeeapi

import io.swagger.v3.oas.annotations.OpenAPIDefinition
import io.swagger.v3.oas.annotations.info.Info
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
@OpenAPIDefinition(
    info = Info(
        title = "Coffee Api",
        version = "1.0"
    )
)
class CoffeeApiApplication

fun main(args: Array<String>) {
    runApplication<CoffeeApiApplication>(*args)
}
