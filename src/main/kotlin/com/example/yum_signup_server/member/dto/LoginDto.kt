package com.example.yum_signup_server.member.dto

/**
 * 로그인 요청을 위한 DTO
 * 사용자가 입력한 이메일과 비밀번호를 포함
 */

data class LoginDto(
    val email: String,
    val password: String
)
