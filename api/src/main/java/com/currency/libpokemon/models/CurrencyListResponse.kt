package com.currency.libpokemon.models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CurrencyListResponse(
    @Json(name = "currencies")
    val currencies: Currencies,
    @Json(name = "status")
    val status: String
) {
    @JsonClass(generateAdapter = true)
    data class Currencies(
        @Json(name = "AUD")
        val australianDollar: String,
        @Json(name = "BGN")
        val bGN: String,
        @Json(name = "PKR")
        val pakistanRupee: String,
        @Json(name = "EUR")
        val euro: String,
        @Json(name = "GBP")
        val pound: String,
        @Json(name = "USD")
        val usDollar: String
    )
}