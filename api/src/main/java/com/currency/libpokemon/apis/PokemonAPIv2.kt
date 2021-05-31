package com.currency.libpokemon.apis

import com.currency.libpokemon.models.CurrencyListResponse
import com.currency.libpokemon.models.CurrencyRatesResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface PokemonAPIv2 {
	@GET("currency/convert")
	suspend fun getConversionRates(
		@Query("api_key") key: String,
		@Query("from") from: String,
		@Query("to") to: String,
		@Query("amount") amount: Double,
		@Query("format") responseFormat: String
	): Response<CurrencyRatesResponse>
	
	@GET("currency/list")
	suspend fun getCurrencyList(
		@Query("api_key") key: String,
		@Query("format") responseFormat: String
	): CurrencyListResponse
}