package com.pranaydas.noteapplication.data.repository

import androidx.lifecycle.LiveData
import com.pranaydas.noteapplication.domain.models.Note
import com.pranaydas.noteapplication.data.data_source.NotesDao

class NoteRepository(private val notesDao: NotesDao) {


    val allNotes: LiveData<List<Note>> = notesDao.getAllNotes()

    suspend fun insert(note: Note) {
        notesDao.insert(note)
    }
    suspend fun delete(note: Note){
        notesDao.delete(note)
    }

    suspend fun update(note: Note){
        notesDao.update(note)
    }
}