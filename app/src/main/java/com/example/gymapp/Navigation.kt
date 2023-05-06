package com.example.gymapp

import androidx.compose.runtime.Composable
import androidx.navigation.Navigation
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.gymapp.bottomnavscreen.AccountScreen
import com.example.gymapp.bottomnavscreen.HomeScreen
import com.example.gymapp.bottomnavscreen.SettingScreen

@Composable
fun Navigation(){
    val navController =  rememberNavController()
    NavHost(navController = navController, startDestination =  "/welcomeScreen", ){
        composable(BottomNavigationItem.Home.rout){
            HomeScreen()
        }
        composable(BottomNavigationItem.Settings.rout){
            SettingScreen()
        }
        composable(BottomNavigationItem.Account.rout){
            AccountScreen()
        }
        composable(route = "/welcomeScreen"){
            WelcomeScreen(navController)
        }
        composable(route = "/mainScreen"){
            MainScreen(navController)
        }
    }
}