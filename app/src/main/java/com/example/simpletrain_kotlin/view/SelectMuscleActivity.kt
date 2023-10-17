package com.example.simpletrain_kotlin.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.content.ContextCompat.startActivity
import com.example.simpletrain_kotlin.R
import com.example.simpletrain_kotlin.viewmodel.MuscleActivity

class SelectMuscleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_muscle)

        val buttonChest: Button = findViewById(R.id.button_chest)
        val buttonBack: Button = findViewById(R.id.button_back)
        val buttonShoulders: Button = findViewById(R.id.button_shoulders)
        val buttonBiceps: Button = findViewById(R.id.button_biceps)
        val buttonTriceps: Button = findViewById(R.id.button_triceps)
        val buttonLegs: Button = findViewById(R.id.button_legs)

        buttonChest.setOnClickListener {
            val intent = Intent(this, MuscleActivity::class.java)
            val keyToPass = "keyChest"
            intent.putExtra("intentKey", keyToPass)
            startActivity(intent)
        }
        buttonBack.setOnClickListener {
            val intent = Intent(this, MuscleActivity::class.java)
            val keyToPass = "keyBack"
            intent.putExtra("intentKey", keyToPass)
            startActivity(intent)
        }
        buttonShoulders.setOnClickListener {
            val intent = Intent(this, MuscleActivity::class.java)
            val keyToPass = "keyShoulders"
            intent.putExtra("intentKey", keyToPass)
            startActivity(intent)
        }
        buttonBiceps.setOnClickListener {
            val intent = Intent(this, MuscleActivity::class.java)
            val keyToPass = "keyBiceps"
            intent.putExtra("intentKey", keyToPass)
            startActivity(intent)
        }
        buttonTriceps.setOnClickListener {
            val intent = Intent(this, MuscleActivity::class.java)
            val keyToPass = "keyTriceps"
            intent.putExtra("intentKey", keyToPass)
            startActivity(intent)
        }
        buttonLegs.setOnClickListener {
            val intent = Intent(this, MuscleActivity::class.java)
            val keyToPass = "keyLegs"
            intent.putExtra("intentKey", keyToPass)
            startActivity(intent)
        }
    }
}
