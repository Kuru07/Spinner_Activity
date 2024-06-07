package com.example.spinner_page

import androidx.compose.animation.core.InfiniteRepeatableSpec
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
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
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import kotlin.math.roundToInt


var num=0
var number1=0
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SpinnerActivity() {
    var sliderPosition by remember {
        mutableFloatStateOf(3F)
    }
    var switchClick by remember {
        mutableFloatStateOf(0F)
    }
    var color_choose by remember {
        mutableStateOf(Color.White)
    }
    var targetAngle by remember { mutableStateOf(0f) }


    fun randomAngle(): Float {
        return (0..360).random().toFloat()
    }

    @Composable
    fun ccb(int: Int) {
        when (int) {
            1 -> {
                color_choose = Color.Blue
            }

            2 -> {
                color_choose = Color.Red
            }

            3 -> {
                color_choose = Color.Green
            }

            4 -> {
                color_choose = colorResource(R.color.orange)
            }

            5 -> {
                color_choose = colorResource(R.color.purle)
            }

            6 -> {
                color_choose = Color.Yellow
            }

            7 -> {
                color_choose = colorResource(R.color.pink)
            }

            8 -> {
                color_choose = colorResource(R.color.gold)
            }
        }
    }

    Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color_choose),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column(
                modifier = Modifier
                    .padding(50.dp)
                    .fillMaxSize()
                    .background(color_choose),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(modifier = Modifier.padding(0.dp)){
                    if (switchClick == 0F){
                        when (sliderPosition) {
                            3F ->{
                                Box{
                                    Image(
                                        painter = painterResource(R.drawable.wheel_3),
                                        contentDescription = null
                                    )
                                    Box(contentAlignment = Alignment.Center,
                                        modifier = Modifier.align(Alignment.Center)){
                                        Image(
                                            painter = painterResource(id = R.drawable.pin),
                                            modifier = Modifier.align(Alignment.Center),
                                            contentDescription = null
                                        )
                                    }
                                }

                            }

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
                }
                if (switchClick>0f) {
                    @Composable
                    fun rotationAnimation() {
                        val infiniteTransition = rememberInfiniteTransition()
                        val angle by infiniteTransition.animateFloat(
                            initialValue = 0f,
                            targetValue = 360f,
                            animationSpec = (InfiniteRepeatableSpec(
                                    tween(800, easing = LinearEasing))))
                        when (sliderPosition) {
                            3F -> Image(
                                painter = painterResource(R.drawable.wheel_3),
                                contentDescription = null,
                                modifier = Modifier
                                    .padding(0.dp)
                                    .rotate(angle)
                            )

                            4F -> Image(
                                painter = painterResource(R.drawable.wheel_4),
                                contentDescription = null,
                                modifier = Modifier
                                    .padding(0.dp)
                                    .rotate(angle)
                            )

                            5F -> Image(
                                painter = painterResource(R.drawable.wheel_5),
                                contentDescription = null,
                                modifier = Modifier
                                    .padding(0.dp)
                                    .rotate(angle)
                            )

                            6F -> Image(
                                painter = painterResource(R.drawable.wheel_6),
                                contentDescription = null,
                                modifier = Modifier
                                    .padding(0.dp)
                                    .rotate(angle)
                            )

                            7F -> Image(
                                painter = painterResource(R.drawable.wheel_7),
                                contentDescription = null,
                                modifier = Modifier
                                    .padding(0.dp)
                                    .rotate(angle)
                            )

                            8F -> Image(
                                painter = painterResource(R.drawable.wheel_8),
                                contentDescription = null,
                                modifier = Modifier
                                    .padding(0.dp)
                                    .rotate(angle)
                            )

                        }
                        LaunchedEffect(targetAngle) {
                            if (angle == targetAngle) {
                                switchClick = 0F // Reset switchClick to stop animation
                                color_choose = Color.White // Reset color for next spin
                                sliderPosition=0f
                            }
                        }
                    }
                    rotationAnimation()
                }
                Spacer(modifier = Modifier.padding(15.dp))
                Slider(
                    value = sliderPosition,
                    onValueChange = {
                        sliderPosition = it.roundToInt().toFloat()
                        switchClick = 0F
                        color_choose = Color.White
                    },
                    colors = SliderDefaults.colors(
                        thumbColor = Color.LightGray,
                        activeTrackColor = colorResource(R.color.darkslider),
                        inactiveTrackColor = colorResource(R.color.blueslider)
                    ),
                    thumb = {
                        Image(painterResource(id = R.drawable.pin),"contentDescription")
                    },
//                        Icon(
//                            imageVector = Icons.Filled.Favorite,
//                            contentDescription = null,
//                            modifier = Modifier.size(ButtonDefaults.IconSize)
//                        )                    },
                    steps = 4,
                    valueRange = 3F..8F,
                    modifier = Modifier
                        .fillMaxWidth()
                )
                Spacer(modifier = Modifier.padding(15.dp))
                Text(text = sliderPosition.toInt().toString() + " Persons")

                Spacer(modifier = Modifier.padding(15.dp))
                
                Button(onClick = {
                    targetAngle = randomAngle()
                    switchClick++ }) {
                    Text(text = "SPIN")
                }

                if (switchClick > 0) {
                    ccb(int = PayBill(numberOfPeople = sliderPosition.toInt(), reset = false))
                }

            }

        }

    }




//        1 -> Blue
//        2 -> Red
//        3 -> Green
//        4 -> Orange
//        5 -> Purple
//        6 -> Yellow
//        7 -> Pink
//        8 -> Gold