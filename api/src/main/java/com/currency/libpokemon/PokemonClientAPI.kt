package com.currency.libpokemon

import com.currency.libpokemon.apis.PokemonAPIv2
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object PokemonClientAPI {
	const val BASE_URL = "https://api.getgeoapi.com/api/v2/"
	
	private val retrofit by lazy {
		Retrofit.Builder()
			.baseUrl(BASE_URL)
			.addConverterFactory(MoshiConverterFactory.create())
			.build()
	}
	
	val api by lazy { retrofit.create(PokemonAPIv2::class.java) }
}