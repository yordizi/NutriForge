package com.yordizisa.nutriforge

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.yordizisa.nutriforge.databinding.FragmentLoginBinding
class LoginFragment : Fragment() {

    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)

        val editText = binding.editText
        val button1 = binding.button1

        // Set the welcome text, image, and other UI elements

        button1.setOnClickListener {
            val userName = editText.text.toString()

            if (userName.isNotBlank()) {
                findNavController().navigate(R.id.action_loginFragment_to_viewPagerFragment)

            } else {
                editText.error = "Inserta un nombre para continuar"
            }
        }
        return binding.root
    }
}