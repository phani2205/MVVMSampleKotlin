package com.example.mvvmsample.data.network.reponses

import com.example.mvvmsample.data.db.entities.User

data class AuthResponse(
    val isSuccessful : Boolean?,
    val messages : String?,
    val user : User?
)