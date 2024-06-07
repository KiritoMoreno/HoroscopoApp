package com.example.horoscopapp.ui.horoscope.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.horoscopapp.databinding.ItemHoroscopeBinding
import com.example.horoscopapp.domain.HoroscopeInfo

class HoroscopeViewHolder (view: View): RecyclerView.ViewHolder(view){

    private val binding = ItemHoroscopeBinding.bind(view)

    fun render(horoscopeInfo: HoroscopeInfo, onItemSelected: (HoroscopeInfo) -> Unit){
        val context = binding.tvTitle.context
        binding.ivHoroscope.setImageResource(horoscopeInfo.img)
        binding.tvTitle.text = context.getString(horoscopeInfo.name)

        // le pasamos la funcion lambda  y dentro el item seleccionado
        binding.itemHoroscopeParent.setOnClickListener { onItemSelected(horoscopeInfo) }
    }
}