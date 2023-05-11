package com.shaydaroglu.coffeeapi.infrastructure.messaging.rabbitmq.reciever

import org.slf4j.LoggerFactory
import org.springframework.amqp.rabbit.annotation.RabbitListener
import org.springframework.messaging.handler.annotation.Payload
import org.springframework.stereotype.Component


@Component
class NotificationReceiver {
    @RabbitListener(queues = ["\${notification.queue.name}"])
    fun receive(@Payload fileBody: String) {
        logger.info(fileBody)
    }

    companion object {
        val logger = LoggerFactory.getLogger(NotificationReceiver::class.java)
    }
}
