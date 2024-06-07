package com.example.spinner_page

import android.graphics.fonts.FontStyle
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun PayBill(numberOfPeople: Int, reset: Boolean = false) : Int {
    var chosenNumber by remember { mutableIntStateOf((1..numberOfPeople).random()) }
    if (reset) {
        chosenNumber = (1..numberOfPeople).random()
    }
    Column {
        colourChoose(chosenNumber)
    }
    return chosenNumber
}

@Composable
fun colourChoose(num: Int) {
    when (num) {
        1 -> Text(text = "Blue must pay the Bill", color = Color.White, fontWeight = FontWeight.Bold , fontSize = 20.sp)
        2 -> Text(text = "Red must pay the Bill", color = Color.White, fontWeight = FontWeight.Bold, fontSize = 20.sp)
        3 -> Text(text = "Green must pay the Bill", color = Color.Black, fontWeight = FontWeight.Bold, fontSize = 20.sp)
        4 -> Text(text = "Orange must pay the Bill", color = Color.White, fontWeight = FontWeight.Bold, fontSize = 20.sp)
        5 -> Text(text = "Purple must pay the Bill", color = Color.White, fontWeight = FontWeight.Bold, fontSize = 20.sp)
        6 -> Text(text = "Yellow  must pay the Bill", color = Color.Black, fontWeight = FontWeight.Bold, fontSize = 20.sp)
        7 -> Text(text = "Pink must pay the Bill", color = Color.Black, fontWeight = FontWeight.Bold, fontSize = 20.sp)
        8 -> Text(text = "Gold must pay the Bill", color = Color.Black, fontWeight = FontWeight.Bold, fontSize = 20.sp)
    }
}

@Preview
@Composable
fun DefaultPreview() {
    PayBill(numberOfPeople = 8)
}