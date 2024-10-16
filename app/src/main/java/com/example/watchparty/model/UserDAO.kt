package com.example.watchparty.model

import androidx.room.Dao
import com.example.watchparty.User
import kotlinx.coroutines.flow.Flow
import androidx.room.Query
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Update

@Dao
interface UserDAO {

    @Query("SELECT * FROM User")
    fun getAllUsers(): Flow<List<User>>

    @Query("SELECT * FROM User WHERE id = :id")
    fun getUser(id: Long): Flow<User>

    @Insert(onConflict = OnConflictStrategy.ABORT)
    suspend fun addUser(newUser: User)

    @Update
    fun update(user: User)

    @Query("DELETE FROM User WHERE id = :id")
    fun delete(id : Long)

}