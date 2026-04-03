package com.example.traveldiary

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.toRoute
import com.example.traveldiary.ui.screens.AddTravelScreen
import com.example.traveldiary.ui.screens.HomeScreen
import com.example.traveldiary.ui.screens.SettingsScreen
import com.example.traveldiary.ui.screens.TravelDetailsScreen

@Composable
fun NavGraph(navController: NavHostController){
    NavHost(
        navController = navController,
        startDestination = Screen.Home
    ) {
        composable<Screen.Home> { HomeScreen(navController) }
        composable<Screen.AddTravel>{ AddTravelScreen(navController) }
        composable<Screen.Settings> { SettingsScreen(navController) }
        composable<Screen.TravelDetails> { backStackEntry ->
            val details: Screen.TravelDetails = backStackEntry.toRoute()
            TravelDetailsScreen(
                navController = navController,
                travelId = details.travelId
            )
        }
    }
}