package com.example.tugas3

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tugas3.databinding.LoginBinding

class login : AppCompatActivity() {

    private lateinit var binding: LoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.login)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding = LoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.textView2.setOnClickListener {
            val intent = Intent(this, register::class.java)
            startActivity(intent)
        }
        binding.buttonlogin.setOnClickListener {
            val intent = Intent(this, halaman::class.java)
            startActivity(intent)
        }
        binding.textView3.setOnClickListener {
            val intent = Intent(this, lupapasword::class.java)
            startActivity(intent)
        }
    }
}