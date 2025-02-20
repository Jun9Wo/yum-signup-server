package com.example.yum_signup_server.member.controller

import com.example.yum_signup_server.member.dto.LoginDto
import com.example.yum_signup_server.member.service.LoginService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/login")
class LoginController(private val loginService: LoginService) {

    @PostMapping
    fun loginUser(@RequestBody loginDto: LoginDto): ResponseEntity<String> {
        return if (loginService.authenticateUser(loginDto)) {
            ResponseEntity.ok("로그인 성공!")
        } else {
            ResponseEntity.status(401).body("로그인 실패!")
        }
    }
}