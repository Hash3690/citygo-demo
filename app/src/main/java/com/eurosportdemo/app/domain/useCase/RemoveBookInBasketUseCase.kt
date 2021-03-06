package com.eurosportdemo.app.domain.useCase

import com.eurosportdemo.app.domain.repository.BookRepository
import com.eurosportdemo.app.domain.model.Book
import javax.inject.Inject

class RemoveBookInBasketUseCase @Inject constructor(private val bookRepository: BookRepository) {

    var error = bookRepository.error

    fun removeBookInBasket(book: Book) = bookRepository.removeBookInBasket(book)
}