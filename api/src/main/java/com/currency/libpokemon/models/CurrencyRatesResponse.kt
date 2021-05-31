package com.currency.libpokemon.models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CurrencyRatesResponse(
    @Json(name = "amount")
    val amount: String,
    @Json(name = "base_currency_code")
    val baseCurrencyCode: String,
    @Json(name = "base_currency_name")
    val baseCurrencyName: String,
    @Json(name = "rates")
    val rates: Rates,
    @Json(name = "status")
    val status: String,
    @Json(name = "updated_date")
    val updatedDate: String
) {
    @JsonClass(generateAdapter = true)
    data class Rates(
        @Json(name = "GBP")
        val gBP: GBP
    ) {
        @JsonClass(generateAdapter = true)
        data class GBP(
            @Json(name = "currency_name")
            val currencyName: String,
            @Json(name = "rate")
            val rate: String,
            @Json(name = "rate_for_amount")
            val rateForAmount: String
        )
    }
}