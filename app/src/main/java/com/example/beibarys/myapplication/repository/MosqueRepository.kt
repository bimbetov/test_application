package com.example.beibarys.myapplication.repository

import com.example.beibarys.myapplication.model.Mosque

interface MosqueRepository {
    fun getMosque() : List<Mosque>
}