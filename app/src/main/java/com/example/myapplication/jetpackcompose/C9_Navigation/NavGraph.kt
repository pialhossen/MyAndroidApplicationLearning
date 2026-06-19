package com.example.myapplication.jetpackcompose.C9_Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute

@Composable
fun NavGraph() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = MyNavRoute.Login,
    ){
        composable<MyNavRoute.Login>{
            LoginScreen(navController = navController)
        }
        composable<MyNavRoute.Home> {backStackEntry ->
            val data = backStackEntry.toRoute<MyNavRoute.Home>()
            HomeScreen(navController, data.userName)
        }
    }

}