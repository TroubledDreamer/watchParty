package com.example.watchparty

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User(
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    val name: String,
    val profilePicURL: String,
    val email: String,
    val isHost: Boolean,
    val password: String )
