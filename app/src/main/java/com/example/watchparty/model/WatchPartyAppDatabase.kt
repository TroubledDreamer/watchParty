package com.example.watchparty.model

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.watchparty.User
import com.example.watchparty.WatchParty

@Database(entities = [WatchParty::class, User::class], version = 1, exportSchema = false)
abstract class WatchPartyAppDatabase : RoomDatabase() {
    companion object{
        const val DATABASE_NAME = "WatchParty.db"
    }

    abstract fun watchPartyDao() : WatchPartyDAO
    abstract fun userDao() : UserDAO

}