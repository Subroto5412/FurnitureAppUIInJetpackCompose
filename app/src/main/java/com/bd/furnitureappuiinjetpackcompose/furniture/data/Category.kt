package com.bd.furnitureappuiinjetpackcompose.furniture.data

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color

data class Category(
    val id: Int,
    val title: String,
    @DrawableRes val image: Int,
    val color: Color
)