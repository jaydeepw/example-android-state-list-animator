package com.jaydeepw.statelistanimator

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

/**
 * TODO: remove item_layout.xml
 */
class GridViewAdapter(private val items: List<String>) :
    RecyclerView.Adapter<GridViewAdapter.ViewHolder>() {

    // ViewHolder class to represent each item in the RecyclerView
    inner class ViewHolder(private val itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        val itemText: TextView = itemView.findViewById(R.id.tvItemDetails)
    }

    // Inflate the item layout and create the ViewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_item_selector_restaurant_image_v2, parent, false)
        return ViewHolder(view)
    }

    // Bind data to the views in each item
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val dataString = items[position]
        holder.itemText.text = dataString
    }

    // Return the total number of items
    override fun getItemCount(): Int {
        return items.size
    }
}