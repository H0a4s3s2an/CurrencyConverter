package com.currency.converter.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.currency.libpokemon.models.CurrencyListResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel(): ViewModel() {
	
	private val repo = MainRepository()
	private val _currencyList = MutableLiveData<CurrencyListResponse>()
	val currencyList: LiveData<CurrencyListResponse> = _currencyList
	
	fun getCurrencyList() = viewModelScope.launch(Dispatchers.IO) {
		_currencyList.postValue(repo.getCurrency())
	}
}