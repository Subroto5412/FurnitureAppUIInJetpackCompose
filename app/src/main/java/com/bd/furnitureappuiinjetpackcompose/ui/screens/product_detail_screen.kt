package com.bd.furnitureappuiinjetpackcompose.ui.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.bd.furnitureappuiinjetpackcompose.R
import com.bd.furnitureappuiinjetpackcompose.components.SpacerHeight
import com.bd.furnitureappuiinjetpackcompose.components.SpacerWidth
import com.bd.furnitureappuiinjetpackcompose.ui.navigation.Home
import com.bd.furnitureappuiinjetpackcompose.ui.theme.Background
import com.bd.furnitureappuiinjetpackcompose.ui.theme.Background_1
import com.bd.furnitureappuiinjetpackcompose.ui.theme.DarkGreen
import com.bd.furnitureappuiinjetpackcompose.ui.theme.DarkOrange
import com.bd.furnitureappuiinjetpackcompose.ui.theme.LightGray_1
import com.bd.furnitureappuiinjetpackcompose.ui.theme.TextColor_1

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
        Box(
            modifier = Modifier
                .padding(top = 230.dp)
                .fillMaxSize()
                .background(Color.White, RoundedCornerShape(16.dp))
        ) {
            LazyColumn(modifier = Modifier.padding(bottom = 70.dp)) {
                item {
                    ProductHeaderSection()
                    RatingRow()
                }

            }
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

@Composable
fun ProductHeaderSection() {

    var count by remember { mutableStateOf(0) }

    Column(
        modifier = Modifier
            .padding(20.dp)
            .fillMaxWidth()
    ) {
        Text(
            text = stringResource(id = R.string.product_name), style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.W400,
                color = TextColor_1
            )
        )
        SpacerHeight()
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = stringResource(id = R.string._599), style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.W600,
                    color = DarkOrange
                ),
                modifier = Modifier
                    .weight(1f)
                    .align(CenterVertically)
            )
            ProductCountButton(Icons.Default.Add) {
                if (count > 0)
                    count--
            }
            Text(
                text = "$count", modifier = Modifier
                    .padding(horizontal = 10.dp)
                    .align(CenterVertically)
            )
            ProductCountButton(Icons.Default.Add) {
                count++
            }
        }
    }
}

@Composable
fun ProductCountButton(
    imageVector: ImageVector,
    onClick: () -> Unit
) {

    TextButton(
        onClick = onClick,
        shape = RoundedCornerShape(8.dp),
        modifier = Modifier.size(35.dp),
        border = BorderStroke(2.dp, DarkOrange),
        elevation = ButtonDefaults.buttonElevation(0.dp)
    ) {
        Icon(imageVector, contentDescription = "", tint = DarkOrange)
    }
}

@Composable
fun RatingRow() {

    val personIcons = listOf(
        R.drawable.person_1,
        R.drawable.person_2,
        R.drawable.person_3,
        R.drawable.person_4
    )

    Box(
        modifier = Modifier
            .padding(horizontal = 20.dp, vertical = 10.dp)
            .background(Background_1, RoundedCornerShape(8.dp))
            .fillMaxWidth()
    ) {
        Row(
            modifier = Modifier.padding(20.dp)
        ) {
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Row {
                    repeat(5) {
                        Icon(
                            painter = painterResource(id = R.drawable.star),
                            contentDescription = "",
                            tint = Color.Unspecified
                        )
                    }
                    SpacerWidth()
                    Text(
                        text = "5.0", style = TextStyle(
                            fontSize = 12.sp,
                            fontWeight = FontWeight.W400,
                            color = TextColor_1
                        ),
                        modifier = Modifier.align(CenterVertically)
                    )
                }
                SpacerHeight()
                Row() {
                    Text(
                        text = stringResource(id = R.string._98_reviews),
                        style = TextStyle(
                            fontSize = 12.sp,
                            fontWeight = FontWeight.W400,
                            color = LightGray_1
                        ),
                    )
                    Icon(
                        imageVector = Icons.Default.KeyboardArrowRight,
                        contentDescription = "",
                        modifier =
                        Modifier
                            .size(16.dp)
                            .align(CenterVertically),
                        tint = LightGray_1
                    )
                }

            }
            Row {
                personIcons.forEachIndexed { index, i ->
                    Icon(
                        painter = painterResource(id = i), contentDescription = "",
                        tint = Color.Unspecified,
                        modifier = Modifier
                            .size(32.dp)
                            .offset(
                                x = if (index == 1) -(10.dp) else if (index == 2) -(20.dp) else if (index == 3) -(30.dp) else 0.dp,
                                y = 0.dp
                            )
                    )
                }
            }
        }
    }

}