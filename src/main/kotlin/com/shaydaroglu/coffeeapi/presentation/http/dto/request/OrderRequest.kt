package com.shaydaroglu.coffeeapi.presentation.http.dto.request

import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.PositiveOrZero

data class OrderRequest(
    @field: NotBlank(message = "Drink type cant be empty")
    @field: Pattern(regexp = "tea|coffee|chocolate")
    val drinkType: String,
    @field: PositiveOrZero
    val sugarAmount: Int,
    @field: NotNull
    val withMilk: Boolean
)
