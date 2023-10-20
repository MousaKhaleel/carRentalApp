package com.taskk.task1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.taskk.task1.databinding.ActivityLoginScreenBinding

class loginScreen : AppCompatActivity() {
    private lateinit var binding: ActivityLoginScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btGO.setOnClickListener {
            val intent=  Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        binding.tvNEWSIGNUP.setOnClickListener {
            val intent=  Intent(this,signupScreen::class.java)
            startActivity(intent)
        }
    }
}