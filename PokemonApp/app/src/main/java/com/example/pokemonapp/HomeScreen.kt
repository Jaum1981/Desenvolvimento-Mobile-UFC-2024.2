package com.example.pokemonapp

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@ExperimentalMaterial3Api
@Composable
fun HomeScreen(onPokemonSelected : (String) -> Unit) {
    Scaffold (
        topBar = {
            TopAppBar(
                title = { Text("Pokemon App") },
                actions = {
                    PokemonAppMenu(onOptionSelected = onPokemonSelected)
                }
            )
        }
    )
    { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            contentAlignment = Alignment.Center
        ) {
            Text("Selecione um pokemon no menu três pontinhos(canto superior direito).")
        }
    }

}
