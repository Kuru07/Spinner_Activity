package com.example.spinner_page

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import kotlin.math.roundToInt
import com.example.spinner_page.whenSlider as whenSlider


@Composable
fun SpinnerActivity(){
    var sliderPosition by remember {
        mutableFloatStateOf(3F)
    }
    var switchClick by remember{
        mutableFloatStateOf(0F)
    }
    Column (modifier = Modifier
        .padding(50.dp)
        .fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally){
        when(sliderPosition){
            3F -> Image(painter = painterResource(R.drawable.wheel_3), contentDescription = null, modifier = Modifier.padding(0.dp) )
            4F -> Image(painter = painterResource(R.drawable.wheel_4), contentDescription = null, modifier = Modifier.padding(0.dp) )
            5F -> Image(painter = painterResource(R.drawable.wheel_5), contentDescription = null, modifier = Modifier.padding(0.dp) )
            6F -> Image(painter = painterResource(R.drawable.wheel_6), contentDescription = null, modifier = Modifier.padding(0.dp) )
            7F -> Image(painter = painterResource(R.drawable.wheel_7), contentDescription = null, modifier = Modifier.padding(0.dp) )
            8F -> Image(painter = painterResource(R.drawable.wheel_8), contentDescription = null, modifier = Modifier.padding(0.dp) )
        }
        Spacer(modifier = Modifier.padding(15.dp))
        Slider(value = sliderPosition,
                onValueChange ={sliderPosition=it.roundToInt().toFloat()
                    switchClick=0F},
                colors = SliderDefaults.colors(
                    thumbColor = Color.Green,
                    activeTrackColor = Color.Blue,
                    inactiveTrackColor = Color.Red
                ),
                steps = 4,
                valueRange = 3F..8F,
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.padding(15.dp))
            Text(text =sliderPosition.toInt().toString()+" Persons")

            Spacer(modifier = Modifier.padding(15.dp))
            Button(onClick = { switchClick++}){
                Text(text = "SPIN")
            }

            if(switchClick>0){
                whenSlider(sliderPosition = sliderPosition)

            }
        }
}

@Composable
fun whenSlider(sliderPosition : Float){
    when(sliderPosition){
        3F-> threePerson()
        4F-> fourPerson()
        5F-> fivePerson()
        6F-> sixPerson()
        7F-> sevenPerson()
        8F-> eightPerson()
    }
}
