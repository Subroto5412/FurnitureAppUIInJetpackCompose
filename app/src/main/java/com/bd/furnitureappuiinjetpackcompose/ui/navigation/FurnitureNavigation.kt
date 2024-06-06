package com.bd.furnitureappuiinjetpackcompose.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.bd.furnitureappuiinjetpackcompose.ui.screens.HomeScreen
import com.bd.furnitureappuiinjetpackcompose.ui.screens.ProductDetailScreen

@Composable
fun FurnitureNavigation() {
    val navHostController = rememberNavController()
    NavHost(navController = navHostController, startDestination = Home){
        composable(Home){
            HomeScreen(navHostController)
        }
        composable(ProductDetail){
            ProductDetailScreen(navHostController)
        }
    }

}

const val Home = "home_screen"
const val ProductDetail = "product_detail_screen"