package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.firstapp.databinding.ActivityDetalhesFuscaBinding
import com.example.firstapp.databinding.ActivityMainBinding

class DetalhesFuscaActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetalhesFuscaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetalhesFuscaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.hide()

    }
}