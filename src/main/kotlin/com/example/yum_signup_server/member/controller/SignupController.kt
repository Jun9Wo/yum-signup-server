package com.example.yum_signup_server.member.controller

import com.example.yum_signup_server.member.dto.SignupDto
import com.example.yum_signup_server.member.service.SignupService
import io.swagger.v3.oas.annotations.Operation
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/signup")
class SignupController(private val signupService: SignupService) {

    @Operation(summary = "회원가입 API", description = "사용자가 회원가입을 요청하면 정보를 저장하고 성공 메시지를 반환합니다.")
    @PostMapping("")
    fun registerUser(@RequestBody signupDto: SignupDto): ResponseEntity<String> {
        signupService.registerUser(signupDto)
        return ResponseEntity.ok("회원가입 성공!")
    }
}

