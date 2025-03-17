package com.sunmi.portfolio.presentation.interceptor

import com.sunmi.portfolio.domain.entity.HttpInterface
import com.sunmi.portfolio.domain.repository.HttpInterfaceRepository
import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import org.springframework.stereotype.Component
import org.springframework.web.servlet.HandlerInterceptor

@Component
class PresentationInterceptor(  // 방문하는 모든 클라이언트의 정보를 저장
    private val httpInterfaceRepository: HttpInterfaceRepository
) : HandlerInterceptor {

    // 예외 발생과 상관없이 동작해야하므로 afterCompletion 사용
    override fun afterCompletion(request: HttpServletRequest, response: HttpServletResponse, handler: Any, ex: Exception?) {
        val httpInterface = HttpInterface(request)
        httpInterfaceRepository.save(httpInterface)
    }

}