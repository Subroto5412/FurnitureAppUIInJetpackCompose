package com.bd.furnitureappuiinjetpackcompose.furniture.data

import android.graphics.drawable.Icon
import androidx.annotation.DrawableRes

data class ShoppingBag(
    val id: Int,
    @DrawableRes val icon: Int,
    val title: String,
    val qty: Int,
    val price: String
)
