package com.example.lifecourse

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import com.example.lifecourse.databinding.ActivitySignInBinding

class SignIn : AppCompatActivity() {
    private lateinit var binding: ActivitySignInBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.menuBtn.setOnClickListener {
            binding.clMenu.isVisible = true
            binding.menuBtn.isVisible = false
        }

        binding.btnBack.setOnClickListener{
            binding.clMenu.isVisible = false
            binding.menuBtn.isVisible = true
        }

        binding.tvMenu.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        binding.tvSignUp.setOnClickListener {
            val intent = Intent(this, SignUp::class.java)
            startActivity(intent)
        }

        binding.tvProfile.setOnClickListener {
            val intent = Intent(this, Profile::class.java)
            startActivity(intent)
        }
    }
}