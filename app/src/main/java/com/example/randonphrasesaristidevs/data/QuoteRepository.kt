package com.example.randonphrasesaristidevs.data

import com.example.randonphrasesaristidevs.data.model.QuoteModel
import com.example.randonphrasesaristidevs.data.model.QuoteProvider
import com.example.randonphrasesaristidevs.data.network.QuoteService

class QuoteRepository {

    private val api = QuoteService()

    suspend fun getAllQuotes():List<QuoteModel>{
        val response: List<QuoteModel> = api.getQuotes()
        QuoteProvider.quotes = response
        return response
    }
}