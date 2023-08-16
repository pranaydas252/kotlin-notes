package com.pranaydas.noteapplication.data.data_source

import androidx.lifecycle.LiveData
import androidx.room.*
import com.pranaydas.noteapplication.domain.models.Note

@Dao
interface NotesDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(note : Note)

    @Update
    suspend fun update(note: Note)

    @Delete
    suspend fun delete(note: Note)

    @Query("Select * from notesTable order by id ASC")
    fun getAllNotes(): LiveData<List<Note>>


}