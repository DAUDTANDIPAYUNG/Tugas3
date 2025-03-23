package com.example.tugas3

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tugas3.databinding.HalamanBinding
import com.example.tugas3.databinding.LoginBinding

class halaman : AppCompatActivity() {

    private lateinit var binding: HalamanBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.halaman)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.halaman)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding = HalamanBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.textView.setOnClickListener {
            val intent = Intent(this, login::class.java)
            startActivity(intent)
        }
        binding.buttonkirim.setOnClickListener {
            val textToSend = "Pesan dari aplikasi saya!"
            val sendIntent = Intent(Intent.ACTION_SEND)
            sendIntent.type = "text/plain"
            sendIntent.putExtra(Intent.EXTRA_TEXT, textToSend)
            val chooserIntent =
                Intent.createChooser(sendIntent, "Pilih aplikasi untuk mengirim pesan")
            startActivity(chooserIntent)
        }
    }
}