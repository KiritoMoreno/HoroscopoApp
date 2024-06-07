package com.example.horoscopapp.ui.horoscope.adapter

import android.view.View
import android.view.animation.LinearInterpolator
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
        binding.itemHoroscopeParent.setOnClickListener {
            startRotationAnimation(binding.ivHoroscope)
            // onItemSelected(horoscopeInfo)
        }
    }

    private fun startRotationAnimation(view: View){
        view.animate().apply{
            duration = 500
            interpolator = LinearInterpolator()  // Va a tener la misma velocidad desde el inicio hasta el final con linearInterpolator
            rotationBy(360f)  // Rotar sobre su propio punto
            start()
        }
    }
}