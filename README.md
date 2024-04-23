# Travel Guide App

## Overview

The "Travel Guide" app allows users to browse information about cities and their tourist attractions. Users can search through a list of cities, select a specific city, and view available attractions.

## Project Structure

The project consists of the following main components:

### Data Models
- `City.kt`: Represents a single city with a list of its attractions.
- `Attraction.kt`: Represents a single tourist attraction with a name, description, and image resource ID.
- `TravelGuide.kt`: Contains sample data about cities and attractions.

### RecyclerView Adapters
- `CityAdapter.kt`: RecyclerView adapter handling the display of a list of cities in `MainMainSelectionActivity`.
- `AttractionAdapter.kt`: RecyclerView adapter handling the display of a list of attractions in `MainActivity`.

### Activities
- `MainMainSelectionActivity.kt`: Main activity of the application, displaying the list of cities and handling city selection and filtering.
- `MainActivity.kt`: Activity for displaying attractions for the selected city.

### XML Layouts
- `mainmainselectionactivity.xml`: Layout for `MainMainSelectionActivity` with `Toolbar`, `SearchView`, and `RecyclerView`.
- `activity_main.xml`: Layout for `MainActivity` with `Toolbar` and `RecyclerView`.
- `attraction_item.xml`: Layout for a single attraction item in `RecyclerView`.

## Usage Instructions

### Running the App
- Upon launching the app, the user will be directed to `MainMainSelectionActivity`, where they will see a list of cities.
- The user can type a city name in the `SearchView` to filter the list of cities.

### Selecting a City
- After selecting a city from the list in `MainMainSelectionActivity`, the user will be directed to `MainActivity`, where they will see a list of attractions for the selected city.

### Browsing Attractions
- In `MainActivity`, the user can scroll through the list of attractions and read their names and descriptions.

## Requirements

- Android 5.0 (Lollipop) or newer.
- Internet access (optional, depending on the application's needs).

## Authors

- Kazimierz Kiper
  
