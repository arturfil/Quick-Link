package com.arturofilio.quicklink

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.RecyclerView

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
    }

    //cards_recycler.layoutManager = GridLayoutManager(this, 2)
}

// class cards_adapter
/*class CardAdapter(private val cards: List<String>): RecyclerView.Adapter<CardAdapter.ViewHolder>() {

    class ViewHolder(val card)

}*/

// class squareCardView
