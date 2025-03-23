package com.sunmi.portfolio.admin.interceptor

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.InterceptorRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
class AdminInterceptorConfiguration(
    val adminInterceptor: AdminInterceptor
) : WebMvcConfigurer {

    override fun addInterceptors(registry: InterceptorRegistry) {

        // /admin 이하 모든 경로에 대해 동작
        registry.addInterceptor(adminInterceptor).addPathPatterns("/admin/**").excludePathPatterns("/assets/**", "/css/**", "/js/**", "/h2**")

    }

}