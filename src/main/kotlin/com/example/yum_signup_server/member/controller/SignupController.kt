package com.example.yum_signup_server.member.controller

import com.example.yum_signup_server.member.dto.SignupDto
import com.example.yum_signup_server.member.service.SignupService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/signup")
class SignupController(private val signupService: SignupService) {

    @PostMapping
    fun registerUser(@RequestBody signupDto: SignupDto): ResponseEntity<String> {
        signupService.registerUser(signupDto)
        return ResponseEntity.ok("회원가입 성공!")
    }
}