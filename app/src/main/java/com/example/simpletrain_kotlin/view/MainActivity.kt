package com.example.simpletrain_kotlin.view

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.simpletrain_kotlin.viewmodel.MuscleActivity
import com.example.simpletrain_kotlin.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val leftButton: Button = findViewById(R.id.leftButton)
        val rightButton: Button = findViewById(R.id.rightButton)

        leftButton.setOnClickListener {
            val intent = Intent(this, SelectMuscleActivity::class.java)
            startActivity(intent)
        }
        rightButton.setOnClickListener {
            val intent = Intent(this, SelectLevelActivity::class.java)
            startActivity(intent)
        }
    }
}