package com.ilesha23.football.ui.secondTimeScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.ilesha23.football.R
import com.ilesha23.football.ui.common.CustomButton
import com.ilesha23.football.ui.common.Timer

@Composable
fun SecondTimeScreen() {
    SecondTimeScreenContent()
}

@Composable
fun SecondTimeScreenContent() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.background),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            modifier = Modifier
                .weight(1.65f),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom
        ) {
            Text(
                text = stringResource(id = R.string.time_screen_second),
                color = MaterialTheme.colorScheme.onBackground
            )
            Spacer(modifier = Modifier.height(10.dp))
            Timer(
                modifier = Modifier
                    .fillMaxHeight(0.8f)
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth(0.8f),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            IconButton(
                onClick = {},
                modifier = Modifier
                    .height(90.dp)
                    .width(70.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.plus),
                    contentDescription = null,
                    tint = Color.White
                )
            }
            IconButton(
                onClick = {},
                modifier = Modifier
                    .height(90.dp)
                    .width(70.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.plus),
                    contentDescription = null,
                    tint = Color.White
                )
            }
        }
        Row(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth(0.8f)
        ) {
            IconButton(
                onClick = {},
                modifier = Modifier
                    .height(90.dp)
                    .width(70.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.minus),
                    contentDescription = null,
                    tint = Color.White
                )
            }
        }
        Column(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth(0.8f),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            CustomButton(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Text(
                    text = stringResource(id = R.string.time_screen_final),
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onBackground,
                    modifier = Modifier
                        .padding(vertical = 10.dp)
                )
            }
        }
    }
}