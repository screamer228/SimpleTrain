package com.example.simpletrain_kotlin.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.simpletrain_kotlin.R
import com.example.simpletrain_kotlin.viewmodel.MuscleActivity


class SelectLevelActivity : AppCompatActivity() {

    private lateinit var buttonEasyLevel: Button
    private lateinit var buttonMediumLevel: Button
    private lateinit var buttonHardLevel: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_level)

        buttonEasyLevel = findViewById(R.id.button_easy_level)
        buttonMediumLevel = findViewById(R.id.button_medium_level)
        buttonHardLevel = findViewById(R.id.button_hard_level)

        buttonEasyLevel.setOnClickListener {
            val intent = Intent(this, MuscleActivity::class.java)
            val valueToPass = "keyEasyLevel"
            intent.putExtra("intentKey", valueToPass)
            startActivity(intent)
        }
        buttonMediumLevel.setOnClickListener {
            val intent = Intent(this, MuscleActivity::class.java)
            val valueToPass = "keyMediumLevel"
            intent.putExtra("intentKey", valueToPass)
            startActivity(intent)
        }
        buttonHardLevel.setOnClickListener {
            val intent = Intent(this, MuscleActivity::class.java)
            val valueToPass = "keyHardLevel"
            intent.putExtra("intentKey", valueToPass)
            startActivity(intent)
        }

    }
}