package com.example.profileapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Configurando o nome do Pokémon
        val pokemonName: TextView = findViewById(R.id.pokemon_name)
        pokemonName.text = "Gengar (Não irônicamente)"

        // Configurando a imagem do Pokémon
        val pokemonImage: ImageView = findViewById(R.id.pokemonImage)
        pokemonImage.setImageResource(R.drawable.gengar_nao_ironicamente_)

        // Configurando a descrição do Pokémon
        val descriptionText: TextView = findViewById(R.id.descriptionText)
        descriptionText.text = "To steal the life of its target, it slips into the prey’s shadow and silently waits for an opportunity."

        // Configurando os detalhes do Pokémon
        val pokemonHeight: TextView = findViewById(R.id.pokemon_height)
        pokemonHeight.text = "Height: 1.5 m"

        val pokemonCategory: TextView = findViewById(R.id.pokemon_category)
        pokemonCategory.text = "Category: Shadow"

        val pokemonWeight: TextView = findViewById(R.id.pokemon_weight)
        pokemonWeight.text = "Weight: 40.5 kg"

        val pokemonAbility: TextView = findViewById(R.id.pokemon_ability)
        pokemonAbility.text = "Ability: Cursed Body"

        // Configurando o gênero do Pokémon
        val pokemonGender: TextView = findViewById(R.id.pokemon_gender)
        pokemonGender.text = "Gender:"

        // Configurando os ícones de versão
        val iconVersion1: ImageView = findViewById(R.id.icon_version1)
        val iconVersion2: ImageView = findViewById(R.id.icon_version2)
        iconVersion1.setImageResource(R.drawable.icon_version1)
        iconVersion2.setImageResource(R.drawable.icon_version2)

        // Configurando os tipos do Pokémon
        val ghostType: TextView = findViewById(R.id.ghostType)
        ghostType.text = "Ghost"

        val poisonType: TextView = findViewById(R.id.poisonType)
        poisonType.text = "Poison"

        // Configurando as fraquezas do Pokémon
        val groundWeakness: TextView = findViewById(R.id.groundWeakness)
        groundWeakness.text = "Ground"

        val psychicWeakness: TextView = findViewById(R.id.psychicWeakness)
        psychicWeakness.text = "Psychic"

        val ghostWeakness: TextView = findViewById(R.id.ghostWeakness)
        ghostWeakness.text = "Ghost"

        val darkWeakness: TextView = findViewById(R.id.darkWeakness)
        darkWeakness.text = "Dark"
    }
}
