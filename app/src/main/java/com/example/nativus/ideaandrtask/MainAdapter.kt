package com.example.nativus.ideaandrtask

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.card_row.view.*

class MainAdapter (val homeFeed: Array<User>):  RecyclerView.Adapter<CustomViewHolder>() {

val titles= listOf("one","two","three")
    override fun getItemCount(): Int {
        return homeFeed.size

//        return homeFeed.
//        return 3
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder{
        val layoutInflater = LayoutInflater.from(parent.context)
        val cellForRow=layoutInflater.inflate(R.layout.card_row,parent,false)
        return CustomViewHolder(cellForRow)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
//        val card=homeFeed.users[position]
        val card=homeFeed[position]

        holder.view.card_user_id.text=card.id
        holder.view.card_user_id.text=card.id
        holder.view.card_user_name.text=card.name
        holder.view.card_user_age.text=card.age.toString()
        holder.view.card_user_balance.text=card.balance



//        val title=titles[position]
      //  holder.view.card_user_name?.text=titles[position]

    }

}

class CustomViewHolder(val view: View) : RecyclerView.ViewHolder(view) {

}