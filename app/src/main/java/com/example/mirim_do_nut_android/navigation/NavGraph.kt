package com.example.mirim_do_nut_android.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.mirim_do_nut_android.feature.chat.ChatPage
import com.example.mirim_do_nut_android.feature.home.HomeScreen
import com.example.mirim_do_nut_android.feature.map.MapPage
import com.example.mirim_do_nut_android.feature.profile.ProfilePage

@Composable
fun NavGraph(navController: NavHostController, modifier: Modifier = Modifier) {
    NavHost(navController = navController, startDestination = "home", modifier = modifier) {
        composable ("home") { HomeScreen() }
        composable ("profile") { ProfilePage() }
        composable("map") { MapPage() }
        composable("chat") { ChatPage() }

    }
}