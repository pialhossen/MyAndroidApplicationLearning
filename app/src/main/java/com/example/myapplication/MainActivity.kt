package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.myapplication.jetpackcompose.AlertDialogExample
import com.example.myapplication.jetpackcompose.C9_Navigation.NavGraph

import com.example.myapplication.jetpackcompose.CardExample02
import com.example.myapplication.jetpackcompose.LoginScreen
import com.example.myapplication.jetpackcompose.StateManagementExample
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                NavGraph()
            }
        }
    }
}