package com.shaydaroglu.coffeeapi.domain.order.model

import com.shaydaroglu.coffeeapi.domain.order.enumeration.DrinkType

data class Order(
    val drinkType: DrinkType,
    val sugarAmount: Int,
    val withMilk: Boolean
)
