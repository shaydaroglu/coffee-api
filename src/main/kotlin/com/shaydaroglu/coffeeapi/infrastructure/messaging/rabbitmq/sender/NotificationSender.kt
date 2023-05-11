package com.shaydaroglu.coffeeapi.infrastructure.messaging.rabbitmq.sender

import org.springframework.amqp.core.Queue
import org.springframework.amqp.rabbit.core.RabbitTemplate
import org.springframework.stereotype.Component


@Component
class NotificationSender(
    private val notificationQueue: Queue,
    private val rabbitTemplate: RabbitTemplate
) {
    fun send(notification: String) {
        rabbitTemplate.convertAndSend(notificationQueue.name, notification)
    }
}
