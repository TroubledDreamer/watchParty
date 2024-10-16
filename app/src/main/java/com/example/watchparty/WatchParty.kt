package com.example.watchparty

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

//import java.net.URL

@Entity
data class WatchParty(
    @PrimaryKey(autoGenerate = true)
    val id : Long = 0,
    val name : String = "",
    val invite: String = "",
    val imageURL : String? = null,
    val videoURL : String? = null,
    var hostId : Long = 0,
    var accessType : String = "InviteOnly",
    var description : String? = "",
    val participants: List<User> = emptyList(),
    var createdAt : Date
)

