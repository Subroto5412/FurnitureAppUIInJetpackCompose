package com.bd.furnitureappuiinjetpackcompose.furniture.data

import androidx.annotation.DrawableRes

data class Rooms(
    val id: Int,
    @DrawableRes val image: Int,
    val title: String
)
