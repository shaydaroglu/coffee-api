package com.shaydaroglu.coffeeapi

import com.shaydaroglu.coffeeapi.application.CoffeeApiApplication
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest(classes = [CoffeeApiApplication::class])
class CoffeeApiApplicationTests {

    @Test
    fun contextLoads() {
    }

}
