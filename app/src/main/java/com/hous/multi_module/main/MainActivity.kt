package com.hous.multi_module.main

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.flowWithLifecycle
import androidx.lifecycle.lifecycleScope
import com.hous.domain.entity.Follower
import com.hous.multi_module.R
import com.hous.multi_module.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val mainViewModel: MainViewModel by viewModels()
    private val mainAdapter = MainAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        mainViewModel.followerList
            .flowWithLifecycle(lifecycle)
            .onEach(this::initAdapter)
            .launchIn(lifecycleScope)
    }

    private fun initAdapter(followerList: List<Follower>) {
        binding.rvMainFollowerList.adapter = mainAdapter
        mainAdapter.submitList(followerList)
    }
}
