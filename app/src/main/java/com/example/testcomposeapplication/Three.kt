package com.example.testcomposeapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun ThreeComp(event: NavController, pageNum:Int) {
    Column(
        modifier = Modifier
            .background(Color.DarkGray)
            .fillMaxSize()
    ) {
        Text(
            text = "Navigate -> 1",
            modifier = Modifier.clickable { event.navigate(Route.returner(1)) },
            color = Color.White
        )
        Spacer(modifier = Modifier.height(50.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Text(
                text = "THIS IS PAGE  3",
                textAlign = TextAlign.Center,
                color = Color.Green,
                modifier = Modifier.fillMaxWidth()
            )
        }
    }

}