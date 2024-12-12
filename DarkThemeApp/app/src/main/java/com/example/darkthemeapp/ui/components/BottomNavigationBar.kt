package com.example.darkthemeapp.ui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Event
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun BottomNavigationBar(
    navController: NavController
) {
    NavigationBar {
        val items = listOf(
            Triple("Home", "home", Icons.Default.Home),
            Triple("Events", "events", Icons.Default.Event),
            Triple("Favorites", "favorites", Icons.Default.Favorite)
        )
        items.forEach{ (route, label, icon) ->
            NavigationBarItem (
                icon = { Icon(icon, contentDescription = label) },
                label = { Text(label) },
                selected = false,
                onClick = { navController.navigate(route) }
            )
        }
    }
}