package com.example.yum_signup_server.member.entity

import jakarta.persistence.*

@Entity
@Table(name = "members")
data class Member(
    @Id
    // 회원 고유 ID
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    // 회원 이메일 (중복 불가)
    @Column(nullable = false, unique = true)
    val email: String,

    // 회원 비밀번호
    @Column(nullable = false)
    val password: String,

    // 회원의 닉네임
    @Column(nullable = false)
    val name: String,

    // 회원 역할 (기본값 : USER)ß
    @Enumerated(EnumType.STRING)
    val role: MemberRole = MemberRole.USER
)