package com.shaydaroglu.coffeeapi.presentation.http.controller

import com.shaydaroglu.coffeeapi.application.usecases.CreateOrderUseCase
import com.shaydaroglu.coffeeapi.domain.order.model.Order
import com.shaydaroglu.coffeeapi.presentation.http.dto.request.OrderRequest
import org.springframework.http.HttpStatus
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RestController
class PostOrderController(
    private val createOrder: CreateOrderUseCase
) {
    @PostMapping(
        value = ["/order"],
        produces = ["application/json"]
    )
    @ResponseStatus(HttpStatus.ACCEPTED)
    fun invoke(
        @Valid
        @RequestBody
        body: OrderRequest
    ) {
        createOrder.execute(body)
    }
}
