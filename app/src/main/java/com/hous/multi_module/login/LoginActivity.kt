package com.hous.multi_module.login

import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.hous.multi_module.R
import com.hous.multi_module.databinding.ActivityLoginBinding
import com.hous.multi_module.onboard.OnBoardingActivity

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    private val loginViewModel: LoginViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =
            DataBindingUtil
                .setContentView<ActivityLoginBinding?>(this, R.layout.activity_login)
                .apply {
                    vm = loginViewModel
                    lifecycleOwner = this@LoginActivity
                }
        binding.signInLoginBtn.setOnClickListener {
            Intent(this, OnBoardingActivity::class.java)
                .also {
                    startActivity(it)
                    finish()
                }
        }
    }
}
