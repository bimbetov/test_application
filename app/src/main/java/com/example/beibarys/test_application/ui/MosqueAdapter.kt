package com.example.beibarys.test_application.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.beibarys.test_application.R
import com.example.beibarys.test_application.model.Mosque

class MosqueAdapter (
    private val item : List<Mosque>,
    private val clickItemListener : (Mosque) -> Unit
) : RecyclerView.Adapter<MosqueViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MosqueViewHolder {
        val viewHolder = MosqueViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item,
                parent,
                false
            )
        )
        viewHolder.itemView.setOnClickListener {
            val position = viewHolder.adapterPosition
            if (position != RecyclerView.NO_POSITION){
                clickItemListener(item[position])
            }
        }
        return viewHolder
    }

    override fun getItemCount(): Int {
        return item.size
    }

    override fun onBindViewHolder(holder: MosqueViewHolder, position: Int) {
        holder.setInfo(item[position])
    }
}