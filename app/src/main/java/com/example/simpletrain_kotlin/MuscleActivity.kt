package com.example.simpletrain_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.simpletrain_kotlin.data.Model

class MuscleActivity : AppCompatActivity() {

    private lateinit var toolbarTitle: Toolbar
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: MyAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_muscle)

        initViews()

        val receivedKey = intent.getStringExtra("intentKey")
        val model = Model()
        val dataList = model.getExerciseValue(receivedKey.toString())

        adapter = MyAdapter(dataList!!)
        toolbarTitle.title = model.getToolbarTitleValue(receivedKey.toString())
        recyclerView.adapter = adapter
    }

    private fun initViews(){
        toolbarTitle = findViewById(R.id.toolbar_muscle)
        recyclerView = findViewById(R.id.main_recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}