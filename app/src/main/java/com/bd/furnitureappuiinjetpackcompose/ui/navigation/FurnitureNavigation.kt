package com.bd.furnitureappuiinjetpackcompose.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.bd.furnitureappuiinjetpackcompose.ui.screens.HomeScreen

@Composable
fun FurnitureNavigation() {
    val navHostController = rememberNavController()
    NavHost(navController = navHostController, startDestination = Home){
        composable(Home){
            HomeScreen(navHostController)
        }
    }

}

const val Home = "home_screen"