package com.example.watchparty

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter

class WatchPartyListAdapter(context: Context, private val watchParties: ArrayList<WatchParty>) : BaseAdapter(){
    val context : Context
    val parties : ArrayList<WatchParty>

    init{
        this.context = context;
        this.parties = watchParties;
    }

    override fun getCount(): Int {
        return parties.size
    }

    override fun getItem(position: Int): Any {
        return parties[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view = View;

        if(convertView != null){
            view = convertView
        }else{
            view = LayoutInflater(this.context).inflate(R.layout.watch_party_list_item, parent, false)
        }
        val currrentSelectedParty = parties[position]
        val partyName = view.findViewById<TextView>(R.id.partyName)
        val partyDescription = view.findViewById<TextView>(R.id.partyDescription)
        val partyImage = view.findViewById<ImageView>(R.id.partyImage)
        val partyAccessType = view.findViewById<TextView>(R.id.partyAccessType)

        //add participants
        return view
    }
}
