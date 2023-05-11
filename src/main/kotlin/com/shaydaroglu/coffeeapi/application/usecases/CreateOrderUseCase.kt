package com.shaydaroglu.coffeeapi.application.usecases

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.shaydaroglu.coffeeapi.domain.order.enumeration.DrinkType
import com.shaydaroglu.coffeeapi.domain.order.model.Order
import com.shaydaroglu.coffeeapi.infrastructure.messaging.rabbitmq.sender.OrderSender
import com.shaydaroglu.coffeeapi.presentation.http.dto.request.OrderRequest
import org.springframework.stereotype.Component
import java.util.*

@Component
class CreateOrderUseCase(
    private val orderSender: OrderSender
) {
    fun execute(orderRequest: OrderRequest) {
        val order = Order(
            drinkType = DrinkType.valueOf(orderRequest.drinkType.uppercase()),
            sugarAmount = orderRequest.sugarAmount,
            withMilk = orderRequest.withMilk
        )
        val jsonOrder = jacksonObjectMapper().writeValueAsString(order)

        orderSender.send(jsonOrder)
    }
}
