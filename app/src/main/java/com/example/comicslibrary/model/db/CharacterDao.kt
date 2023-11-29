package com.example.comicslibrary.model.db

import androidx.room.*
import com.example.comicslibrary.model.db.Constants.CHARACTER_TABLE
import kotlinx.coroutines.flow.Flow

@Dao
interface CharacterDao {

    @Query("SELECT * FROM $CHARACTER_TABLE ORDER BY id ASC")
    fun getCharacters(): Flow<List<DbCharacter>>

    @Query("SELECT * FROM $CHARACTER_TABLE WHERE id = :characterId")
    fun getCharacter(characterId: Int): Flow<DbCharacter>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun addCharacter(character: DbCharacter)

    @Update
    fun updateCharacter(character: DbCharacter)

    @Delete
    fun deleteCharacter(character: DbCharacter)

}