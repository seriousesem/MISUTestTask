package com.serioussem.misutesttask.presentation.screens

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.serioussem.misutesttask.R
import com.serioussem.misutesttask.presentation.model.DoctorModel
import com.serioussem.misutesttask.presentation.model.HorizontalRecyclerItemModel

class DoctorOnlineViewModel : ViewModel() {

    private val specialtyList = mutableListOf(
        HorizontalRecyclerItemModel(R.string.specialty_1, false),
        HorizontalRecyclerItemModel(R.string.specialty_2, false),
        HorizontalRecyclerItemModel(R.string.specialty_3, false),
        HorizontalRecyclerItemModel(R.string.specialty_4, false),
    )

    val doctorsList = mutableListOf(
        DoctorModel(
            R.drawable.doctor_female_icon,
            R.string.name_1,
            R.string.specialty_1,
            R.string.location_1,
            mutableListOf(
                HorizontalRecyclerItemModel(R.string.child_0_16, false),
                HorizontalRecyclerItemModel(R.string.adults, false),
                HorizontalRecyclerItemModel(R.string.covid, false)
            ),
            R.string.responsibility_1
        ),
        DoctorModel(
            R.drawable.doctor_female_icon,
            R.string.name_2,
            R.string.specialty_1,
            R.string.location_2,
            mutableListOf(
                HorizontalRecyclerItemModel(R.string.child_0_3, false),
                HorizontalRecyclerItemModel(R.string.adults, false)
            ),
            R.string.responsibility_2
        ),
        DoctorModel(
            R.drawable.doctor_female_icon,
            R.string.name_3,
            R.string.specialty_1,
            R.string.location_3,
            mutableListOf(
                HorizontalRecyclerItemModel(R.string.child_0_16, false),
                HorizontalRecyclerItemModel(R.string.adults, false),
                HorizontalRecyclerItemModel(R.string.covid, false)
            ),
            R.string.responsibility_3
        ),
        DoctorModel(
            R.drawable.doctor_female_icon,
            R.string.name_4,
            R.string.specialty_1,
            R.string.location_4,
            mutableListOf(
                HorizontalRecyclerItemModel(R.string.adults, false),
                HorizontalRecyclerItemModel(R.string.covid, false)
            ),
            R.string.responsibility_4
        ),
        DoctorModel(
            R.drawable.doctor_male_icon,
            R.string.name_5,
            R.string.specialty_1,
            R.string.location_5,
            mutableListOf(
                HorizontalRecyclerItemModel(R.string.child_7_16, false),
                HorizontalRecyclerItemModel(R.string.adults, false),
                HorizontalRecyclerItemModel(R.string.covid, false)
            ),
            R.string.responsibility_5
        )
    )

    private var _specialty = MutableLiveData(specialtyList)
    val specialty: LiveData<MutableList<HorizontalRecyclerItemModel>> = _specialty

    fun updateSpecialtyStatus(id: Int, status: Boolean) {
        val list = _specialty.value
        list?.get(id)?.check = status
        _specialty.value = list
    }


}