package com.example.imtihon3.screens.primary

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.navigation.NavController
import com.example.imtihon3.database.Item

class PrimaryViewModel(private val model: PrimaryModel, private val navController: NavController) {
    private val _books = MutableLiveData<List<Item>>()
    val books: LiveData<List<Item>> = _books

    private val _savedBooks = MutableLiveData<List<Item>>()
    val savedBooks: LiveData<List<Item>> = _savedBooks

    init {
        _books.value = model.getAllBooks()
        _savedBooks.value = model.getSavedBooks()
    }

    fun updateState(item: Item) {
        item.saved = !item.saved
        model.update(item)
        _books.value = model.getAllBooks()
        _savedBooks.value = model.getSavedBooks()
    }

    fun navigate(item: Item) {
        navController.navigate("detail_screen/${item.id}")
    }
}