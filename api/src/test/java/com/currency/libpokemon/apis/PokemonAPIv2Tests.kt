package com.currency.libpokemon.apis

import com.currency.libpokemon.PokemonClientAPI
import kotlinx.coroutines.runBlocking
import org.junit.Assert.assertNotNull
import org.junit.Test

class PokemonAPIv2Tests {
	
	val api = PokemonClientAPI.api
	
	@Test
	fun pokemonListTest() = runBlocking {
		val response = api.getConversionRates("5353fac0db0a50467f1c2f0386653801630854ec", "EUR", "GBP", 10.00, "json")
		assertNotNull(response.body())
	}
	
	@Test
	fun currencyList() = runBlocking {
		val response = api.getCurrencyList("5353fac0db0a50467f1c2f0386653801630854ec", "json")
		assertNotNull(response)
	}
}