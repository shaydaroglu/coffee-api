package com.shaydaroglu.coffeeapi.presentation.http.exceptionhandler

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.http.converter.HttpMessageNotReadableException
import org.springframework.validation.FieldError
import org.springframework.web.bind.MethodArgumentNotValidException
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestControllerAdvice


@RestControllerAdvice
class ApiExceptionHandler {
    @ExceptionHandler
    fun handleNoSuchElementException(ex: HttpMessageNotReadableException): ResponseEntity<ErrorDetails> {
        val response = ErrorDetails(
            HttpStatus.BAD_REQUEST.value(),
            ex.message
        )
        return ResponseEntity(response, HttpStatus.BAD_REQUEST)
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(
        MethodArgumentNotValidException::class
    )
    fun handleValidationExceptions(
        ex: MethodArgumentNotValidException
    ): Map<String, String>? {
        val errors: MutableMap<String, String> = HashMap()
        ex.bindingResult.allErrors.forEach { error ->
            val fieldName = (error as FieldError).field
            val errorMessage: String? = error.getDefaultMessage()
            if (errorMessage != null) {
                errors[fieldName] = errorMessage
            }
        }
        return errors
    }
}
