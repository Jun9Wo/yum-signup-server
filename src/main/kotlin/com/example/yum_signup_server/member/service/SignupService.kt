package com.example.yum_signup_server.member.service

import com.example.yum_signup_server.member.dto.SignupDto
import com.example.yum_signup_server.member.entity.Member
import com.example.yum_signup_server.member.entity.MemberRole
import com.example.yum_signup_server.member.repository.MemberRepository
import org.springframework.stereotype.Service
import java.security.MessageDigest

@Service
class SignupService(private val memberRepository: MemberRepository) {

    fun registerUser(signupDto: SignupDto) {
        if (memberRepository.findByEmail(signupDto.email) != null) {
            throw IllegalArgumentException("이미 존재하는 이메일입니다.")
        }

        val hashedPassword = hashPassword(signupDto.password)
        val newMember = Member(
            email = signupDto.email,
            password = hashedPassword,
            name = signupDto.name,
            role = MemberRole.USER
        )
        memberRepository.save(newMember)
    }

    private fun hashPassword(password: String): String {
        val digest = MessageDigest.getInstance("SHA-256")
        return digest.digest(password.toByteArray()).joinToString("") { "%02x".format(it) }
    }
}