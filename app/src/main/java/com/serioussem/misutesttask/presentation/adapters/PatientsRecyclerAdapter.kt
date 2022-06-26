package com.serioussem.misutesttask.presentation.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.serioussem.misutesttask.databinding.PatientsHolderBinding
import com.serioussem.misutesttask.presentation.model.HorizontalRecyclerItemModel

class PatientsRecyclerAdapter : RecyclerView.Adapter<PatientsRecyclerAdapter.PatientsHolder>() {

    var items = mutableListOf<HorizontalRecyclerItemModel>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    inner class PatientsHolder(private val binding: PatientsHolderBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(itemModel: HorizontalRecyclerItemModel) = with(binding) {
            patientsTv.setText(itemModel.data)
        }
    }

    override fun onBindViewHolder(holder: PatientsHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PatientsHolder {
        return PatientsHolder(
            PatientsHolderBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }
}