package com.serioussem.misutesttask.presentation.adapters

import android.content.res.Resources
import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isGone
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.serioussem.misutesttask.R
import com.serioussem.misutesttask.databinding.SpecialtyHolderBinding
import com.serioussem.misutesttask.presentation.model.HorizontalRecyclerItemModel

class SpecialtyRecyclerAdapter : RecyclerView.Adapter<SpecialtyRecyclerAdapter.SpecialtyHolder>() {
    var callBack: ((position: Int, status: Boolean) -> Unit)? = null

    var items = mutableListOf<HorizontalRecyclerItemModel>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    inner class SpecialtyHolder(private val binding: SpecialtyHolderBinding) :
        RecyclerView.ViewHolder(binding.root) {

        var callBack: ((position: Int, status: Boolean) -> Unit)? = null
        fun bind(itemModel: HorizontalRecyclerItemModel) = with(binding) {

            holderSpecialtyTv.setText(itemModel.data)

            binding.specialtyCardView.setOnClickListener {
                callBack?.invoke(absoluteAdapterPosition, itemModel.check)
            }

            if (itemModel.check) {
                checkImg.isVisible = true
                holderSpecialtyTv.setTextColor(Color.parseColor("#FFFFFFFF"))
                rootLl.setBackgroundResource(R.color.blue)
            } else {
                checkImg.isGone = true
                holderSpecialtyTv.setTextColor(Color.parseColor("#2892E1"))
                rootLl.setBackgroundResource(R.color.white)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SpecialtyHolder {
        return SpecialtyHolder(
            SpecialtyHolderBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: SpecialtyHolder, position: Int) {
        holder.callBack = callBack
        holder.bind(items[position])
    }

    override fun getItemCount(): Int = items.size

}