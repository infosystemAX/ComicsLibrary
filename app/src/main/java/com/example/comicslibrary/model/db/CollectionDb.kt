package com.example.comicslibrary.model.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [DbCharacter::class], version = 1, exportSchema = false)
abstract class CollectionDb: RoomDatabase() {

    abstract fun characterDao(): CharacterDao



}
