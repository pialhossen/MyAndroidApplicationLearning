package com.example.myapplication.jetpackcompose.C13_NavigationBar

import kotlinx.serialization.Serializable

@Serializable
sealed class NavBarRoutes {
    @Serializable
    object Home : NavBarRoutes()

    @Serializable
    object Search : NavBarRoutes()

    @Serializable
    object Notification : NavBarRoutes()

    @Serializable
    object Profile : NavBarRoutes()
}