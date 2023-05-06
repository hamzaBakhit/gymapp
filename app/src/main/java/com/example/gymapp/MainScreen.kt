package com.example.gymapp

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.gymapp.items.MyPersonItem

data class MyPerson(val name: String, val image: Int)

val myList = listOf(
    MyPerson("hamza", R.drawable.logo),
    MyPerson("hamza", R.drawable.logo),
    MyPerson("hamza", R.drawable.logo),
    MyPerson("hamza", R.drawable.logo),
    MyPerson("hamza", R.drawable.logo),
    MyPerson("hamza", R.drawable.logo),
    MyPerson("hamza", R.drawable.logo),
    MyPerson("hamza", R.drawable.logo),
)

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MainScreen(navigation: NavController) {
    val navController = rememberNavController()
    val items = listOf(
        BottomNavigationItem.Home,
        BottomNavigationItem.Settings,
        BottomNavigationItem.Account,
    )
    Scaffold(

        bottomBar = {
                    BottomNavigation {
                        val backStack by navController.currentBackStackEntryAsState()
                        val cuttentRout = backStack?.destination?.route
                        items.forEach{
                            select->
                            BottomNavigationItem(
                                label = { Text(text = select.title)},
                                selected = cuttentRout == select.rout,
                                icon = { Icon(imageVector = select.img , contentDescription =null )},
                                onClick = {navController.navigate(select.rout)}
                            )
                        }
                    }
        },
        content = {

                  LazyColumn{
                      items(myList){
                          MyPersonItem(it)
                      }
                  }
        },
        topBar = {
        TopAppBar(
            backgroundColor = colorResource(id = R.color.redMain),
            title = { Text(text = "app bar") },
            navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(Icons.Default.ArrowBack, contentDescription = "")
                }
            },
            actions = {
                IconButton(onClick = {
                    navigation.navigate("/welcomeScreen")
                }) {
                    Icon(Icons.Default.Favorite, contentDescription = "")
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(Icons.Default.Favorite, contentDescription = "")
                }
            },
        )
    })
}