package com.example.yum_signup_server

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["com.example"])
class YumSignupServerApplication

fun main(args: Array<String>) {
	runApplication<YumSignupServerApplication>(*args)
}
