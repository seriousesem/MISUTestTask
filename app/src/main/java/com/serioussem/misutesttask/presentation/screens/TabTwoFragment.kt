package com.serioussem.misutesttask.presentation.screens

import com.serioussem.misutesttask.R
import com.serioussem.misutesttask.databinding.TabsFragmentBinding
import com.serioussem.misutesttask.presentation.core.BaseFragment

class TabTwoFragment : BaseFragment<TabsFragmentBinding>(TabsFragmentBinding::inflate)  {
    override fun init() {
        binding.fragmentNameTv.setText(R.string.tab3_name)
    }
}

