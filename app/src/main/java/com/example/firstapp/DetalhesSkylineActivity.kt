package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class DetalhesSkylineActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes_skyline)

        supportActionBar!!.hide()

    }
}