package com.example.mvvmsample.data.db.entities

import androidx.room.Entity
import androidx.room.PrimaryKey


/*
    1. Data class will have a copy method,which allows to clone the value of current class and creates a new class
    2. data class will have hashCode methods overridden
    3.
 */

const val CURRENT_USER_ID = 0

@Entity
data class User(
    var id: Int? = null,
    var name: String? = null,
    var email: String? = null,
    var password: String? = null,
    var email_verified_at: String? = null,
    var created_at: String? = null,
    var updated_at: String? = null
){
    @PrimaryKey(autoGenerate = false)
    var uid : Int = CURRENT_USER_ID
}