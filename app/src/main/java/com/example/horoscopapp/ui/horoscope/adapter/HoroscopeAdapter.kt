package com.example.horoscopapp.ui.horoscope.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.horoscopapp.R
import com.example.horoscopapp.domain.HoroscopeInfo
import com.example.horoscopapp.ui.horoscope.HoroscopeViewModel

class HoroscopeAdapter (private var horoscopeList: List<HoroscopeInfo> = emptyList()): RecyclerView.Adapter<HoroscopeViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HoroscopeViewHolder {
        return HoroscopeViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_horoscope,parent, false)
        )
    }

    override fun getItemCount(): Int = horoscopeList.size

    override fun onBindViewHolder(holder: HoroscopeViewHolder, position: Int) {
        holder.render(horoscopeList[position])
    }

}