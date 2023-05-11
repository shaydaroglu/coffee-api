package com.shaydaroglu.coffeeapi.presentation.http.openapi

import io.swagger.v3.oas.annotations.OpenAPIDefinition
import io.swagger.v3.oas.annotations.info.Contact
import io.swagger.v3.oas.annotations.info.Info

@OpenAPIDefinition(
    info = Info(
        title = "Coffee Machine Sample API",
        description = "A service as showcase for making coffee orders via api.",
        contact = Contact(name = "Sercan Haydaroglu"),
        version = "1.0"
    )
)
class OpenApiDefinition