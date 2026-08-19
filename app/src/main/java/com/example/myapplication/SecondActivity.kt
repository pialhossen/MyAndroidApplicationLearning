package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.myapplication.MainActivity

class SecondActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
            ) {
                Text("Second Activity")
                Button (
                    onClick = {
                        val intent = Intent(applicationContext, MainActivity::class.java)
                        startActivity(intent)
                    },
                ){
                    Text("Go To Main Activity")
                }
                Button (
                    onClick = {
                        val intent =  Intent(Intent.ACTION_VIEW)
                        intent.data = Uri.parse("https://readydokan.com/")
                        startActivity(intent)
                    },
                ){
                    Text("Go To Readydokan")
                }
                Button (
                    onClick = {
                        val intent =  Intent(Intent.ACTION_MAIN)
                        intent.setPackage("com.google.android.apps.maps")
                        try{
                            startActivity(intent)
                        } catch (e: Exception){
                            e.printStackTrace()
                        }
                    },
                ){
                    Text("Go To Map")
                }
            }
        }
    }
}