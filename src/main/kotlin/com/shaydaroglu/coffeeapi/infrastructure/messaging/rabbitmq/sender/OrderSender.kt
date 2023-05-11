package com.shaydaroglu.coffeeapi.infrastructure.messaging.rabbitmq.sender

import org.springframework.amqp.core.Queue
import org.springframework.amqp.rabbit.core.RabbitTemplate
import org.springframework.stereotype.Component


@Component
class OrderSender(
    private val orderQueue: Queue,
    private val rabbitTemplate: RabbitTemplate
) {
    fun send(order: String) {
        rabbitTemplate.convertAndSend(orderQueue.name, order)
    }
}
