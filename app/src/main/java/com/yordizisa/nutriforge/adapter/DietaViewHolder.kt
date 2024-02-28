package com.yordizisa.nutriforge.adapter

// ItemViewHolder.kt
import android.view.View
import android.widget.Toast
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.yordizisa.nutriforge.R
import com.yordizisa.nutriforge.databinding.ItemDietaBinding
import com.yordizisa.nutriforge.modelos.Dieta
import com.yordizisa.nutriforge.modelos.DietaProvider

class DietaViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val binding = ItemDietaBinding.bind(view)

    fun render(itemModel: Dieta, onClickListener: (Dieta)-> Unit){
        itemView.setOnClickListener{onClickListener(itemModel)}
        binding.tv1.text = itemModel.nombre
        binding.tv2.text = itemModel.descripcion
        Glide.with(binding.ivItem.context).load(itemModel.foto).into(binding.ivItem)

        if (DietaProvider.favDietaList.contains(itemModel.id)) {
            binding.btnFav.text = itemView.context.getString(R.string.btnfavoritosQuitar)
           }
            else{
            binding.btnFav.text = itemView.context.getString(R.string.btnfavoritos)
            }
        binding.btnFav.setOnClickListener {
            val isFav = DietaProvider.favDietaList.contains(itemModel.id)

            if (isFav) {
                binding.btnFav.text = itemView.context.getString(R.string.btnfavoritos)
                DietaProvider.favDietaList.remove(itemModel.id)
                Toast.makeText(itemView.context, "Dieta eliminada de favoritos", Toast.LENGTH_SHORT).show()
            } else {
                // Si no está en la lista, agregarlo
                binding.btnFav.text = itemView.context.getString(R.string.btnfavoritosQuitar)
                DietaProvider.favDietaList.add(itemModel.id)
                Toast.makeText(itemView.context, "Dieta agregada a favoritos", Toast.LENGTH_SHORT).show()
            }
        }
    }
}