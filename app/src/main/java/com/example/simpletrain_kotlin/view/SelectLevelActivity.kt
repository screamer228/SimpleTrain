package com.example.simpletrain_kotlin.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.simpletrain_kotlin.R
import com.example.simpletrain_kotlin.viewmodel.MuscleActivity

class SelectLevelActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_level)

        val buttonEasyLevel: Button = findViewById(R.id.button_easy_level)
        val buttonMediumLevel: Button = findViewById(R.id.button_medium_level)
        val buttonHardLevel: Button = findViewById(R.id.button_hard_level)

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