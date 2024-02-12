package com.yordizisa.nutriforge.adapter

// ItemViewHolder.kt
import android.view.View
import android.widget.Button
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.yordizisa.nutriforge.R
import com.yordizisa.nutriforge.databinding.FragmentItemListBinding
import com.yordizisa.nutriforge.databinding.ItemDietaBinding
import com.yordizisa.nutriforge.modelos.Dieta

class DietaViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val binding = ItemDietaBinding.bind(view)

    fun render(itemModel: Dieta, onClickListener: (Dieta)-> Unit){
        itemView.setOnClickListener{onClickListener(itemModel)}
        binding.tv1.text = itemModel.nombre
        binding.tv2.text = itemModel.descripcion
        Glide.with(binding.ivItem.context).load(itemModel.foto).into(binding.ivItem)

        binding.btnFav.setOnClickListener {
            // Cambiar el estado de favorito de la foto
            itemModel.esFavorita = !itemModel.esFavorita
            onClickListener(itemModel)
        }
    }
}