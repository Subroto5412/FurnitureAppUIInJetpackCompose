package com.bd.furnitureappuiinjetpackcompose.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.bd.furnitureappuiinjetpackcompose.R
import com.bd.furnitureappuiinjetpackcompose.ui.navigation.Home
import com.bd.furnitureappuiinjetpackcompose.ui.theme.Background
import com.bd.furnitureappuiinjetpackcompose.ui.theme.DarkGreen

@Composable
fun ProductDetailScreen(
    navHostController: NavHostController
) {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.product_four), contentDescription = "",
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp),
            contentScale = ContentScale.FillWidth
        )
        HeaderSection {
            navHostController.navigateUp()
        }
    }

}

@Composable
fun HeaderSection(
    onBack: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {

        IconButton(onClick = onBack) {
            Icon(Icons.Default.ArrowBack, contentDescription = "", tint = Color.Black)
        }

        Icon(
            painter = painterResource(id = R.drawable.share),
            contentDescription = "",
            tint = Color.Unspecified
        )
    }

}