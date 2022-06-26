package com.serioussem.misutesttask.presentation.model

data class DoctorModel(
    val avatar : Int?,
    val name : Int,
    val specialty: Int,
    val location: Int,
    val patients: MutableList<HorizontalRecyclerItemModel>,
    val services: Int
)
