package com.example.androiddevchallenge.model

import androidx.annotation.DrawableRes
import com.example.androiddevchallenge.R

data class PuppyModel(
    val name: String,
    val gender: String,
    val age: String,
    val breed: String,
    val tagline: String,
    val description: Int,
    val location: String,
    @DrawableRes val image: Int
) {
    companion object{
        fun getPuppyList(): ArrayList<PuppyModel>{
            return arrayListOf(
                PuppyModel(
                    "Tuffy",
                    "Male",
                    "Puppy",
                    "Samoyed",
                    "Fluffy like a cloud",
                    R.string.lorem_ipsum,
                    "Koramangala",
                    R.drawable.samoyed
                ),
                PuppyModel(
                    "Milo",
                    "Female",
                    "Puppy",
                    "Beagle",
                    "Always up for a treat",
                    R.string.lorem_ipsum,
                    "HSR Layout",
                    R.drawable.beagle
                ),
                PuppyModel(
                    "Kramer",
                    "Male",
                    "Puppy",
                    "Golden Retriever",
                    "11/10 a good Pupper",
                    R.string.lorem_ipsum,
                    "MG Road",
                    R.drawable.golden
                ),
                PuppyModel(
                    "Millie",
                    "Female",
                    "Adult",
                    "Bernese Mountain",
                    "Best hiking partner",
                    R.string.lorem_ipsum,
                    "Church Street",
                    R.drawable.bernese_mountain
                ),
                PuppyModel(
                    "Max",
                    "Male",
                    "Adult",
                    "Labrador",
                    "Pawsome Babysitter",
                    R.string.lorem_ipsum,
                    "Indiranagar",
                    R.drawable.labrador
                ),
                PuppyModel(
                    "Shibu",
                    "Female",
                    "Adult",
                    "Akita",
                    "Loves playing fetch",
                    R.string.lorem_ipsum,
                    "Whitefield",
                    R.drawable.akita
                ),
            )
        }
    }
}
