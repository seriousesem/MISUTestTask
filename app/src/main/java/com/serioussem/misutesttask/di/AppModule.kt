package com.serioussem.misutesttask.di


import com.serioussem.misutesttask.presentation.adapters.DoctorsRecyclerAdapter
import com.serioussem.misutesttask.presentation.adapters.PatientsRecyclerAdapter
import com.serioussem.misutesttask.presentation.adapters.SpecialtyRecyclerAdapter
import com.serioussem.misutesttask.presentation.screens.DoctorOnlineViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    viewModel {
        DoctorOnlineViewModel()
    }
    single {
        DoctorsRecyclerAdapter(get())
    }
    single {
        PatientsRecyclerAdapter()
    }
    single{
        SpecialtyRecyclerAdapter()
    }

}
