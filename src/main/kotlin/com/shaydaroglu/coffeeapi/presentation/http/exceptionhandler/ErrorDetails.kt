package com.shaydaroglu.coffeeapi.presentation.http.exceptionhandler

data class ErrorDetails(
    val code: Int?,
    val message: String?
) {
    val timestamp: Long = System.currentTimeMillis()
}
