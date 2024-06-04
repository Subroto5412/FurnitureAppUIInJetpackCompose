package com.bd.furnitureappuiinjetpackcompose.furniture.data

import android.icu.text.CaseMap.Title
import androidx.annotation.DrawableRes

data class PopularProducts(
    val id: Int,
    val title: String,
    @DrawableRes val image: Int,
    val price: String
)
