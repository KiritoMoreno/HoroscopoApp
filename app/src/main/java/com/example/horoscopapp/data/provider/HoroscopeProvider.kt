package com.example.horoscopapp.data.provider

import com.example.horoscopapp.domain.HoroscopeInfo
import com.example.horoscopapp.domain.HoroscopeInfo.*
import javax.inject.Inject

class HoroscopeProvider @Inject constructor(){
    fun getHoroscopes(): List<HoroscopeInfo>{
        return listOf(
            Aries,
            Taurus,
            Gemini,
            Cancer,
            Leo,
            Virgo,
            Libra,
            Scorpio,
            Sagittarius,
            Capricorn,
            Aquarius,
            Pisces
        )
    }
}