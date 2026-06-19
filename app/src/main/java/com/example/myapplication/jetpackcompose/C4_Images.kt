package com.example.myapplication.jetpackcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.R

//@Preview(showSystemUi = true, showBackground = true)
@Composable
fun ImageExample() {
    Image(
        painter = painterResource(R.drawable.image),
        contentDescription = "",
        modifier = Modifier
            .padding(all = 16.dp)
            .size(300.dp)
            .clip(shape = RoundedCornerShape(16.dp)),
        contentScale = ContentScale.FillWidth
    )
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun IconExample(){
    Icon(imageVector = Icons.Default.Home, contentDescription = "Home")
}