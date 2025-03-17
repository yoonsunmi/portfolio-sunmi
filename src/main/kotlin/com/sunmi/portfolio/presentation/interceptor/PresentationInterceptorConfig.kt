package com.sunmi.portfolio.presentation.interceptor

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.InterceptorRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
class PresentationInterceptorConfig(
    private val presentationInterceptor: PresentationInterceptor
) : WebMvcConfigurer {

    override fun addInterceptors(registry: InterceptorRegistry) {
        registry.addInterceptor(presentationInterceptor)
            .addPathPatterns("/**")  // 모든 경로
            .excludePathPatterns("/assets/**", "/css/**", "/js/**", "/admin/**", "/h2**", "/favicon.ico", "/error")
    }

}