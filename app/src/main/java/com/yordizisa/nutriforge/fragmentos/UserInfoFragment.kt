package com.yordizisa.nutriforge.fragmentos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.yordizisa.nutriforge.R

// UserInfoFragment.kt
class UserInfoFragment : Fragment() {
    // ... (declaración de variables y métodos necesarios)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflar el layout
        return inflater.inflate(R.layout.fragment_user_info, container, false)
    }
}
