package com.hous.domain.entity

data class Follower(
    val id: Int,
    val profile: String,
    val name: String,
    val description: String = ""
)
