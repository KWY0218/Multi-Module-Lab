package com.hous.data.repository

import com.hous.data.api.GithubApi
import com.hous.domain.entity.Follower
import com.hous.domain.repository.Repository
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    private val githubApi: GithubApi
) : Repository {
    override suspend fun getList(): Result<List<Follower>> =
        runCatching { githubApi.getList() }
            .mapCatching { result ->
                result.map {
                    Follower(
                        id = it.id,
                        profile = it.avatarUrl,
                        name = it.login
                    )
                }
            }
}
