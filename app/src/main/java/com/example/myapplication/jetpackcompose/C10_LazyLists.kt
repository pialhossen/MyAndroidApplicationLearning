package com.example.myapplication.jetpackcompose
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

//@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LazyColumnExample() {
    LazyColumn(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp)

    ) {
        items(40){index ->
            Text(
                text = "Item $index",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                modifier = Modifier.background(
                    color = Color.DarkGray,
                    shape = RoundedCornerShape(8.dp)
                ).padding(16.dp)
            )
        }
    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun NestedLazyListExample() {
    LazyColumn(
        modifier = Modifier.fillMaxSize().padding(16.dp),
    ) {
        items(40){colIndex ->
            Text(
                modifier = Modifier.padding(bottom = 8.dp),
                text = "Column $colIndex",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color.DarkGray,
            )
            LazyRow(
                modifier = Modifier.fillMaxSize().padding(bottom = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
            ){
                items(40){index ->
                    Box(
                        modifier = Modifier.size(120.dp).background(color = Color.LightGray, shape = RoundedCornerShape(10.dp)),
                        contentAlignment = Alignment.Center,
                    ){
                        Text(
                            text = "Item $index",
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.DarkGray,
                        )
                    }
                }
            }
        }
    }
}