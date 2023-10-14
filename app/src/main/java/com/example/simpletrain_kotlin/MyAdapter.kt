package com.example.simpletrain_kotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide


class MyAdapter(private val dataList: List<ExerciseItem>) :
    RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleTextView: TextView = itemView.findViewById(R.id.item_title)
        val imageView: ImageView = itemView.findViewById(R.id.item_image)
        val repeatsTextView: TextView = itemView.findViewById(R.id.item_repeats)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = dataList[position]
        holder.titleTextView.text = item.title

        Glide.with(holder.itemView)
            .asGif()
            .load(item.imageUrl) // Здесь должно быть URL или ресурс изображения
            .placeholder(R.drawable.loading) // Ресурс-заполнитель, если изображение не загружено
            .into(holder.imageView) // ImageView, куда загружать изображение

        holder.repeatsTextView.text = item.repeats
    }

    override fun getItemCount(): Int {
        return dataList.size
    }
}