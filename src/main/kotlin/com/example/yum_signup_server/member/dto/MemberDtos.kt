package com.example.yum_signup_server.member.dto

/**
 * 회원 정보를 응답 DTO
 * ID, 이메일, 닉네임, 역할(role) 정보를 포함
 */

data class MemberResponseDto(
    val id: Long,
    val email: String,
    val name: String,
    val role: String
)
