package com.example.profileapp;

data class Pokemon(
    val description: String,
    val height: String,
    val weight: String,
    val category: String,
    val ability: String,
    val gender: Gender,
    val types: List<String>,
    val weaknesses: List<String>
)

enum class Gender {
    MALE,
    FEMALE,
    MALE_FEMALE,
    UNKNOWN
}
