package com.yordizisa.nutriforge.pager

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.yordizisa.nutriforge.R
import com.yordizisa.nutriforge.databinding.FragmentDosBinding

class DosFragment : Fragment() {
    private var _binding: FragmentDosBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDosBinding.inflate(inflater, container, false)

        binding.btnComenzar.setOnClickListener {
            findNavController().navigate(R.id.action_viewPagerFragment_to_menuFragment)
        }
        return binding.root
    }
}

