package com.example.yum_signup_server.member.repository

import com.example.yum_signup_server.member.entity.Member
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface MemberRepository : JpaRepository<Member, Long> {
    fun findByEmail(email: String): Member?
}