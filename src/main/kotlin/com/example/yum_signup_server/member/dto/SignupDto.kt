package com.example.yum_signup_server.member.dto

/**
 * 회원가입 요청 DTO
 * 사용자가 입력한 이메일, 비밀번호, 닉네임을 포함
 */

data class SignupDto(
    val email: String,
    val password: String,
    val name: String
)
