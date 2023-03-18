package com.example.randonphrasesaristidevs.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.randonphrasesaristidevs.model.QuoteModel
import com.example.randonphrasesaristidevs.model.QuoteProvider

class QuoteViewModel : ViewModel() {

    val quoteModel = MutableLiveData<QuoteModel>()

    fun randomQuote(){
        val currentQuote: QuoteModel = QuoteProvider.random()
        quoteModel.postValue(currentQuote)
    }
}