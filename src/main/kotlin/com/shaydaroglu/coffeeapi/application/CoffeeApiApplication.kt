package com.shaydaroglu.coffeeapi.application

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["com.shaydaroglu.coffeeapi"])
class CoffeeApiApplication

fun main(args: Array<String>) {
    runApplication<CoffeeApiApplication>(*args)
}
