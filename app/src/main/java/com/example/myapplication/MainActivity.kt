package com.example.myapplication

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.jetpackcompose.C13_NavigationBar.NavBarHomeScreen
import com.example.myapplication.jetpackcompose.C13_NavigationBar.NavBarNavigation
import com.example.myapplication.jetpackcompose.SnackBarExample
import com.example.myapplication.jetpackcompose.ToastExample
import com.example.myapplication.ui.theme.MyApplicationTheme
import com.example.myapplication.viewmodel.ExampleViewModel

class MainActivity : ComponentActivity() {
    private val viewModel by viewModels<ExampleViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Scaffold() { innerPadding ->
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = viewModel.backgroundColor
                ) {
                    Column(
                        modifier = Modifier.padding(innerPadding).fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                    ) {
                        Button(
                            onClick = {
                                viewModel.changeBackgroundColor()
                            }
                        ) {
                            Text("Click Me")
                        }
                    }
                }
            }
        }

//        setContent {
//            Column(
//                modifier = Modifier.fillMaxSize(),
//                horizontalAlignment = Alignment.CenterHorizontally,
//                verticalArrangement = Arrangement.Center,
//            ) {
//                Text("Main Activity")
//                Button (
//                    onClick = {
//                        val intent =  Intent(applicationContext, SecondActivity::class.java)
//                        startActivity(intent)
//                    },
//                ){
//                    Text("Go To Second Activity")
//                }
//            }
//        }
    }
}