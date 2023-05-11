package com.shaydaroglu.coffeeapi.presentation.http.exceptionhandler

import com.shaydaroglu.coffeeapi.presentation.http.controller.GetHealthCheck
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class ApiExceptionHandler {
    @ExceptionHandler
    fun handleNoSuchElementException(ex: NoSuchElementException): ResponseEntity<ErrorDetails> {
        val response = ErrorDetails(
            HttpStatus.NOT_FOUND.value(),
            ex.message
        )
        return ResponseEntity(response, HttpStatus.NOT_FOUND)
    }

    @ExceptionHandler(ResourceNotFoundException::class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    fun handleNotFound(ex: ResourceNotFoundException): ResponseEntity<ErrorDetails> {
        val response = ErrorDetails(
            HttpStatus.NOT_FOUND.value(),
            ex.message
        )
        return ResponseEntity(response, HttpStatus.NOT_FOUND)
    }

    companion object {
        val logger: Logger = LoggerFactory.getLogger(GetHealthCheck::class.java)
    }
}
