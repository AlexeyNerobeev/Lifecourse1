package com.example.lifecourse

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.isVisible
import com.example.lifecourse.databinding.ActivityRegForVusBinding

class RegForVUS : AppCompatActivity() {
    private lateinit var binding: ActivityRegForVusBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegForVusBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.menuBtn.setOnClickListener {
            binding.clMenu.isVisible = true
            binding.menuBtn.isVisible = false
            binding.btnSend.isVisible = false
            binding.linearLayout.isVisible = false
            binding.linearLayout2.isVisible = false
            binding.tvReg.isVisible = false
        }

        binding.btnBack.setOnClickListener{
            binding.clMenu.isVisible = false
            binding.menuBtn.isVisible = true
            binding.btnSend.isVisible = true
            binding.linearLayout.isVisible = true
            binding.linearLayout2.isVisible = true
            binding.tvReg.isVisible = true
        }

        binding.tvSignIn.setOnClickListener {
            val intent = Intent(this, SignIn::class.java)
            startActivity(intent)
        }

        binding.tvMenu.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        binding.tvProfile.setOnClickListener {
            val intent = Intent(this, Profile::class.java)
            startActivity(intent)
        }

        binding.btnSend.setOnClickListener {
            binding.edVUSName.text = null
            binding.edAdress.text = null
            binding.edPassword.text = null
            binding.edMail.text = null
        }

        binding.tvReg.setOnClickListener {
            val intent = Intent(this, SignInForVUS::class.java)
            startActivity(intent)
        }
    }
}