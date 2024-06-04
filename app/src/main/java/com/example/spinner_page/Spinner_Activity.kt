package com.example.spinner_page

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
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
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
    Column (modifier = Modifier.padding(50.dp)){
        Slider(value = sliderPosition,
            onValueChange ={sliderPosition=it.roundToInt().toFloat()
                switchClick=0F},
            colors = SliderDefaults.colors(
                thumbColor = Color.Green,
                activeTrackColor = Color.Blue,
                inactiveTrackColor = Color.Red
            ),
            steps = 4,
            valueRange = 3F..8F
        )
        Text(text =sliderPosition.toString() )

        Spacer(modifier = Modifier.padding(10.dp))
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