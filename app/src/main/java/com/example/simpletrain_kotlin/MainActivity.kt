package com.example.simpletrain_kotlin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.room.Room
import androidx.room.RoomDatabase

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val appDatabase: RoomDatabase = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java,
            "exercise-database"
        ).build()

        val leftButton = findViewById<Button>(R.id.leftButton)
        leftButton.setOnClickListener {
            val intent = Intent(this@MainActivity, MuscleActivity::class.java)
            val valueToPass = "key1"
            intent.putExtra("intentKey1", valueToPass)
            startActivity(intent)
        }
        //val rightButton = findViewById<Button>(R.id.rightButton)
        //rightButton.setOnClickListener {
        //    val intent = Intent(this@MainActivity, MainActivity3::class.java)
        //    startActivity(intent)
        //}
    }
}