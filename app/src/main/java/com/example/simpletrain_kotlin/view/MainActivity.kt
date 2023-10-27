package com.example.simpletrain_kotlin.view

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.simpletrain_kotlin.R

class MainActivity : AppCompatActivity() {

    private lateinit var leftButton: Button
    private lateinit var rightButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        leftButton = findViewById(R.id.leftButton)
        rightButton = findViewById(R.id.rightButton)

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