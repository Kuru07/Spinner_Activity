package com.example.spinner_page

import android.graphics.Color
import android.graphics.Paint.Style
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import kotlin.random.Random

@Composable
fun threePerson():Int{
    val randomNumber= (1..3).random()
    Column {
        colourChoose(num = randomNumber)
        }
    return randomNumber
}
@Composable
fun fourPerson():Int{
    val randomNumber= (1..4).random()
    Column {
        colourChoose(num = randomNumber)
    }
    return randomNumber
}
@Composable
fun fivePerson():Int{
    val randomNumber= (1..5).random()
    Column {
        colourChoose(num = randomNumber)
    }
    return randomNumber
}
@Composable
fun sixPerson():Int{
    val randomNumber= (1..6).random()
    Column {
        colourChoose(num = randomNumber)
    }
    return randomNumber
}
@Composable
fun sevenPerson():Int{
    val randomNumber= (1..7).random()
    Column {
        colourChoose(num = randomNumber)
    }
    return randomNumber
}
@Composable
fun eightPerson():Int{
    val randomNumber= (1..8).random()
    Column {
        colourChoose(num = randomNumber)
    }
    return randomNumber
}

@Composable
fun colourChoose(num:Int){
    when(num){
        1 -> Text(text = "Blue must pay the Bill", color = androidx.compose.ui.graphics.Color.Black,fontWeight = FontWeight.Bold)
        2 -> Text(text = "Red must pay the Bill", color = androidx.compose.ui.graphics.Color.Black,fontWeight = FontWeight.Bold)
        3 -> Text(text = "Green must pay the Bill", color = androidx.compose.ui.graphics.Color.Black,fontWeight = FontWeight.Bold)
        4 -> Text(text = "Orange must pay the Bill", color = androidx.compose.ui.graphics.Color.Black,fontWeight = FontWeight.Bold)
        5 -> Text(text = "Purple must pay the Bill", color = androidx.compose.ui.graphics.Color.Black,fontWeight = FontWeight.Bold)
        6 -> Text(text = "Yellow  must pay the Bill", color = androidx.compose.ui.graphics.Color.Black,fontWeight = FontWeight.Bold)
        7 -> Text(text = "Pink must pay the Bill", color = androidx.compose.ui.graphics.Color.Black,fontWeight = FontWeight.Bold)
        8 -> Text(text = "Gold must pay the Bill", color = androidx.compose.ui.graphics.Color.Black,fontWeight = FontWeight.Bold)
    }
}