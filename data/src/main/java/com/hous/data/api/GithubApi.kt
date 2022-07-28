package com.hous.data.api

import com.hous.data.entity.FollowerEntity
import retrofit2.http.GET
import retrofit2.http.Path

interface GithubApi {
    @GET("/users/{username}/followers")
    suspend fun getList(
        @Path("username") userName: String = "KWY0218"
    ): List<FollowerEntity>
}
