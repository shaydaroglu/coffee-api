package com.shaydaroglu.coffeeapi.application.usecases

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.shaydaroglu.coffeeapi.domain.model.Order
import com.shaydaroglu.coffeeapi.infrastructure.messaging.rabbitmq.sender.OrderSender
import org.springframework.stereotype.Component

@Component
class CreateOrderUseCase(
    private val orderSender: OrderSender
) {
    fun execute(sendOrder: Order) {
        val jsonOrder = jacksonObjectMapper().writeValueAsString(sendOrder)

        orderSender.send(jsonOrder)
    }
}
