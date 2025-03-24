package com.example.yum_signup_server.common.config

import io.swagger.v3.oas.annotations.OpenAPIDefinition
import io.swagger.v3.oas.annotations.info.Info
import org.springframework.context.annotation.Configuration

@Configuration
@OpenAPIDefinition(
    info = Info(
        title = "Yum Auth API 명세서 (회원가입 및 로그인)",
        description = "A&I 프로젝트 Yum 인증 서버의 API 명세서입니다.",
        version = "1.0.0"
    )
)
class SwaggerConfig