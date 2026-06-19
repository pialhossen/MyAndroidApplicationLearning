package com.example.myapplication.jetpackcompose

import android.R
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ModifierExample() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .background(color = Color(red = 220, blue = 250, green = 220)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(space = 16.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color(red = 120, blue = 250, green = 220))
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceAround,

        ) {

            Text(text = "Apple", fontSize = 20.sp)
            Text(text = "Banana", fontSize = 20.sp)
            Text(text = "Grapes", fontSize = 20.sp)
        }

        Box(
            modifier = Modifier
                .background(color = Color.Blue, shape = RoundedCornerShape(size = 16.dp))
                .size(size = 200.dp)
                .clickable(onClick = {})
                .border(width = 2.dp, color=Color.Red, shape = RoundedCornerShape(size = 16.dp)),

            contentAlignment = Alignment.Center
        ) {
            Text(text = "Center", fontSize = 20.sp, color = Color.White)
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color(red = 100, blue = 110, green = 160))
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceAround,
        ) {
            Text(text = "One", fontSize = 20.sp)
            Text(text = "Two", fontSize = 20.sp)
            Text(text = "Three", fontSize = 20.sp)
        }
    }
}