package com.yordizisa.nutriforge.adapter

// ItemViewHolder.kt
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.yordizisa.nutriforge.databinding.FragmentFavItemListBinding
import com.yordizisa.nutriforge.modelos.Dieta

class FavDietaViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val binding = FragmentFavItemListBinding.bind(view)

    fun render(itemModel: Dieta, onClickListener: (Dieta)-> Unit){
        itemView.setOnClickListener{onClickListener(itemModel)}
    }
}