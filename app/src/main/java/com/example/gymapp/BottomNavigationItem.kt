package com.example.gymapp

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavigationItem(val title:String, val rout:String, val img:ImageVector)
{
object Home:BottomNavigationItem(
    rout = "/home",
    title = "Home",
    img = Icons.Default.Home,
)
object Settings:BottomNavigationItem(
    rout = "/settings",
    title = "Settings",
    img = Icons.Default.Settings,
)
object Account:BottomNavigationItem(
    rout = "/account",
    title = "Account",
    img = Icons.Default.AccountBox,
)}