package com.example.yum_signup_server.member.controller

import com.example.yum_signup_server.member.dto.LoginDto
import com.example.yum_signup_server.member.service.LoginService
import io.swagger.v3.oas.annotations.Operation
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/login")
class LoginController(private val loginService: LoginService) {

    @Operation(summary = "로그인 API", description = "이메일과 비밀번호를 입력받아 인증을 수행합니다.")
    @PostMapping
    fun loginUser(@RequestBody loginDto: LoginDto): ResponseEntity<String> {
        return if (loginService.authenticateUser(loginDto)) {
            ResponseEntity.ok("로그인 성공!")
        } else {
            ResponseEntity.status(401).body("로그인 실패!")
        }
    }
}