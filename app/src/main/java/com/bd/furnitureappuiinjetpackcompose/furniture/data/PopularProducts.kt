package com.bd.furnitureappuiinjetpackcompose.furniture.data

import android.icu.text.CaseMap.Title
import androidx.annotation.DrawableRes
import com.bd.furnitureappuiinjetpackcompose.R

data class PopularProducts(
    val id: Int,
    val title: String,
    @DrawableRes val image: Int,
    val price: String
)

val popularProductList = listOf(
    PopularProducts(
        1,
        "Sverom chair",
        R.drawable.product_one,
        "$400"
    ),
    PopularProducts(
        2,
        "Norrviken chair and table",
        R.drawable.product_two,
        "$999"
    ),
    PopularProducts(
        3,
        "Ektorp sofa",
        R.drawable.product_three,
        "$800"
    ),
    PopularProducts(
        4,
        "Jan Sflanaganvik sofa",
        R.drawable.product_four,
        "$700"
    ),
    PopularProducts(
        5,
        "Sverom chair",
        R.drawable.product_one,
        "$400"
    ),
    PopularProducts(
        6,
        "Norrviken chair and table",
        R.drawable.product_two,
        "$999"
    ),
    PopularProducts(
        7,
        "Ektorp sofa",
        R.drawable.product_three,
        "$800"
    ),
    PopularProducts(
        8,
        "Jan Sflanaganvik sofa",
        R.drawable.product_four,
        "$700"
    )
)