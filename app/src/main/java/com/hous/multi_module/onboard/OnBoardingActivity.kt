package com.hous.multi_module.onboard

import android.content.Intent
import android.os.Bundle
import com.hous.core.BindingActivity
import com.hous.multi_module.R
import com.hous.multi_module.databinding.ActivityOnBoardingBinding
import com.hous.multi_module.main.MainActivity

class OnBoardingActivity :
    BindingActivity<ActivityOnBoardingBinding>(R.layout.activity_on_boarding) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.btnMainButton.setOnClickListener {
            Intent(this, MainActivity::class.java)
                .also {
                    startActivity(it)
                    finish()
                }
        }
    }
}
