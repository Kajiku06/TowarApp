package com.example32.towarapp

data class Attraction(
    val name: String,
    val description: String,
    val image: String
)

data class City(
    val name: String,
    val attractions: List<Attraction>
)

class TravelGuide {
    val cities = listOf(
        City(
            "Paris",
            listOf(
                Attraction(
                    "Eiffel Tower",
                    "The Eiffel Tower is a wrought-iron lattice tower on the Champ de Mars in Paris, France.",
                    "eiffel_tower.jpg"
                ),
                Attraction(
                    "Louvre Museum",
                    "The Louvre Museum is the world's largest art museum and a historic monument in Paris, France.",
                    "louvre_museum.jpg"
                )
            )
        ),
        City(
            "Rome",
            listOf(
                Attraction(
                    "Colosseum",
                    "The Colosseum is an ancient amphitheater in Rome, Italy.",
                    "colosseum.jpg"
                ),
                Attraction(
                    "Pantheon",
                    "The Pantheon is a former Roman temple, now a church, in Rome, Italy.",
                    "pantheon.jpg"
                )
            )
        ),
        City(
            "London",
            listOf(
                Attraction(
                    "Big Ben",
                    "Big Ben is the nickname for the Great Bell of the clock at the north end of the Palace of Westminster in London, England.",
                    "big_ben.jpg"
                ),
                Attraction(
                    "Tower Bridge",
                    "Tower Bridge is a combined bascule and suspension bridge in London, England.",
                    "tower_bridge.jpg"
                )
            )
        ),
        City(
            "Berlin",
            listOf(
                Attraction(
                    "Brandenburg Gate",
                    "The Brandenburg Gate is an 18th-century neoclassical monument in Berlin, Germany.",
                    "brandenburg_gate.jpg"
                ),
                Attraction(
                    "Berlin Wall",
                    "The Berlin Wall was a guarded concrete barrier that divided Berlin from 1961 to 1989.",
                    "berlin_wall.jpg"
                )
            )
        ),
        City(
            "Tokyo",
            listOf(
                Attraction(
                    "Tokyo Tower",
                    "Tokyo Tower is a communications and observation tower in Tokyo, Japan.",
                    "tokyo_tower.jpg"
                ),
                Attraction(
                    "Senso-ji Temple",
                    "Senso-ji Temple is an ancient Buddhist temple located in Asakusa, Tokyo, Japan.",
                    "sensoji_temple.jpg"
                )
            )
        )
    )
}