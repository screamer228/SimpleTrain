package com.example.simpletrain_kotlin

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [ExerciseItem::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun exerciseDao(): ExerciseDao
}
