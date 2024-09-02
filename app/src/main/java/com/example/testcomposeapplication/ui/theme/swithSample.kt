package com.example.testcomposeapplication.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.semantics.Role.Companion.Switch
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun CustomSwitch() {


    val checked = remember { mutableStateOf(true) }
    Column {
        Switch(
            checked = checked.value,
            onCheckedChange = { checked.value = it }
        )
        if (checked.value) {
            Text("Switch is On")
        } else {
            Text("Switch is Off")
        }
    }

}

@Preview
@Composable
fun CustomSwitchPreview() {
    CustomSwitch()
}