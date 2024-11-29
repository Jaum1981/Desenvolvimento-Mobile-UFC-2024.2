package com.example.pokedexappv2.models

import com.example.pokedexappv2.R

data class Pokemon(
    val id: Int,
    val name: String,
    val type: String,
    val region: String,
    val abilities: String,
    val weight: String,
    val height: String,
    val description: String,
    val imageRes: Int,
    var isFavorite: Boolean = false
)

val pokemonList = listOf(
    Pokemon(
        id = 25,
        name = "Pikachu",
        type = "Elétrico",
        region = "Kanto",
        abilities = "Static, Lightning Rod",
        weight = "6.0 kg",
        height = "0.4 m",
        description = "Pikachu é um Pokémon do tipo Elétrico. É conhecido por armazenar eletricidade nas bochechas.",
        imageRes = R.drawable.pikachu_o,
        isFavorite = true,
    ),
    Pokemon(
        id = 94,
        name = "Gengar",
        type = "Fantasma/Venenoso",
        region = "Kanto",
        abilities = "Cursed Body",
        weight = "40.5 kg",
        height = "1.5 m",
        description = "Gengar é um Pokémon travesso que adora pregar sustos e se esconde nas sombras para atacar.",
        imageRes = R.drawable.gengar_nao_ironicamente_
    ),
    Pokemon(
        id = 1,
        name = "Bulbasaur",
        type = "Planta/Venenoso",
        region = "Kanto",
        abilities = "Overgrow, Chlorophyll",
        weight = "6.9 kg",
        height = "0.7 m",
        description = "Bulbasaur possui uma semente em suas costas que cresce ao absorver energia solar.",
        imageRes = R.drawable.bulbasaur
    ),
    Pokemon(
        id = 7,
        name = "Squirtle",
        type = "Água",
        region = "Kanto",
        abilities = "Torrent, Rain Dish",
        weight = "9.0 kg",
        height = "0.5 m",
        description = "Squirtle é conhecido por seu casco que o protege e por jatos de água poderosos.",
        imageRes = R.drawable.squirtle
    ),
    Pokemon(
        id = 133,
        name = "Eevee",
        type = "Normal",
        region = "Kanto",
        abilities = "Run Away, Adaptability",
        weight = "6.5 kg",
        height = "0.3 m",
        description = "Eevee é um Pokémon muito versátil, capaz de evoluir para várias formas diferentes.",
        imageRes = R.drawable.eevee
    ),
    Pokemon(
        id = 149,
        name = "Dragonite",
        type = "Dragão/Voador",
        region = "Kanto",
        abilities = "Inner Focus, Multiscale",
        weight = "210.0 kg",
        height = "2.2 m",
        description = "Dragonite é um Pokémon majestoso que voa a grandes altitudes e protege os mares.",
        imageRes = R.drawable.dragonite
    ),
    Pokemon(
        id = 448,
        name = "Lucario",
        type = "Lutador/Metálico",
        region = "Sinnoh",
        abilities = "Steadfast, Inner Focus, Justified",
        weight = "54.0 kg",
        height = "1.2 m",
        description = "Lucario é um Pokémon que pode sentir a aura dos seres vivos e usá-la em combate.",
        imageRes = R.drawable.lucario
    ),
    Pokemon(
        id = 143,
        name = "Snorlax",
        type = "Normal",
        region = "Kanto",
        abilities = "Immunity, Thick Fat",
        weight = "460.0 kg",
        height = "2.1 m",
        description = "Snorlax passa a maior parte do tempo dormindo e só acorda para comer.",
        imageRes = R.drawable.snorlax
    ),
    Pokemon(
        id = 778,
        name = "Mimikyu",
        type = "Fantasma/Fada",
        region = "Alola",
        abilities = "Disguise",
        weight = "0.7 kg",
        height = "0.2 m",
        description = "Mimikyu se disfarça para parecer com Pikachu, na esperança de fazer amigos. Sua verdadeira aparência é desconhecida e dizem que quem a vê fica terrivelmente amaldiçoado.",
        imageRes = R.drawable.mimikyu
    )

)
