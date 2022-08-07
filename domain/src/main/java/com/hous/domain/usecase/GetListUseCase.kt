package com.hous.domain.usecase

import com.hous.domain.repository.Repository
import javax.inject.Inject

class GetListUseCase @Inject constructor(
    private val repository: Repository
) {
    suspend operator fun invoke() = repository.getList()
}
