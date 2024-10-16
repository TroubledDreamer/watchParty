package com.example.watchparty

import android.app.Application
import com.example.watchparty.model.WatchPartyAppDatabase
import com.example.watchparty.model.WatchPartyRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob

class WatchPartyApplication : Application() {
    val applicationScope = CoroutineScope(SupervisorJob())

    val database by lazy { WatchPartyAppDatabase.getDatabase(this, applicationScope) }
    val repository by lazy { WatchPartyRepository(database.watchPartyDao()) }
}



