package com.example.gymapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Navigation()
        }
    }
}

@Composable
fun WelcomeScreen(navigation: NavController) {
    Box() {
        Image(
            painter = painterResource(id = R.drawable.fill),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.fillMaxSize()
        )
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "",
            modifier = Modifier
                .height(150.dp)
                .width(150.dp)
                    .align(alignment = Alignment.Center)
        )
        Column(modifier = Modifier
            .align(alignment = Alignment.BottomCenter)
            .padding(20.dp)) {
            Button(
                colors = ButtonDefaults.buttonColors(colorResource(id = R.color.redMain)),
                modifier = Modifier.fillMaxWidth(),
                onClick = {navigation.navigate("/mainScreen")}) {
                Text(text = "Sign up", color = Color.White)
            }
            Button(
                colors = ButtonDefaults.buttonColors(colorResource(id = R.color.blueMain)),
                modifier = Modifier.fillMaxWidth(),
                onClick = { /*TODO*/ }) {
                Text(text = "Sign In", color = Color.White)
            }
        }
    }

}
