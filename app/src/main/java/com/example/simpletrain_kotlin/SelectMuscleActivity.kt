package com.example.simpletrain_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SelectMuscleActivity : AppCompatActivity() {

    private lateinit var buttonChest: Button
    private lateinit var buttonBack: Button
    private lateinit var buttonShoulders: Button
    private lateinit var buttonBiceps: Button
    private lateinit var buttonTriceps: Button
    private lateinit var buttonLegs: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_muscle)

        initViews()
        clickListeners()

    }

    private fun initViews(){
        buttonChest = findViewById(R.id.button_chest)
        buttonBack = findViewById(R.id.button_back)
        buttonShoulders = findViewById(R.id.button_shoulders)
        buttonBiceps = findViewById(R.id.button_biceps)
        buttonTriceps = findViewById(R.id.button_triceps)
        buttonLegs = findViewById(R.id.button_legs)
    }

    private fun clickListeners(){
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
