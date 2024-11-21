package com.example.pokemonapp

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PokemonApp() {
    val navController = rememberNavController()
    NavHost(navController, startDestination = "home") {
        composable("home") {
            HomeScreen(onPokemonSelected = { pokemon ->
                navController.navigate("pokemon/$pokemon")
            })
        }
        composable("pokemon/{pokemon}",
            arguments = listOf(navArgument("pokemon") { type = NavType.StringType })
        ) {
            backStackEntry ->
            val pokemon = backStackEntry.arguments?.getString("pokemon") ?: "Gengar"
                PokemonScreen(pokemon)
        }
    }
}