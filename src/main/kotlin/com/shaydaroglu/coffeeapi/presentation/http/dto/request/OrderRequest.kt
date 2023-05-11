package com.shaydaroglu.coffeeapi.presentation.http.dto.request

data class OrderRequest(
    val drinkType: String,
    val sugarAmount: Int,
    val withMilk: Boolean
)
