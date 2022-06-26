package com.serioussem.misutesttask.presentation.adapters

import android.content.Context
import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.serioussem.misutesttask.databinding.DoctorHolderBinding
import com.serioussem.misutesttask.presentation.model.DoctorModel

class DoctorsRecyclerAdapter(private val context: Context) :
    RecyclerView.Adapter<DoctorsRecyclerAdapter.DoctorHolder>() {
    var items = mutableListOf<DoctorModel>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DoctorHolder {
        return DoctorHolder(
            DoctorHolderBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: DoctorHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int = items.size

    inner class DoctorHolder(private val binding: DoctorHolderBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(itemModel: DoctorModel) = with(binding) {
            with(itemModel) {
                Glide.with(context)
                    .load(avatar)
                    .circleCrop()
                    .into(avatarImg)
                doctorNameTv.setText(name)
                specialtyTv.setText(specialty)
                locationTv.setText(location)
                val patientAdapter = PatientsRecyclerAdapter()
                binding.patientsRv.adapter = patientAdapter
                patientAdapter.items = patients
                servicesTv.setText(services)
            }
        }
    }
}


