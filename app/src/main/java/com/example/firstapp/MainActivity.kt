package com.example.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.firstapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.hide()

        binding.ivFusca.setOnClickListener{
            val intent = Intent(this, DetalhesFuscaActivity::class.java)
            startActivity(intent)
        }

        binding.ivSkyline.setOnClickListener{
            val intent = Intent(this, DetalhesSkylineActivity::class.java)
            startActivity(intent)
        }

        binding.ivSupra.setOnClickListener {
            val intent = Intent(this, DetalhesSupraActivity::class.java)
            startActivity(intent)
        }
    }
}