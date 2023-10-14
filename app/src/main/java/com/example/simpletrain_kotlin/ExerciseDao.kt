package com.example.simpletrain_kotlin

import androidx.room.Dao
import androidx.room.Query

@Dao
interface ExerciseDao {

    @Query("SELECT * FROM exercise_items WHERE key = :key")
    fun getExerciseItems(key: String): List<ExerciseItem>

}