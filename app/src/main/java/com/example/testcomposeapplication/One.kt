package com.example.testcomposeapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun OneComp(event: NavController, pageNum:Int) {

    Column(modifier = Modifier.background(Color.LightGray)) {
        Text(text = "Navigate -> 2", modifier = Modifier.clickable { event.navigate(Route.returner(2)) })
        Spacer(modifier = Modifier.height(50.dp))
        Row (horizontalArrangement = Arrangement.Center){
            Text(text = "THIS IS PAGE  1", color = Color.Cyan)
        }
    }
}
