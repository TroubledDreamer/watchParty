package com.example.watchparty.model

import androidx.room.Dao
import com.example.watchparty.WatchParty
import kotlinx.coroutines.flow.Flow
import androidx.room.Query
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Update

@Dao
interface WatchPartyDAO {

    @Query("SELECT * FROM WatchParty ORDER BY createdAt DESC")
    fun getAllWatchParties(): Flow<List<WatchParty>>

    @Query("SELECT * FROM WatchParty WHERE id = :id")
    fun getWatchParty(id: Long): Flow<WatchParty>

    @Insert(onConflict = OnConflictStrategy.ABORT)
    suspend fun createWatchParty(watchParty: WatchParty)

    @Update
    fun update(watchParty: WatchParty)

    @Query("DELETE FROM WatchParty WHERE id = :id")
    fun delete(id : Long)

}