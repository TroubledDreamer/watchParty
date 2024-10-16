package com.example.watchparty.model

import androidx.annotation.WorkerThread
import kotlinx.coroutines.flow.Flow

class WatchPartyRepository(private val watchPartyDao: WatchPartyDAO) {
    val allParties: Flow<List<?>> = watchPartyDao.getAllWatchParties()
    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun insert(watchParty: WatchParty) {
        watchPartyDao.createWatchParty(watchParty)
    }

    val allUsers: Flow<List<?>> = watchPartyDao.getAllUsers()
    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun insert(user: User) {
        watchPartyDao.addUser(user)
    }
}



