package com.example.pokedexapp.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import com.example.pokedexapp.models.Pokemon
import com.example.pokedexapp.models.mockPokemonList
import com.example.pokedexapp.ui.components.PokemonListItem

@Composable
fun HomeScreen(onPokemonSelected: (Pokemon) -> Unit) {
    var searchQuery by remember { mutableStateOf("") }

    // Filtra os pokémons com base na consulta de pesquisa
    val filteredPokemons = remember(searchQuery) {
        mockPokemonList.filter { it.name.contains(searchQuery, ignoreCase = true) }
    }

    // Layout da tela
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        // Campo de pesquisa
        TextField(
            value = searchQuery,
            onValueChange = { searchQuery = it },
            label = { Text("Search Pokemon") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp) // Adiciona um espaçamento entre o campo de pesquisa e a lista
        )

        // Lista de pokémons filtrados
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            items(filteredPokemons) { pokemon ->
                PokemonListItem(pokemon, onPokemonSelected)
            }
        }
    }
}
