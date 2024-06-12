package com.example.imtihon3.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface ItemDao {
    @Insert
    fun insert(item: Item)

    @Delete
    fun delete(item: Item)

    @Update
    fun update(item: Item)

    @Query("SELECT * FROM Books WHERE id = :id")
    fun get(id: Int): Item

    @Query("SELECT * FROM Books WHERE saved = 1")
    fun getSaved(): MutableList<Item>

    @Query("SELECT * FROM Books")
    fun getAll(): MutableList<Item>
}