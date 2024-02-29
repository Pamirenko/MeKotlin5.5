package com.example.mekotlin55.ui.adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.mekotlin55.R
import com.example.mekotlin55.data.model.DataItem
import com.example.mekotlin55.databinding.ItemHarryBinding


class HarryPotterAdapter : RecyclerView.Adapter<HarryPotterAdapter.HarryViewHolder>() {

    private val _harryList = mutableListOf<DataItem>()

    fun setHarryCharacter(harryList: List<DataItem>) {
        this._harryList.addAll(harryList)
        this._harryList.distinctBy {
            it.id
        }
        notifyDataSetChanged()

    }

    inner class HarryViewHolder(private val binding: ItemHarryBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun onBind(harryPoterResponce: DataItem) = with(binding) {
            val imageUrl = harryPoterResponce.attributes.image
            Log.d("ImageUrlDebug", "URL of the image: $imageUrl")

            Glide.with(ivCover)
                .load(imageUrl)
                .error(R.drawable.error)
                .into(ivCover)
            tvTitle.text = harryPoterResponce.attributes.slug
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HarryViewHolder {
        val binding = ItemHarryBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return HarryViewHolder(binding)
    }

    override fun getItemCount() = _harryList.size


    override fun onBindViewHolder(holder: HarryViewHolder, position: Int) {
        holder.onBind(_harryList[position])
    }
}