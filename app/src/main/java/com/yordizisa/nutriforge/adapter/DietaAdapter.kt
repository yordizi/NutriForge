package com.yordizisa.nutriforge.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import com.yordizisa.nutriforge.R
import androidx.recyclerview.widget.RecyclerView
import com.yordizisa.nutriforge.modelos.Dieta

class DietaAdapter(
    private val dietaLista: MutableList<Dieta>,
    private val onClickListener: (Dieta) -> Unit
) : RecyclerView.Adapter<DietaViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DietaViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return DietaViewHolder(layoutInflater.inflate(R.layout.item_dieta, parent, false))
    }

    override fun getItemCount(): Int = dietaLista.size


    override fun onBindViewHolder(holder: DietaViewHolder, position: Int) {
        val foto = dietaLista[position]
        holder.render(foto) {
            onClickListener(foto)
        }
    }
}

