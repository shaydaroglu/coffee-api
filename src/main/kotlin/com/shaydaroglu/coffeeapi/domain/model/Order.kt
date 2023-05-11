package com.shaydaroglu.coffeeapi.domain.model

import com.shaydaroglu.coffeeapi.domain.enumeration.DrinkType

data class Order(
    val drinkType: DrinkType,
    val sugarAmount: Int,
    val withMilk: Boolean
)
