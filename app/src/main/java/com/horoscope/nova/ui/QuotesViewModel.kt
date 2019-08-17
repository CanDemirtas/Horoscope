package com.horoscope.nova.ui

import androidx.lifecycle.ViewModel
import com.horoscope.nova.data.Quote
import com.horoscope.nova.data.QuoteRepository

// QuoteRepository dependency will again be passed in the
// constructor using dependency injection
class QuotesViewModel(private val quoteRepository: QuoteRepository)
    : ViewModel() {

    fun getQuotes() = quoteRepository.getQuotes()

    fun addQuote(quote: Quote) = quoteRepository.addQuote(quote)
}