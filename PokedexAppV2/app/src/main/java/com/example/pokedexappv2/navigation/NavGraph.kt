package com.example.pokedexappv2.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.pokedexappv2.models.pokemonList
import com.example.pokedexappv2.ui.components.BottomBarScreen
import com.example.pokedexappv2.ui.components.BottomNavigationBar
import com.example.pokedexappv2.ui.screens.HomeScreen
import com.example.pokedexappv2.ui.screens.FavoriteScreen
import com.example.pokedexappv2.ui.screens.DetailsScreen

@ExperimentalMaterial3Api
@Composable
fun NavGraph(
    onSettingsClick: () -> Unit,
    onHelpClick: () -> Unit
) {
    val navController = rememberNavController()

    Scaffold(
        bottomBar = {
            BottomNavigationBar(navController = navController)
        }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = BottomBarScreen.Home.route,
            modifier = Modifier.padding(innerPadding)
        ) {
            // Tela Inicial (Home)
            composable(BottomBarScreen.Home.route) {
                HomeScreen(
                    onPokemonSelected = { pokemon ->
                        navController.navigate("details/${pokemon.name}")
                    },
                    onSettingsClick = onSettingsClick,
                    onHelpClick = onHelpClick
                )
            }

            // Tela de Favoritos
            composable(BottomBarScreen.Favorites.route) {
                FavoriteScreen(
                    onPokemonSelected = { pokemon ->
                        navController.navigate("details/${pokemon.name}")
                    },
                    onFavoriteToggle = { pokemon ->
                        pokemon.isFavorite = !pokemon.isFavorite
                    }
                )
            }

            // Tela de Detalhes
            composable("details/{pokemonName}") { backStackEntry ->
                val pokemonName = backStackEntry.arguments?.getString("pokemonName")
                val selectedPokemon = pokemonList.first { it.name == pokemonName }
                DetailsScreen(selectedPokemon)
            }
        }
    }
}
