package com.example.spinner_page

import android.graphics.Color
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import kotlin.random.Random


val red ="Red";
val orange ="Orange";
val green = "Green";
val yellow = "Yellow";
val blue ="Blue";
val purple ="Purple";
val magneta = "Magneta";
val indigo = "Indigo";


@Composable
fun threePerson(){
    val randomNumber= (1..3).random()
    Column {
        Text(text = "3 persons")
        colourChoose(num = randomNumber)
        }
}
@Composable
fun fourPerson(){
    val randomNumber= (1..4).random()
    Column {
        Text(text = "4 persons")
        colourChoose(num = randomNumber)
    }
}
@Composable
fun fivePerson(){
    val randomNumber= (1..5).random()
    Column {
        Text(text = "5 persons")
        colourChoose(num = randomNumber)
    }
}
@Composable
fun sixPerson(){
    val randomNumber= (1..6).random()
    Column {
        Text(text = "6 persons")
        colourChoose(num = randomNumber)
    }
}
@Composable
fun sevenPerson(){
    val randomNumber= (1..7).random()

    Column {
        Text(text = "7 persons")
        colourChoose(num = randomNumber)
    }
}
@Composable
fun eightPerson(){
    val randomNumber= (1..8).random()
    Column {
        Text(text = "8 persons")
        colourChoose(num = randomNumber)
    }
}
@Composable
fun colourChoose(num:Int){
    when(num){
        1 -> Text(text = "Red must pay the Bill")
        2 -> Text(text = "Orange must pay the Bill")
        3 -> Text(text = "Green must pay the Bill")
        4 -> Text(text = "Yellow must pay the Bill")
        5 -> Text(text = "Blue must pay the Bill")
        6 -> Text(text = "Purple must pay the Bill")
        7 -> Text(text = "Magneta must pay the Bill")
        8 -> Text(text = "Indigo must pay the Bill")
    }
}