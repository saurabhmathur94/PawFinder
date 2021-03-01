package com.example.androiddevchallenge

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.androiddevchallenge.ui.theme.screens.DetailScreen
import com.example.androiddevchallenge.ui.theme.screens.PuppyListScreen

    @Composable
    fun NavGraph(){
        val navController = rememberNavController()
        NavHost(navController = navController, startDestination = "puppyList"){
            composable("puppyList"){
                PuppyListScreen(navController)
            }

            composable("puppyDetail/{index}"){
              DetailScreen(
                  navController, index = it.arguments?.getString("index")!!
              )
            }

        }

    }
