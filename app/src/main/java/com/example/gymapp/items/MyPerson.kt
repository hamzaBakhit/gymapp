package com.example.gymapp.items

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.gymapp.MyPerson
import com.example.gymapp.R

@Composable
fun MyPersonItem(myPerson: MyPerson){
    Card (modifier = Modifier.padding(all = 20.dp), shape = RoundedCornerShape(10)){
        Row(modifier = Modifier.fillMaxWidth()) {

            Image(painter = painterResource(id = myPerson.image), contentDescription =null )
            Text(text = myPerson.name)
        }
    }
}

