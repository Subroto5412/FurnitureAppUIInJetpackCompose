package com.bd.furnitureappuiinjetpackcompose.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.bd.furnitureappuiinjetpackcompose.R
import com.bd.furnitureappuiinjetpackcompose.components.AppIconComponent
import com.bd.furnitureappuiinjetpackcompose.components.LogoComponent
import com.bd.furnitureappuiinjetpackcompose.ui.theme.Background

@Composable
fun HomeScreen(
    navHostController: NavHostController
){

//    var search by remember { mutableStateOf("") }
//    var selected by remember { mutableStateOf(1) }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Background)
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp)
        ) {
            Header()
        }
    }

}

@Composable
private fun Header() {

    Row(
        modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween
    ) {

        AppIconComponent(icon = R.drawable.menu)
        LogoComponent(size = 58.dp)
        AppIconComponent(icon = R.drawable.bag)

    }

}