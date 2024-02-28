package com.yordizisa.nutriforge.fragmentos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.yordizisa.nutriforge.adapter.DietaAdapter
import com.yordizisa.nutriforge.databinding.FragmentFavItemListBinding
import com.yordizisa.nutriforge.modelos.Dieta
import com.yordizisa.nutriforge.modelos.DietaProvider


class FavDietaListFragment : Fragment() {

    private lateinit var binding: FragmentFavItemListBinding
    private lateinit var favDietaAdapter: DietaAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFavItemListBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onResume() {
        super.onResume()
        val favListaDieta = obtenerDietasFavoritas()
        iniciarFavRecyclerView(favListaDieta)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val favListaDieta = obtenerDietasFavoritas()
        iniciarFavRecyclerView(favListaDieta)
    }

    protected fun iniciarFavRecyclerView(favDietaList: MutableList<Int>) {
        // Obtener las dietas favoritas completas a partir de los IDs
        val favDietasCompletas = DietaProvider.listaItem.filter { dieta -> favDietaList.contains(dieta.id) }.toMutableList()
        val manager = LinearLayoutManager(requireActivity())
        binding.recyclerFavItem.layoutManager = manager
        favDietaAdapter = DietaAdapter(favDietasCompletas) { onFavItemSelected(it) }
        binding.recyclerFavItem.adapter = favDietaAdapter
    }

    private fun onFavItemSelected(dieta: Dieta) {
        favDietaAdapter.updateItem(dieta)
    }

    private fun obtenerDietasFavoritas(): MutableList<Int> {
        return DietaProvider.favDietaList
    }
}


