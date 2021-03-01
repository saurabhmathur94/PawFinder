/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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
    companion object {
        fun getPuppyList(): ArrayList<PuppyModel> {
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
