package com.example.randonphrasesaristidevs.domain

import com.example.randonphrasesaristidevs.data.QuoteRepository
import com.example.randonphrasesaristidevs.data.model.QuoteModel
import com.example.randonphrasesaristidevs.data.model.QuoteProvider

class GetRandomQuoteUseCase {

    operator fun invoke(): QuoteModel?{
        val quotes = QuoteProvider.quotes
        if(!quotes.isNullOrEmpty()){
            val randomNumber = (quotes.indices).random()
            return quotes[randomNumber]
        }
        return null
    }
}