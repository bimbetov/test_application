package com.example.beibarys.myapplication.ui

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.beibarys.myapplication.model.Mosque
import kotlinx.android.synthetic.main.item.view.*

class MosqueViewHolder(
    private val view : View
) : RecyclerView.ViewHolder(view){

    fun setInfo(mosque : Mosque){
        itemView.run {
            infoTextView.text = mosque.getInfo()
            description.text = mosque.getFullInfo()

            Glide
                .with(context)
                .load(mosque.imageList[0])
                .centerCrop()
                .into(imageView)
        }
    }
}