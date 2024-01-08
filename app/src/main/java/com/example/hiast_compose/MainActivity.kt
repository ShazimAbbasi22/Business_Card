package com.example.hiast_compose


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size

import androidx.compose.foundation.shape.CircleShape

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color

import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.hiast_compose.ui.theme.Hiast_ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Hiast_ComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}

@Composable
fun MyData() {
    Column(
        modifier = Modifier
            .background(Color.Black)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Image(
            painter = painterResource(id = R.drawable.avatar),
            contentDescription = "Avatar logo",
            contentScale = ContentScale.FillHeight,
            modifier = Modifier
                .size(200.dp)
                .clip(CircleShape)
        )

        Text(
            text = "Shazim Abbasi",
            fontSize = 40.sp,
            fontFamily = FontFamily.Serif,
            color = Color.White,
            modifier = Modifier
                .padding(top = 15.dp)
        )

        Text(
            text = "Android Developer",
            fontSize = 20.sp,
            color = Color.White,
            fontFamily = FontFamily.SansSerif
        )

        OutlinedCard(
            modifier = Modifier
                .padding(top = 40.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .padding(15.dp)
                    .size(width = 220.dp, height = 25.dp)
            ) {

                Image(
                    painter = painterResource(id = R.drawable.baseline_call_24),
                    contentDescription = "Avatar logo"
                )
                Text(
                    text = "+923353929358",
                    fontSize = 18.sp,
                    modifier = Modifier
                        .padding(start = 15.dp)

                )
            }
        }

        OutlinedCard(
            modifier = Modifier
                .padding(top = 25.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .padding(15.dp)
                    .size(width = 220.dp, height = 25.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.share),
                    contentDescription = "Share logo"
                )
                Text(
                    text = "ShazimAbbasi22",
                    fontSize = 18.sp,
                    modifier = Modifier
                        .padding(start = 15.dp)
                )
            }
        }

        OutlinedCard(
            modifier = Modifier
                .padding(top = 25.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .padding(15.dp)
                    .size(width = 220.dp, height = 25.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.envelope),
                    contentDescription = "Share logo"
                )
                Text(
                    text = "moin2ksa@gmail.com",
                    fontSize = 18.sp,
                    modifier = Modifier
                        .padding(start = 15.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MyDataPreview() {
    MyData()
}
