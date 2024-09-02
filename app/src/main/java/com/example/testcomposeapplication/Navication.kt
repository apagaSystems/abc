package com.example.testcomposeapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun navPages(pageNum:Int): NavController {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "one") {
        composable("one") {
            OneComp(event = navController,pageNum)
        }

        composable("two") {
            TwoComp(event = navController,pageNum)
        }
        composable("three") {
            ThreeComp(event = navController,pageNum)
        }
    }
    return navController
}

