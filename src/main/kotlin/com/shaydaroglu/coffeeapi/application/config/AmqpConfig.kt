package com.shaydaroglu.coffeeapi.application.config

import org.springframework.amqp.core.Queue
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


@Configuration
class AmqpConfig {

    @Value("\${order.queue.name}")
    private val orderMessage: String? = null

    @Value("\${notification.queue.name}")
    private val notificationMessage: String? = null

    @Bean
    fun orderQueue(): Queue {
        return Queue(orderMessage, true)
    }

    @Bean
    fun notificationQueue(): Queue {
        return Queue(notificationMessage, true)
    }
}
