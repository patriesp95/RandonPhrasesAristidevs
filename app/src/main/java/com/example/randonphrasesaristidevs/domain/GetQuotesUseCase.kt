package com.example.randonphrasesaristidevs.domain

import com.example.randonphrasesaristidevs.data.QuoteRepository
import com.example.randonphrasesaristidevs.data.model.QuoteModel

class GetQuotesUseCase {

    private val repository = QuoteRepository()

    suspend operator fun invoke():List<QuoteModel>? = repository.getAllQuotes()

}