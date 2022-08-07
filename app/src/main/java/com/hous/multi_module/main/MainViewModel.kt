package com.hous.multi_module.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hous.domain.entity.Follower
import com.hous.domain.usecase.GetListUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import timber.log.Timber

@HiltViewModel
class MainViewModel @Inject constructor(
    private val getListUseCase: GetListUseCase
) : ViewModel() {
    private val _followerList: MutableStateFlow<List<Follower>> = MutableStateFlow(emptyList())
    val followerList = _followerList.asStateFlow()

    init {
        viewModelScope.launch {
            getListUseCase()
                .onSuccess { _followerList.emit(it) }
                .onFailure { Timber.d("main viewModel error : ${it.message}") }
        }
    }
}
