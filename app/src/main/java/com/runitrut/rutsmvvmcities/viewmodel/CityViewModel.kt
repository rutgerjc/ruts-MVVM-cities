package com.runitrut.rutsmvvmcities.viewmodel

import android.os.Handler
import android.os.Looper
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.runitrut.rutsmvvmcities.model.City
import com.runitrut.rutsmvvmcities.model.CityDataProvider

class CityViewModel: ViewModel() {

    private val cityData = MutableLiveData<City>()
    private val cities = CityDataProvider().getCities()
    private var currentIndex = 0
    private val delay = 2000L

    init {
        loop()
    }

    fun getCityData(): LiveData<City> = cityData

    private fun loop() {
        Handler(Looper.getMainLooper()).postDelayed({ updateCity() }, delay)
    }

    private fun updateCity(){
        currentIndex++
        currentIndex%= cities.size

        cityData.value = cities[currentIndex]

        loop()
    }
}