package com.currency.converter.ui.home

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.currency.converter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
	
	private lateinit var binding: ActivityMainBinding
	private val homeViewModel: MainViewModel by viewModels()
	
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		binding = ActivityMainBinding.inflate(layoutInflater)
		setContentView(binding.root)
		
		homeViewModel.getCurrencyList()
		
		homeViewModel.currencyList.observe(this){
			binding.fromEt.setText(it.currencies.usDollar)
			binding.toEt.setText(it.currencies.pakistanRupee)
		}
	}
}