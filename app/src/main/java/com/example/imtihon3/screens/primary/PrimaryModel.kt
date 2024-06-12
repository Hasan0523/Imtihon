package com.example.imtihon3.screens.primary

import com.example.imtihon3.database.AppDatabase
import com.example.imtihon3.database.Item

class PrimaryModel(val db: AppDatabase) {
    fun getAllBooks() = db.getBookDao().getAll()
    fun getSavedBooks() = db.getBookDao().getSaved()
    fun update(item: Item) = db.getBookDao().update(item)


}