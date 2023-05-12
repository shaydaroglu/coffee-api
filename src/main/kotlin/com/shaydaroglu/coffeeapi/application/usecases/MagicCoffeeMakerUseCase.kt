package com.shaydaroglu.coffeeapi.application.usecases

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import com.shaydaroglu.coffeeapi.domain.order.model.Order
import com.shaydaroglu.coffeeapi.infrastructure.messaging.rabbitmq.sender.NotificationSender
import org.springframework.stereotype.Component
import java.util.*
import kotlin.concurrent.schedule

@Component
class MagicCoffeeMakerUseCase(
    private val notificationSender: NotificationSender
) {
    fun execute(receivedOrder: String) {
        val orderToPrepare = jacksonObjectMapper().readValue<Order>(receivedOrder)
        val notification: String = messageBuilder(orderToPrepare)

        Timer().schedule(5000) {
            notificationSender.send(notification)
        }
    }

    private fun messageBuilder(orderToSerialize: Order): String {
        return "Order is ready: ${orderToSerialize.drinkType.string}, " +
                "Sugar Amount: ${orderToSerialize.sugarAmount}, " +
                "Milk: ${
                    when (orderToSerialize.withMilk) {
                        true -> "Yes"
                        else -> "No"
                    }
                }"
    }

}
