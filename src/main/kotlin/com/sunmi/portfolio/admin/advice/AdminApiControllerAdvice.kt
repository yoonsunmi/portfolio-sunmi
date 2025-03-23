package com.sunmi.portfolio.admin.advice

import com.sunmi.portfolio.admin.exception.AdminException
import org.slf4j.LoggerFactory
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.MethodArgumentNotValidException
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class AdminApiControllerAdvice {
    val log = LoggerFactory.getLogger(AdminApiControllerAdvice::class.java)

    @ExceptionHandler
    fun handleException(e: AdminException): ResponseEntity<String> {
        log.info(e.message, e)

        // AdminException 내부의 httpStatus 를 응답 상태코드 반환
        return ResponseEntity.status(e.httpStatus).body(e.message)
    }

    @ExceptionHandler
    fun handleException(e: MethodArgumentNotValidException): ResponseEntity<String> {
        log.info(e.message, e)

        val fieldError = e.bindingResult.fieldErrors[0]
        val message = "[${fieldError.field}] ${fieldError.defaultMessage}"

        // validation exception 처리, 클라이언트에서 보낸 데이터 오류라 BadRequest 응답코드 반환
        return ResponseEntity.badRequest().body(message)
    }

    @ExceptionHandler
    fun handleException(e: Exception): ResponseEntity<String> {
        log.info(e.message, e)

        // 그 외 exception 처리
        return ResponseEntity.internalServerError().body("시스템 오류가 발생했습니다.")
    }
}