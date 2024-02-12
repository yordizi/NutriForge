package com.yordizisa.nutriforge.pagerMenu

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.yordizisa.nutriforge.fragmentos.DietaListFragment
import com.yordizisa.nutriforge.fragmentos.FavDietaListFragment
import com.yordizisa.nutriforge.fragmentos.UserInfoFragment

class MenuPagerAdapter(fragment:Fragment): FragmentStateAdapter(fragment){
    override fun getItemCount(): Int = 3

    companion object{
        private const val ARG_OBJECT = "object"
    }
    override fun createFragment(position: Int): Fragment {
        val fragment1 = DietaListFragment()
        val fragment2 = FavDietaListFragment()
        val fragment3 = UserInfoFragment()

        if(position==0){
            return fragment1
        }else if (position==1){
            return fragment2
        }else{
            return fragment3
        }
    }
}