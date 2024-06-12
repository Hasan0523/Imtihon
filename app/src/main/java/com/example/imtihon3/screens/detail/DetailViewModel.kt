package com.example.imtihon3.screens.detail

import com.example.imtihon3.database.Item
import com.example.imtihon3.screens.primary.PrimaryModel

class DetailViewModel(val model: PrimaryModel) {
    fun updateState(item: Item) {
        item.saved = !item.saved
        model.update(item)
    }
}