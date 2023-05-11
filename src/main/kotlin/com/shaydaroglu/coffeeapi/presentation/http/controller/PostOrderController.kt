package com.shaydaroglu.coffeeapi.presentation.http.controller

import com.shaydaroglu.coffeeapi.application.usecases.CreateOrderUseCase
import com.shaydaroglu.coffeeapi.domain.model.Order
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
class PostOrderController(
    private val createOrder: CreateOrderUseCase
) {
    @PostMapping(
        value = ["/order"],
        produces = ["application/json"]
    )
    @ResponseStatus(HttpStatus.CREATED)
    fun invoke(@RequestBody body: Order) {
        createOrder.execute(body)
    }
}
