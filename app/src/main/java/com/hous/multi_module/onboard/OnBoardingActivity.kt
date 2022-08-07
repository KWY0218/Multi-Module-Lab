package com.hous.multi_module.onboard

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.hous.multi_module.R
import com.hous.multi_module.databinding.ActivityOnBoardingBinding
import com.hous.multi_module.main.MainActivity

class OnBoardingActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOnBoardingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_on_boarding)
        binding.btnMainButton.setOnClickListener {
            Intent(this, MainActivity::class.java)
                .also {
                    startActivity(it)
                    finish()
                }
        }
    }
}
