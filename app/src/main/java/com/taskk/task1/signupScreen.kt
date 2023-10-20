package com.taskk.task1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.taskk.task1.databinding.ActivitySignupScreenBinding

class signupScreen : AppCompatActivity() {
    private lateinit var binding: ActivitySignupScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignupScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tvALREADYLOGIN.setOnClickListener {
           val intent= Intent(this,loginScreen::class.java)
            startActivity(intent)
        }
        binding.btGO.setOnClickListener {
            val intent=  Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}