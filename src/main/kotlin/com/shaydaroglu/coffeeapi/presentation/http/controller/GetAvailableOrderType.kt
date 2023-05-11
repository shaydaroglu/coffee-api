package com.shaydaroglu.coffeeapi.presentation.http.controller

import com.shaydaroglu.coffeeapi.domain.enumeration.DrinkType
import com.shaydaroglu.coffeeapi.presentation.http.dto.response.AvailableOrderResponse
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
class GetAvailableOrderType {
    @RequestMapping(
        value = ["/order/available"],
        method = [RequestMethod.GET],
        produces = ["application/json"]
    )
    fun invoke(): AvailableOrderResponse {
        return AvailableOrderResponse(DrinkType.values().map { it.string })
    }
}
