package com.example.testcomposeapplication

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.testcomposeapplication.ui.theme.LightBackground

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter", "PrivateResource")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScaffoldFunc(navController: NavController) {
    val state = remember {
        mutableStateOf(1)
    }

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            TopAppBar(
                title = {
                    Column {

                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(36.dp),
                            horizontalArrangement = Arrangement.Absolute.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(text = "<- Prev")
                            Text(text = "Next ->")
                        }
                        Divider(modifier = Modifier.height(3.dp))
                    }


                })
        },
        bottomBar = {
            BottomAppBar {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(36.dp),
                    horizontalArrangement = Arrangement.Absolute.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "<- Prev",
                        modifier = Modifier.clickable { if (state.value != 1) {
                            state.value -= 1
                            navController.navigate(Route.returner(state.value))
                        } })
                    Text(
                        text = "Next ->",
                        modifier = Modifier.clickable { if (state.value != 3) {
                            state.value += 1
                            navController.navigate(Route.returner(state.value))
                        } })
                }
            }
        },
        floatingActionButton = {
            FloatingActionButton(onClick = { /*TODO*/ }) {
                Text(text = "AA")
            }
        }
    )
    { innerPadding ->
//        Column(
//            modifier = Modifier
//                .padding(innerPadding),
//            verticalArrangement = Arrangement.spacedBy(16.dp),
//        ) {
////            navController.navigate(Route.returner(state.value))
////            OneComp(navPages(state.value),state.value)
//        }
    }
}


enum class Route(val address: String, val id: Int) {
    ONE("home", 1),
    TWO("violoncello", 2),
    PIANO("piano", 3);

    companion object {
        fun returner(state: Int) =
            when (state) {
                1 -> "one"
                2 -> "two"
                3 -> "three"
                else -> "one"
            }
    }
}

