package com.yordizisa.nutriforge.pagerMenu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayoutMediator
import com.yordizisa.nutriforge.R
import com.yordizisa.nutriforge.databinding.FragmentMenuBinding
import com.yordizisa.nutriforge.pager.ViewPagerAdapter

class MenuFragment : Fragment() {
    private var _binding: FragmentMenuBinding? = null
    private lateinit var menuPager: ViewPager2
    private lateinit var menuPagerAdapter: MenuPagerAdapter
    private val binding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMenuBinding.inflate(layoutInflater)
        val view = binding.root
        val btnSalir = binding.btnSalir

        btnSalir.setOnClickListener()
        {
            findNavController().navigate(R.id.action_menuFragment_to_loginFragment)
        }
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        menuPager = binding.PagerMenu
        menuPagerAdapter = MenuPagerAdapter(this)
        menuPager.adapter = menuPagerAdapter

        val tabLayout = binding.tablayout
        TabLayoutMediator(tabLayout, menuPager) { tab, position ->
            if(position == 0){
                tab.text = "Dietas"
            }else if(position == 1){
                tab.text = "Favoritas"
            }else if (position == 2){
                tab.text = "Usuario"
            }
        }.attach()
    }
}
