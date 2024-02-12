package com.yordizisa.nutriforge.fragmentos

import android.os.Bundle
import android.view.View
import com.yordizisa.nutriforge.modelos.Dieta
import com.yordizisa.nutriforge.modelos.DietaProvider


class FavDietaListFragment : DietaListFragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        actualizarRecyclerView()
    }
    protected fun actualizarRecyclerView() {
        val listaDietasFavoritas = obtenerDietasFavoritas()
        iniciarRecyclerView(listaDietasFavoritas)
    }

    private fun obtenerDietasFavoritas(): MutableList<Dieta> {
        return DietaProvider.listaItem.filter { it.esFavorita }.toMutableList()
    }
}

