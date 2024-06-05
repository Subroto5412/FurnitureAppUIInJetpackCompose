package com.bd.furnitureappuiinjetpackcompose.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.bd.furnitureappuiinjetpackcompose.R
import com.bd.furnitureappuiinjetpackcompose.components.AppIconComponent
import com.bd.furnitureappuiinjetpackcompose.components.LogoComponent
import com.bd.furnitureappuiinjetpackcompose.ui.theme.Background
import com.bd.furnitureappuiinjetpackcompose.ui.theme.LightGray_1

@Composable
fun HomeScreen(
    navHostController: NavHostController
){

    var text by remember { mutableStateOf("") }

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
            CustomTextField(text = text, onValueChange = {text = it})
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
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomTextField(
    text: String,
    modifier: Modifier = Modifier,
    onValueChange: (String) -> Unit
) {

    TextField(value = text, onValueChange = onValueChange,
        colors = TextFieldDefaults.textFieldColors(
            containerColor = Color.White,
            unfocusedIndicatorColor = Color.Transparent,
            focusedIndicatorColor = Color.Transparent
        ),
        placeholder = {
            Text(
                text = stringResource(id = R.string.placeholder), style = TextStyle(
                    fontSize = 15.sp,
                    fontWeight = FontWeight.W400,
                    color = LightGray_1
                )
            )
        },
        shape = RoundedCornerShape(8.dp),
        leadingIcon = {
            Icon(
                painter = painterResource(id = R.drawable.search),
                contentDescription = "",
                tint = LightGray_1
            )
        },
        modifier = modifier
            .padding(vertical = 20.dp)
            .fillMaxWidth()
            .border(1.dp, LightGray_1, RoundedCornerShape(8.dp)),
        keyboardOptions = KeyboardOptions(imeAction = ImeAction.Done)
        )
}