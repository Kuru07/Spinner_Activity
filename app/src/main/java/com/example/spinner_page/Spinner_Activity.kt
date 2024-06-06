package com.example.spinner_page

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import kotlin.math.roundToInt
import com.example.spinner_page.whenSlider as whenSlider


var num=0
var number1=0
@Composable
fun SpinnerActivity(){
    var sliderPosition by remember {
        mutableFloatStateOf(3F)
    }
    var switchClick by remember{
        mutableFloatStateOf(0F)
    }
    var color_choose by remember {
        mutableStateOf(Color.White)
    }
    var isEnable by remember {
        mutableStateOf(true)
    }
    @Composable
    fun getcolor(int: Int):Color{
        return when (int) {
            1 -> Color.Blue
            2 -> Color.Red
            3 -> Color.Green
            4 -> colorResource(R.color.orange)
            5 -> colorResource(R.color.purle)
            6 -> Color.Yellow
            7 -> colorResource(R.color.pink)
            8 -> colorResource(R.color.gold)
            else -> Color.White
        }
    }
    @Composable
    fun ccb(int: Int){
        color_choose=getcolor(int = int)
    }
    /*@Composable
    fun ccb(int: Int){
       color_choose = when(int){
            1 -> Color.Blue
            2 -> Color.Red
            3 -> Color.Green
            4 -> colorResource(R.color.orange)
            5 -> colorResource(R.color.purle)
            6 -> Color.Yellow
            7 -> colorResource(R.color.pink)
            8 -> colorResource(R.color.gold)
            else -> Color.White
        }
    }*/

        Column(
            modifier = Modifier
                .padding(50.dp)
                .fillMaxSize()
                .background(color_choose),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            if (switchClick == 0F) {
                when (sliderPosition) {
                    3F -> Image(
                        painter = painterResource(R.drawable.wheel_3),
                        contentDescription = null,
                        modifier = Modifier.padding(0.dp)
                    )

                    4F -> Image(
                        painter = painterResource(R.drawable.wheel_4),
                        contentDescription = null,
                        modifier = Modifier.padding(0.dp)
                    )

                    5F -> Image(
                        painter = painterResource(R.drawable.wheel_5),
                        contentDescription = null,
                        modifier = Modifier.padding(0.dp)
                    )

                    6F -> Image(
                        painter = painterResource(R.drawable.wheel_6),
                        contentDescription = null,
                        modifier = Modifier.padding(0.dp)
                    )

                    7F -> Image(
                        painter = painterResource(R.drawable.wheel_7),
                        contentDescription = null,
                        modifier = Modifier.padding(0.dp)
                    )

                    8F -> Image(
                        painter = painterResource(R.drawable.wheel_8),
                        contentDescription = null,
                        modifier = Modifier.padding(0.dp)
                    )
                }
            }
            Spacer(modifier = Modifier.padding(15.dp))
            Slider(
                value = sliderPosition,
                onValueChange = {
                    sliderPosition = it.roundToInt().toFloat()
                    switchClick = 0F
                    isEnable=true
                    color_choose = Color.White
                },
                colors = SliderDefaults.colors(
                    thumbColor = Color.Black,
                    activeTrackColor = Color.Black,
                    inactiveTrackColor = Color.Black
                ),
                steps = 4,
                valueRange = 3F..8F,
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.padding(15.dp))
            if(switchClick==0F)
            Text(text = sliderPosition.toInt().toString() + " Persons")
            else
                Text(text = sliderPosition.toInt().toString() + " Persons", color = Color.White)
            Spacer(modifier = Modifier.padding(15.dp))
            Button(onClick = { switchClick++ }, enabled = isEnable ) {
                Text(text = "SPIN")
            }

            if (switchClick > 0) {
                number1=whenSlider(sliderPosition = sliderPosition)
                ccb(int= 2)
                isEnable = false
            }

        }
    }



@Composable
fun whenSlider(sliderPosition : Float):Int{
    when(sliderPosition){
        3F-> {num=threePerson()}
        4F-> {num=fourPerson()}
        5F-> {num=fivePerson()}
        6F-> {num=sixPerson()}
        7F-> {num=sevenPerson()}
        8F-> {num=eightPerson()}
    }
    return num
}

//        1 -> Blue
//        2 -> Red
//        3 -> Green
//        4 -> Orange
//        5 -> Purple
//        6 -> Yellow
//        7 -> Pink
//        8 -> Gold