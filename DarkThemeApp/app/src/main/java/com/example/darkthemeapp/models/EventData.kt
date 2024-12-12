package com.example.darkthemeapp.models

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import com.example.darkthemeapp.R


data class Event (
    val id : Int,
    val tittle : String,
    val description : String,
    val date : String,
    val location : String,
    val isFavorite : MutableState<Boolean> = mutableStateOf(false),
    val isSubscribed : MutableState<Boolean> = mutableStateOf(false),
    val imageRes : Int
)

val eventList = listOf(
    Event(
        id = 1,
        tittle = "Conferência de Tecnologia 2024",
        description = "Tendências em tecnologia",
        date = "10/09/2023",
        location = "Parque Tecnológico",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img1
    ),
    Event(
        id = 2,
        tittle = "Hackathon Inovação Digital",
        description = "Maratona de programação e inovação",
        date = "15/10/2023",
        location = "Campus Universitário",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img2
    ),
    Event(
        id = 3,
        tittle = "Palestra: Inteligência Artificial",
        description = "Explorando o futuro da IA",
        date = "20/10/2023",
        location = "Auditório Central",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img3
    ),
    Event(
        id = 4,
        tittle = "Startup Weekend 2024",
        description = "Empreendedorismo em ação",
        date = "05/11/2023",
        location = "Espaço CoWorking",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img4
    ),
    Event(
        id = 5,
        tittle = "Workshop: Desenvolvimento Mobile",
        description = "Introdução ao Jetpack Compose",
        date = "12/11/2023",
        location = "Laboratório de Computação",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img5
    ),
    Event(
        id = 6,
        tittle = "Encontro de Devs 2024",
        description = "Networking e troca de experiências",
        date = "18/11/2023",
        location = "Centro de Convenções",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img6
    ),
    Event(
        id = 7,
        tittle = "Congresso de Ciência de Dados",
        description = "Avanços em Big Data e Machine Learning",
        date = "25/11/2023",
        location = "Salão de Conferências",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img7
    ),
    Event(
        id = 8,
        tittle = "Meetup: Comunidade Open Source",
        description = "Colaboração e novos projetos",
        date = "02/12/2023",
        location = "Espaço Maker",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img8
    ),
    Event(
        id = 9,
        tittle = "Fórum de Segurança Cibernética",
        description = "Estratégias para proteger sistemas",
        date = "09/12/2023",
        location = "Centro Tecnológico",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img9
    ),
    Event(
        id = 10,
        tittle = "Seminário: Robótica e Automação",
        description = "O impacto da robótica no futuro",
        date = "15/12/2023",
        location = "Auditório do Instituto de Tecnologia",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img10
    )
)
