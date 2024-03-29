package com.yordizisa.nutriforge.fragmentos

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.yordizisa.nutriforge.R
import com.yordizisa.nutriforge.adapter.DietaAdapter
import com.yordizisa.nutriforge.databinding.FragmentItemListBinding
import com.yordizisa.nutriforge.modelos.Dieta
import com.yordizisa.nutriforge.modelos.DietaProvider

open class DietaListFragment : Fragment() {


    private lateinit var binding: FragmentItemListBinding
    private lateinit var dietaAdapter: DietaAdapter // Asegúrate de declararla aquí

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentItemListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val listaDietas = DietaProvider.listaItem
        iniciarRecyclerView(listaDietas)
    }
    protected open fun iniciarRecyclerView(listaDietas: MutableList<Dieta>) {
        val manager = LinearLayoutManager(requireActivity())
        binding.recyclerItem.layoutManager = manager
       dietaAdapter = DietaAdapter(listaDietas) { onItemSelected(it) }
       binding.recyclerItem.adapter = dietaAdapter
    }

    private fun onItemSelected(dieta:Dieta) {
        dietaAdapter.updateItem(dieta)
        val bundle = Bundle()
        bundle.putParcelable("dieta", dieta)
        findNavController().navigate(R.id.action_menuFragment_to_detailDietaFragment, bundle)
    }
}

