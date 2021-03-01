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
fun DetailScreen(navController: NavHostController, index: String= "0")  {
    val puppy = PuppyModel.getPuppyList().plus(PuppyModel.getPuppyList())[index.toInt()]
    Surface(
    color = grey_base,
    modifier = Modifier.fillMaxHeight()
    ) {
        Column(
        ) {
             PuppyDetailCard(puppy = puppy)


        }

    }
}