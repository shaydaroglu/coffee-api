package com.shaydaroglu.coffeeapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CoffeeApiApplication

fun main(args: Array<String>) {
    runApplication<CoffeeApiApplication>(*args)
}
