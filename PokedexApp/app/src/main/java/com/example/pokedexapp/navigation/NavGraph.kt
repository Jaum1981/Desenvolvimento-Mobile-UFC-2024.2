package com.example.pokedexapp.navigation

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.pokedexapp.models.mockPokemonList
import com.example.pokedexapp.ui.screens.HomeScreen
import com.example.pokedexapp.ui.screens.PokemonScreen

@ExperimentalMaterial3Api
@Composable
fun NavGraph() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            HomeScreen(onPokemonSelected = { pokemon ->
                navController.navigate("pokemon/${pokemon.name}")
            })
        }
        composable("pokemon/{pokemon}") { backStackEntry ->
            val pokemonName = backStackEntry.arguments?.getString("pokemon")
            val selectedPokemon = mockPokemonList.first { it.name == pokemonName }
            PokemonScreen(selectedPokemon)
        }
    }
}
