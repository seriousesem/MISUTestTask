package com.serioussem.misutesttask.presentation.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.serioussem.misutesttask.R
import com.serioussem.misutesttask.databinding.BottomSheetBinding
import com.serioussem.misutesttask.databinding.HomeActivityBinding
import com.serioussem.misutesttask.databinding.TabsFragmentBinding
import com.serioussem.misutesttask.presentation.core.BaseFragment

class TabOneFragment : BottomSheetDialogFragment()  {
    private val binding by lazy(LazyThreadSafetyMode.NONE) {
        BottomSheetBinding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? =
        binding.root


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.bottomSheetTv.setText(R.string.tab1_name)
    }

}
