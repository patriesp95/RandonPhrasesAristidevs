package com.example.randonphrasesaristidevs.data.network

import com.example.randonphrasesaristidevs.data.model.QuoteModel
import retrofit2.Response
import retrofit2.http.GET

interface QuoteApiClient {
    @GET("/.json")
    suspend fun getAllQuotes(): Response<List<QuoteModel>>
}