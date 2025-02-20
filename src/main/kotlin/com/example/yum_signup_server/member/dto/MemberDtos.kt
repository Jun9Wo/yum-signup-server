package com.example.yum_signup_server.member.dto

data class MemberResponseDto(
    val id: Long,
    val email: String,
    val name: String,
    val role: String
)
