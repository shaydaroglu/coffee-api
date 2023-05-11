package com.shaydaroglu.coffeeapi.presentation.http.controller

import com.shaydaroglu.coffeeapi.domain.order.enumeration.DrinkType
import com.shaydaroglu.coffeeapi.presentation.http.dto.response.AvailableOrderResponse
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
class GetAvailableOrderController {
    @RequestMapping(
        value = ["/order/available"],
        method = [RequestMethod.GET],
        produces = ["application/json"]
    )
    fun invoke(): AvailableOrderResponse {
        return AvailableOrderResponse(DrinkType.values().map { it.string })
    }
}
