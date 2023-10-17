package com.example.simpletrain_kotlin.viewmodel

import com.example.simpletrain_kotlin.view.adapters.MyAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.simpletrain_kotlin.R
import com.example.simpletrain_kotlin.data.ExerciseItem
import com.example.simpletrain_kotlin.model.Model

class MuscleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_muscle)

        val toolbarTitle: Toolbar = findViewById(R.id.toolbar_muscle)
        val recyclerView: RecyclerView = findViewById(R.id.main_recycler_view)
        val receivedKey = intent.getStringExtra("intentKey")
        val model = Model()
        val dataList = model.getExerciseValue(receivedKey.toString())
        val myAdapter = dataList?.let { MyAdapter(it) }

        toolbarTitle.title = model.getToolbarTitleValue(receivedKey.toString())
        recyclerView.adapter = myAdapter
        recyclerView.layoutManager = LinearLayoutManager(this)

    }
}