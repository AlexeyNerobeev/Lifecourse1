package com.example.lifecourse

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.isVisible
import com.example.lifecourse.databinding.ActivitySignInBinding
import com.example.lifecourse.databinding.ActivitySignInForPredprBinding

class SignInForPredpr : AppCompatActivity() {
    private lateinit var binding: ActivitySignInForPredprBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInForPredprBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.menuBtn.setOnClickListener {
            binding.clMenu.isVisible = true
            binding.menuBtn.isVisible = false
            binding.btnSignIn.isVisible = false
            binding.linearLayout.isVisible = false
            binding.linearLayout2.isVisible = false
        }

        binding.btnBack.setOnClickListener{
            binding.clMenu.isVisible = false
            binding.menuBtn.isVisible = true
            binding.btnSignIn.isVisible = true
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

        binding.btnSignIn.setOnClickListener {
            binding.edMail.text = null
            binding.edPassword.text = null
            binding.edName.text = null
            binding.edAdress.text = null
        }
    }
}