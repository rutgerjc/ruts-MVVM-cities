package com.runitrut.rutsmvvmcities.view

import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.core.content.res.ResourcesCompat
import androidx.lifecycle.Observer
import com.runitrut.rutsmvvmcities.R
import com.runitrut.rutsmvvmcities.databinding.ActivityMainBinding
import com.runitrut.rutsmvvmcities.viewmodel.CityViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel: CityViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }


    override fun onResume() {
        super.onResume()

        viewModel.getCityData().observe(this, Observer { city ->
            binding.cityImage.setImageDrawable(
                ResourcesCompat.getDrawable(resources, city.image, applicationContext.theme)
            )
            binding.cityNameTV.text = city.name
            binding.cityPopulationTV.text = city.population.toString()
        })

    }
}