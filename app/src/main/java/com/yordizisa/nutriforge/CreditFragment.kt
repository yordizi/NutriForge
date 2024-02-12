package com.yordizisa.nutriforge

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.yordizisa.nutriforge.databinding.FragmentCreditBinding

class CreditFragment : Fragment() {

    private var _binding: FragmentCreditBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCreditBinding.inflate(inflater, container, false)

        val userName = arguments?.getString("userName")

        val tvInformativo = binding.tvInformativo
        val contactButton = binding.buttonContacto

        // nombre de usuario y version de la app
        tvInformativo.text = "Usuario $userName, estás usando la versión 1 de NutriForge."

        contactButton.setOnClickListener {
            // lanzar el intent implícito
            val emailIntent = Intent(Intent.ACTION_SENDTO)
            emailIntent.data = Uri.parse("mailto:")

            emailIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("yordirb@gmail.com"))
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Consulta de la app NutriForge")
            startActivity(Intent.createChooser(emailIntent, "Enviar correo"))
        }
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
