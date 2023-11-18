package com.example.almatyapp.data

import com.example.almatyapp.R
import com.example.almatyapp.model.Recommendation

object LocalRecomendationDataProvider {

    val recommendations: List<Recommendation> = listOf(
        // Coffee Shops
        Recommendation(
            id = 1,
            name = "Kafemat",
            category = "Coffee Shop",
            address = "Panfilov Street, Almaty, Kazakhstan",
            description = "A cozy coffee shop offering a variety of coffee drinks and pastries. A perfect spot to relax and enjoy a cup of coffee.",
            imageResourceId = R.drawable.kafemat
        ),
        Recommendation(
            id = 2,
            name = "Fika Espresso Bar",
            category = "Coffee Shop",
            address = "Zhibek Zholy, Almaty, Kazakhstan",
            description = "Fika Espresso Bar is known for its specialty coffee and inviting atmosphere. Great for coffee enthusiasts and those looking for a comfortable place to work.",
            imageResourceId = R.drawable.fika_espresso_bar
        ),
        Recommendation(
            id = 3,
            name = "Bike Coffee",
            category = "Coffee Shop",
            address = "Abylay Khan Avenue, Almaty, Kazakhstan",
            description = "Bike Coffee combines a love for cycling and coffee. It's a unique coffee shop with a bicycle-themed interior and delicious coffee options.",
            imageResourceId = R.drawable.bike_coffee
        ),

        // Restaurants
        Recommendation(
            id = 4,
            name = "Adriatico Italian Restaurant",
            category = "Restaurant",
            address = "Tole Bi Street, Almaty, Kazakhstan",
            description = "Adriatico offers a delightful dining experience with a menu featuring authentic Italian dishes. Perfect for a romantic dinner or a family celebration.",
            imageResourceId = R.drawable.adriatico
        ),
        Recommendation(
            id = 5,
            name = "Madlen Restaurant",
            category = "Restaurant",
            address = "Satpayev Street, Almaty, Kazakhstan",
            description = "Madlen Restaurant is known for its diverse menu, offering a fusion of flavors. A great place for those who enjoy exploring different cuisines.",
            imageResourceId = R.drawable.madlen
        ),
        Recommendation(
            id = 6,
            name = "Kazakh Nomad",
            category = "Restaurant",
            address = "Kazakhfilm Microdistrict, Almaty, Kazakhstan",
            description = "Kazakh Nomad celebrates traditional Kazakh cuisine with a modern twist. Experience the rich flavors of Kazakh dishes in a welcoming ambiance.",
            imageResourceId = R.drawable.kazakh_nomad
        ),

        // Kid-friendly Places
        Recommendation(
            id = 7,
            name = "Almaty Zoo",
            category = "Kid-friendly Place",
            address = "Gornaya St, Almaty, Kazakhstan",
            description = "The Almaty Zoo is a popular destination for families. It features a variety of animals and educational exhibits, providing a fun and learning experience for kids.",
            imageResourceId = R.drawable.almaty_zoo
        ),
        Recommendation(
            id = 8,
            name = "Almaty Central Park Playground",
            category = "Kid-friendly Place",
            address = "Abay Avenue, Almaty, Kazakhstan",
            description = "The Central Park Playground offers a safe and entertaining space for children to play. It's a favorite spot for families looking for outdoor fun.",
            imageResourceId = R.drawable.central_park_playground
        ),
        Recommendation(
            id = 9,
            name = "Gorky Park",
            category = "Kid-friendly Place",
            address = "Satpayev Street, Almaty, Kazakhstan",
            description = "Gorky Park is a spacious park with playgrounds, green areas, and recreational facilities. Ideal for a family day out with plenty of activities for children.",
            imageResourceId = R.drawable.gorky_park
        ),

        // Parks
        Recommendation(
            id = 10,
            name = "First President Park",
            category = "Park",
            address = "Dostyk Avenue, Almaty, Kazakhstan",
            description = "First President Park is a beautifully landscaped park with walking paths, gardens, and monuments. A serene place to enjoy nature in the heart of the city.",
            imageResourceId = R.drawable.first_president_park
        ),
        Recommendation(
            id = 11,
            name = "Panfilov Park",
            category = "Park",
            address = "Panfilov Street, Almaty, Kazakhstan",
            description = "Panfilov Park is a central park with historical monuments, shady areas, and benches. A perfect place for a leisurely stroll or a quiet afternoon.",
            imageResourceId = R.drawable.panfilov_park
        ),
        Recommendation(
            id = 12,
            name = "Botanical Garden",
            category = "Park",
            address = "Prospect Al-Farabi, Almaty, Kazakhstan",
            description = "The Botanical Garden showcases a diverse collection of plants and flowers. It's a tranquil oasis for nature lovers and those seeking a peaceful escape.",
            imageResourceId = R.drawable.botanical_garden
        ),

        // Shopping Centers
        Recommendation(
            id = 13,
            name = "Mega Park",
            category = "Shopping Center",
            address = "Al-Farabi Avenue, Almaty, Kazakhstan",
            description = "Mega Park is a large shopping and entertainment complex with a variety of stores, restaurants, and entertainment options. A one-stop destination for shopping and fun.",
            imageResourceId = R.drawable.mega_park
        ),
        Recommendation(
            id = 14,
            name = "Dostyk Plaza",
            category = "Shopping Center",
            address = "Dostyk Avenue, Almaty, Kazakhstan",
            description = "Dostyk Plaza is a premium shopping center offering luxury brands, dining, and entertainment. A sophisticated destination for those who enjoy upscale shopping.",
            imageResourceId = R.drawable.dostyk_plaza
        ),
        Recommendation(
            id = 15,
            name = "Esentai Mall",
            category = "Shopping Center",
            address = "Al-Farabi Avenue, Almaty, Kazakhstan",
            description = "Esentai Mall is a modern shopping mall with a diverse range of stores, a food court, and entertainment options. A popular choice for shopping enthusiasts.",
            imageResourceId = R.drawable.esentai_mall
        )
    )
}
