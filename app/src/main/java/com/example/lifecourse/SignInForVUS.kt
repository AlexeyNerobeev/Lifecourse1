package com.example.lifecourse

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.isVisible
import com.example.lifecourse.databinding.ActivityRegForVusBinding
import com.example.lifecourse.databinding.ActivitySignInBinding
import com.example.lifecourse.databinding.ActivitySignInForVusBinding

class SignInForVUS : AppCompatActivity() {
    private lateinit var binding: ActivitySignInForVusBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInForVusBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.menuBtn.setOnClickListener {
            binding.clMenu.isVisible = true
            binding.menuBtn.isVisible = false
            binding.btnSend.isVisible = false
            binding.linearLayout.isVisible = false
            binding.linearLayout2.isVisible = false
        }

        binding.btnBack.setOnClickListener{
            binding.clMenu.isVisible = false
            binding.menuBtn.isVisible = true
            binding.btnSend.isVisible = true
            binding.linearLayout.isVisible = true
            binding.linearLayout2.isVisible = true
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

        binding.btnSend.setOnClickListener {
            binding.edMail.text = null
            binding.edPassword.text = null
            binding.edVUSName.text = null
            binding.edAdress.text = null
        }
    }
}