package com.serioussem.misutesttask.presentation.screens

import androidx.fragment.app.viewModels
import com.serioussem.misutesttask.databinding.DoctorOnlineFragmentBinding
import com.serioussem.misutesttask.presentation.adapters.DoctorsRecyclerAdapter
import com.serioussem.misutesttask.presentation.adapters.SpecialtyRecyclerAdapter
import com.serioussem.misutesttask.presentation.core.BaseFragment
import org.koin.android.ext.android.get



class DoctorOnlineFragment : BaseFragment<DoctorOnlineFragmentBinding>(DoctorOnlineFragmentBinding::inflate)  {
    private val viewModel by viewModels<DoctorOnlineViewModel>()
    private val specialtyAdapter = SpecialtyRecyclerAdapter()
    private val doctorsAdapter = DoctorsRecyclerAdapter(get())

    override fun init() {
        initView()
        initObservers()
        initCallBack()
    }

    private fun initCallBack() {
        specialtyAdapter.callBack = { id, status ->
            viewModel.updateSpecialtyStatus(id, !status)
        }

    }

    private fun initObservers() {
        viewModel.specialty.observe(this) {
           specialtyAdapter.items = it
        }
        doctorsAdapter.items = viewModel.doctorsList
    }

    private fun initView() {
       with(binding){
            specialtyRv.adapter = specialtyAdapter
            doctorsRv.adapter = doctorsAdapter
           doctorsAdapter.items = viewModel.doctorsList
       }
    }
}
