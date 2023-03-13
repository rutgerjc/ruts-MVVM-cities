package com.runitrut.rutsmvvmcities.model

import com.runitrut.rutsmvvmcities.R

class CityDataProvider {

    private val cities = arrayListOf<City>()

    init {
        cities.add(City("Bejing", R.drawable.bangkok, 21_000_000))
        cities.add(City("Bangkok", R.drawable.beijing, 10_000_000))
        cities.add(City("London", R.drawable.london, 8_900_000))
        cities.add(City("New York", R.drawable.newyork, 8_400_000))
        cities.add(City("Paris", R.drawable.paris, 2_100_000))
        cities.add(City("Rio de Janeiro", R.drawable.rio, 6_700_000))
        cities.add(City("Romne", R.drawable.rome, 2_800_000))
        cities.add(City("Singapore", R.drawable.singapore, 5_700_000))
        cities.add(City("Sydney", R.drawable.sydney, 5_300_000))
        cities.add(City("Tokyo", R.drawable.tokyo, 13_900_000))
    }

    fun getCities() = cities
}