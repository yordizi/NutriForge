package com.yordizisa.nutriforge.fragmentos

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.yordizisa.nutriforge.databinding.FragmentDetailItemBinding
import com.yordizisa.nutriforge.modelos.Dieta

// DetailItemFragment.kt
@Suppress("DEPRECATION")
class DetailDietaFragment : Fragment() {
    private lateinit var binding: FragmentDetailItemBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding = FragmentDetailItemBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val item:Dieta? = arguments?.getParcelable("dieta")
        if(item !=null){
            binding.detalleNombreParam.text = item.nombre
            binding.detalleDescripcionParam.text = item.descripcion
            Glide.with(binding.ivFotoParam.context).load(item.foto).into(binding.ivFotoParam)
        }
    }
}
