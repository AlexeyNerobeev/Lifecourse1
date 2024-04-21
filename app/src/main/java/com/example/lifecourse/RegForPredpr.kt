package com.example.lifecourse

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.isVisible
import com.example.lifecourse.databinding.ActivityRegForPredprBinding
import com.example.lifecourse.databinding.ActivitySignInForVusBinding

class RegForPredpr : AppCompatActivity() {
    private lateinit var binding: ActivityRegForPredprBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegForPredprBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.menuBtn.setOnClickListener {
            binding.clMenu.isVisible = true
            binding.menuBtn.isVisible = false
            binding.btnSend.isVisible = false
            binding.tvReg.isVisible = false
            binding.linPredpr1.isVisible = false
            binding.linPredpr2.isVisible = false
        }

        binding.btnBack.setOnClickListener{
            binding.clMenu.isVisible = false
            binding.menuBtn.isVisible = true
            binding.btnSend.isVisible = true
            binding.tvReg.isVisible = true
            binding.linPredpr1.isVisible = true
            binding.linPredpr2.isVisible = true
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
            binding.edPassword.text = null
            binding.edMail.text = null
            binding.edPredprName.text = null
            binding.edPredpAdress.text = null
        }

        binding.tvReg.setOnClickListener {
            val intent = Intent(this, SignInForPredpr::class.java)
            startActivity(intent)
        }
    }
}