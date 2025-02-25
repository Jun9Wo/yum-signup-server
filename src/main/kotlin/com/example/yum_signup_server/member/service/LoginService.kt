package com.example.yum_signup_server.member.service

import com.example.yum_signup_server.member.dto.LoginDto
import com.example.yum_signup_server.member.repository.MemberRepository
import org.springframework.stereotype.Service
import java.security.MessageDigest

@Service
class LoginService(private val memberRepository: MemberRepository) {

    fun authenticateUser(loginDto: LoginDto): Boolean {
        val user = memberRepository.findByEmail(loginDto.email)
            ?: throw IllegalArgumentException("이메일이 존재하지 않습니다.") // ✅ Optional → Kotlin null-safe 방식으로 변경

        return hashPassword(loginDto.password) == user.password
    }

    private fun hashPassword(password: String): String {
        val digest = MessageDigest.getInstance("SHA-256")
        return digest.digest(password.toByteArray()).joinToString("") { "%02x".format(it) }
    }
}
