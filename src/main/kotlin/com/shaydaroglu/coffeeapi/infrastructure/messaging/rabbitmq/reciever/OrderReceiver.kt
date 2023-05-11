package com.shaydaroglu.coffeeapi.infrastructure.messaging.rabbitmq.reciever

import com.shaydaroglu.coffeeapi.application.usecases.MagicCoffeeMakerUseCase
import org.springframework.amqp.rabbit.annotation.RabbitListener
import org.springframework.messaging.handler.annotation.Payload
import org.springframework.stereotype.Component


@Component
class OrderReceiver(
    private val magicCoffeeMakerUseCase: MagicCoffeeMakerUseCase
) {
    @RabbitListener(queues = ["\${order.queue.name}"])
    fun receive(@Payload fileBody: String) {
        magicCoffeeMakerUseCase.execute(fileBody)
    }

}
