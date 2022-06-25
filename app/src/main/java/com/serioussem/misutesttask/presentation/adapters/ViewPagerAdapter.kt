package com.serioussem.misutesttask.presentation.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.serioussem.misutesttask.presentation.screens.TabOneFragment
import com.serioussem.misutesttask.presentation.screens.TabThreeFragment
import com.serioussem.misutesttask.presentation.screens.TabTwoFragment
import com.serioussem.misutesttask.presentation.screens.TabZeroFragment

class ViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {

    private val fragmentList =
        listOf<Fragment>(
            TabZeroFragment(),
            TabOneFragment(),
            TabTwoFragment(),
            TabThreeFragment()
        )

    override fun getItemCount(): Int = fragmentList.size

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> fragmentList[0]
            1 -> fragmentList[1]
            2 -> fragmentList[2]
            3 -> fragmentList[3]
            else -> fragmentList[0]
        }
    }
}