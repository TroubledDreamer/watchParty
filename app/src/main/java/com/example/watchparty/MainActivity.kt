package com.example.watchparty

import android.os.Bundle
import androidx.fragment.app.FragmentActivity

/**
 * Loads [MainFragment].
 */
class MainActivity : FragmentActivity(){
    val parties = ArrayList<WatchParty>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                .replace(R.id.main_browse_fragment, MainFragment())
                .commitNow()
        }
        //add parties to list upon creation if they are public or the user is the host
        val adapter = WatchPartyListAdapter(this@MainActivity, parties)
        val listView = findViewById<ListView>(R.id.party_list)
        listView.adapter = adapter
    }
}