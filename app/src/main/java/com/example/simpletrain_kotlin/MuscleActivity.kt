package com.example.simpletrain_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.lifecycle.ViewModel

class MuscleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_muscle)

        val recyclerView: RecyclerView = findViewById(R.id.main_recycler_view)

        val receivedValue = intent.getStringExtra("intentKey1")

        val model = Model()
        val dataList = receivedValue?.let { model.getDictionaryValue(it) }

        val myAdapter = dataList?.let { MyAdapter(it) }
        recyclerView.adapter = myAdapter

        recyclerView.layoutManager = LinearLayoutManager(this)

    }
}