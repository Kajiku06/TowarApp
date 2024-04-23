package com.example32.towarapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var attractionAdapter: AttractionAdapter
    private lateinit var selectedCity: City

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val travelGuide = TravelGuide()
        val selectedCityName = intent.getStringExtra("SELECTED_CITY")
        if (selectedCityName != null) {
            selectedCity = travelGuide.cities.find { it.name == selectedCityName } ?: return

            attractionAdapter = AttractionAdapter(selectedCity.attractions)
            recyclerView.adapter = attractionAdapter
        }
    }
}

