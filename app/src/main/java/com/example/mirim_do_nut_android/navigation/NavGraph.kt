package com.example.mirim_do_nut_android.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.compose.ui.Modifier
import com.example.mirim_do_nut_android.feature.chat.ChatScreen
import com.example.mirim_do_nut_android.feature.home.HomeScreen
import com.example.mirim_do_nut_android.feature.map.MapScreen
import com.example.mirim_do_nut_android.feature.profile.ProfileScreen

@Composable
fun NavGraph(navController: NavHostController, modifier: Modifier = Modifier) {
    NavHost(navController = navController, startDestination = "home", modifier = modifier) {
        composable ("home") { HomeScreen() }
        composable ("profile") { ProfileScreen() }
        composable("map") { MapScreen() }
        composable("chat") { ChatScreen() }

    }
}