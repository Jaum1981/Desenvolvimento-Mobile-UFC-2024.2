package com.example.pokedexapp.models

import com.example.pokedexapp.R

data class Pokemon (

    val id: Int,
    val name: String,
    val type: String,
    val imageRes: Int,
    val description: String,
    val abilities: List<String>,
    var isFavorite: Boolean = false

)

val mockPokemonList = listOf(
    Pokemon(
        id = 94,
        name = "Gengar",
        type = "Ghost/Poison",
        imageRes = R.drawable.gengar_nao_ironicamente_, // Substitua com o ID real da imagem
        description = "Gengar is a shadowy Pokémon that hides in the darkness and strikes fear into its prey.",
        abilities = listOf("Cursed Body", "Levitate (legacy ability)"),
        isFavorite = true
    ),
    Pokemon(
        id = 778,
        name = "Mimikyu",
        type = "Ghost/Fairy",
        imageRes = R.drawable.mimikyu, // Substitua com o ID real da imagem
        description = "Mimikyu hides its true appearance under a rag to avoid the wrath of others.",
        abilities = listOf("Disguise"),
        isFavorite = true
    ),
    Pokemon(
        id = 25,
        name = "Pikachu",
        type = "Electric",
        imageRes = R.drawable.pikachu_o, // Substitua com o ID real da imagem
        description = "Pikachu is an Electric-type Pokémon known for its cute appearance and powerful Thunderbolt.",
        abilities = listOf("Static", "Lightning Rod"),
        isFavorite = false
    ),
    Pokemon(
        id = 6,
        name = "Charizard",
        type = "Fire/Flying",
        imageRes = R.drawable.charizard, // Substitua com o ID real da imagem
        description = "Charizard flies at incredible speeds and can melt boulders with its fiery breath.",
        abilities = listOf("Blaze", "Solar Power"),
        isFavorite = false
    )
)
