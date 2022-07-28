package com.hous.domain.repository

import com.hous.domain.entity.Follower

interface Repository {
    suspend fun getList(): Result<List<Follower>>
}
