package com.example.myapplication.jetpackcompose.C13_NavigationBar

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavHostController

@Composable
fun MyNavBar(navController: NavHostController, key: String = "Home", modifier: Modifier = Modifier) {
    val navItems = listOf(
        NavItem(
            title = "Home",
            icon = Icons.Default.Home,
            route = NavBarRoutes.Home,
        ),
        NavItem(
            title = "Search",
            icon = Icons.Default.Search,
            route = NavBarRoutes.Search
        ),
        NavItem(
            title = "Notification",
            icon = Icons.Default.Notifications,
            route = NavBarRoutes.Notification
        ),
        NavItem(
            title = "Profile",
            icon = Icons.Default.Person,
            route = NavBarRoutes.Profile
        ),
    )
    NavigationBar(modifier = modifier) {
        navItems.forEach { item ->
            NavigationBarItem(
                selected = item.title == key,
                onClick = { navController.navigate(item.route) },
                icon = {
                    Icon(
                        imageVector = item.icon,
                        contentDescription = item.title
                    )
                },
                label = { Text(text = item.title) }
            )
        }
    }
}

data class NavItem(
    val title: String,
    val icon: ImageVector,
    val route: NavBarRoutes,
)
