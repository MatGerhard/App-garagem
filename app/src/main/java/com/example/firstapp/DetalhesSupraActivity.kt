package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class DetalhesSupraActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes_supra)

        supportActionBar!!.hide()

    }
}