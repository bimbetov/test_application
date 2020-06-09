package com.example.beibarys.test_application.model

class Mosque (
    private val name: String,
    private val description: String,
    val imageList: List<String>
) {
    fun getInfo(): String {
        return "$name"
    }

    fun getFullInfo(): String {
        return "$description"
    }

    fun getImage(): List<String>{
        return imageList
    }
}