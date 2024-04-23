package com.example32.towarapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AttractionAdapter(
    private val attractions: List<Attraction>
) : RecyclerView.Adapter<AttractionAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_city_attraction, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val attraction = attractions[position]
        holder.bind(attraction)
    }

    override fun getItemCount(): Int = attractions.size

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val attractionNameTextView: TextView = view.findViewById(R.id.textAttractionName)
        private val attractionDescriptionTextView: TextView = view.findViewById(R.id.textDescription)

        fun bind(attraction: Attraction) {
            attractionNameTextView.text = attraction.name
            attractionDescriptionTextView.text = attraction.description
            //
        }
    }
}