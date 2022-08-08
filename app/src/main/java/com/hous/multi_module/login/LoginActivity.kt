package com.hous.multi_module.login

import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.hous.core.BindingActivity
import com.hous.multi_module.R
import com.hous.multi_module.databinding.ActivityLoginBinding
import com.hous.multi_module.onboard.OnBoardingActivity

class LoginActivity : BindingActivity<ActivityLoginBinding>(R.layout.activity_login) {
    private val loginViewModel: LoginViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.vm = loginViewModel
        binding.signInLoginBtn.setOnClickListener {
            Intent(this, OnBoardingActivity::class.java)
                .also {
                    startActivity(it)
                    finish()
                }
        }
    }
}
