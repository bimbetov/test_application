package com.example.beibarys.test_application.repository

import com.example.beibarys.test_application.model.Mosque

interface MosqueRepository {
    fun getMosque() : List<Mosque>
}