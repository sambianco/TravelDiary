package com.example.traveldiary

import kotlinx.serialization.Serializable

sealed interface Screen {
    @Serializable
    data object Home : Screen

    @Serializable
    data object AddTravel : Screen

    @Serializable
    data object Settings : Screen

    // Questa DEVE essere una data class per accettare il parametro!
    @Serializable
    data class TravelDetails(val travelId: Int) : Screen
}