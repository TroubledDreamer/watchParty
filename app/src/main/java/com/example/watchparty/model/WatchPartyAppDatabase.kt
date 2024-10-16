package com.example.watchparty.model

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.watchparty.User
import com.example.watchparty.WatchParty
import android.content.Context
import androidx.room.Room
import androidx.sqlite.db.SupportSQLiteDatabase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Database(entities = [WatchParty::class, User::class], version = 1, exportSchema = false)
abstract class WatchPartyAppDatabase : RoomDatabase() {
    abstract fun watchPartyDao() : WatchPartyDAO

    companion object{
        @Volatile
        private var INSTANCE: WatchPartyAppDatabase? = null

        fun getDatabase(context: Context, scope: CoroutineScope): WatchPartyAppDatabase {
            // if the INSTANCE is not null, then return it,
            // if it is, then create the database
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    WatchPartyAppDatabase::class.java,
                    "watch_party_database"
                )
//                    .addCallback(WatchPartyDatabaseCallback(scope))
                    .build()
                INSTANCE = instance
                // return instance
                instance
            }
        }
    }

//   iuju




}