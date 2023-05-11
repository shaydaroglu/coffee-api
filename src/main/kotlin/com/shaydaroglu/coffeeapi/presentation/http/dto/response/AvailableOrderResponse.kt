package com.shaydaroglu.coffeeapi.presentation.http.dto.response

import io.swagger.v3.oas.annotations.media.Schema

data class AvailableOrderResponse(
    @Schema(name = "drink_types", description = "List of available orders to make", example = "[\"coffee\", \"tea\"]")
    val drinkTypes: List<String>
)
