package com.example.myapplication.jetpackcompose.C9_Navigation

import kotlinx.serialization.Serializable

@Serializable
sealed class MyNavRoute {
    @Serializable
    object Login : MyNavRoute()
    @Serializable
    data class Home(val userName: String) : MyNavRoute()
}