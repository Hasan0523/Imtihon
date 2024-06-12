package com.example.imtihon3.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Books")
data class Item(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val name: String,
    val description: String,
    var saved: Boolean = false,
    val image: String
)