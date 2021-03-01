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
package com.example.androiddevchallenge.ui.theme.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.androiddevchallenge.model.PuppyModel
import com.example.androiddevchallenge.ui.theme.components.PuppyDetailCard
import com.example.androiddevchallenge.ui.theme.grey_base

@Composable
fun DetailScreen(navController: NavHostController, index: String = "0") {
    val puppy = PuppyModel.getPuppyList().plus(PuppyModel.getPuppyList())[index.toInt()]
    Surface(
        color = grey_base,
        modifier = Modifier.fillMaxHeight()
    ) {
        Column() {
            PuppyDetailCard(puppy = puppy)
        }
    }
}
