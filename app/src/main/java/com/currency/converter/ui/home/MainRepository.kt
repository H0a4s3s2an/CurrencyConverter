package com.currency.converter.ui.home

import com.currency.libpokemon.PokemonClientAPI
import com.currency.libpokemon.models.CurrencyListResponse

class MainRepository {
	
	val api = PokemonClientAPI.api
	
	suspend fun getCurrency(): CurrencyListResponse {
		return api.getCurrencyList("5353fac0db0a50467f1c2f0386653801630854ec", "json")
	}
}