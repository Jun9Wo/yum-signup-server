package com.example.yum_signup_server.member.entity

import jakarta.persistence.*
import org.springframework.data.annotation.Id

@Entity
@Table(name = "members")
data class Member(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @Column(nullable = false, unique = true)
    val email: String,

    @Column(nullable = false)
    val password: String,

    @Column(nullable = false)
    val name: String,

    @Enumerated(EnumType.STRING)
    val role: MemberRole = MemberRole.USER
)