package com.shaydaroglu.coffeeapi.presentation.http.dto.request

import io.swagger.v3.oas.annotations.media.Schema
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.PositiveOrZero

data class OrderRequest(
    @field: NotBlank(message = "Drink type cant be empty")
    @field: Pattern(regexp = "tea|coffee|chocolate")
    @Schema(name = "drink_type",description = "Desired drink type", example = "coffee")
    val drinkType: String,
    @field: PositiveOrZero(message = "Sugar amount can't be lower than 0")
    @Schema(name = "sugar_amount", description = "Amount of sugar", example = "1")
    val sugarAmount: Int,
    @field: NotNull
    @Schema(name = "with_milk", description = "Drink include milk or not", example = "true", defaultValue = "false")
    val withMilk: Boolean
)
