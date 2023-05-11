package com.shaydaroglu.coffeeapi.domain.order.enumeration

import com.fasterxml.jackson.annotation.JsonCreator

enum class DrinkType(val string: String) {
    COFFEE("coffee"),
    TEA("tea"),
    CHOCOLATE("chocolate");

    @JsonCreator
    fun jsonCreator(value: String): DrinkType {
        return DrinkType.valueOf(value)
    }
}
