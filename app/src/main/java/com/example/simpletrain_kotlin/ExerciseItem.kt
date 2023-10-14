package com.example.simpletrain_kotlin

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "exercise_items")
data class ExerciseItem(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val title: String,
    val imageUrl: String,
    val repeats: String
)
