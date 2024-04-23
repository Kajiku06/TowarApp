package com.example32.towarapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CityAdapter(
    private val cities: List<City>,
    private val onCityClick: (City) -> Unit
) : RecyclerView.Adapter<CityAdapter.ViewHolder>() {

    private val filteredCities = mutableListOf<City>()

    init {
        filteredCities.addAll(cities)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(android.R.layout.simple_list_item_1, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val city = filteredCities[position]
        holder.bind(city)
        holder.itemView.setOnClickListener {
            onCityClick(city)
        }
    }

    override fun getItemCount(): Int = filteredCities.size

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(city: City) {
            itemView.findViewById<TextView>(android.R.id.text1).text = city.name
        }
    }

    fun filter(query: String?) {
        filteredCities.clear()
        if (query.isNullOrEmpty()) {
            filteredCities.addAll(cities)
        } else {
            filteredCities.addAll(cities.filter { it.name.contains(query, true) })
        }
        notifyDataSetChanged()
    }
}