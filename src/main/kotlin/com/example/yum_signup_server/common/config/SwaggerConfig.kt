package com.example.yum_signup_server.common.config

import io.swagger.v3.oas.models.Components
import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class SwaggerConfig {
    @Bean
    fun openApi(): OpenAPI = OpenAPI()
        .components(Components())
        .info(swaggerInfo())

    private fun swaggerInfo(): Info = Info()
        .title("Yum 회원가입 및 로그인 API")
        .description("A&I 프로젝트 회원가입 및 로그인 서버의 API 명세서")
        .version("1.0.0")
}