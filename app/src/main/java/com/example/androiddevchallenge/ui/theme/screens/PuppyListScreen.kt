package com.example.androiddevchallenge.ui.theme.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.androiddevchallenge.model.PuppyModel
import com.example.androiddevchallenge.ui.theme.components.MainHeader
import com.example.androiddevchallenge.ui.theme.components.PuppyCard
import com.example.androiddevchallenge.ui.theme.grey_base

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun PuppyListScreen(navController: NavHostController){
    val puppys = PuppyModel.getPuppyList().plus(PuppyModel.getPuppyList())
    Surface(color = grey_base ) {
        Column {
            MainHeader()
            LazyVerticalGrid(
                cells = GridCells.Fixed(1),
                contentPadding = PaddingValues(16.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                itemsIndexed(puppys) {
                    index, pupppy ->
                    PuppyCard(pupppy,navController,index)
                }
            }

        }
        
    }

}