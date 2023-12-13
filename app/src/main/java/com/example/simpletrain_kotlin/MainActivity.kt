package com.example.simpletrain_kotlin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var leftButton: Button
    private lateinit var rightButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
        clickListeners()

    }

    private fun initViews(){
        leftButton = findViewById(R.id.leftButton)
        rightButton = findViewById(R.id.rightButton)
    }

    private fun clickListeners(){
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