package com.shiddiq.composenote

import android.content.Context
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.navigation.compose.composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController

import com.google.accompanist.pager.ExperimentalPagerApi
import com.shiddiq.composenote.screens.home.HomeScreen
import kotlinx.coroutines.InternalCoroutinesApi

@ExperimentalAnimationApi
@InternalCoroutinesApi
@ExperimentalPagerApi
@ExperimentalMaterialApi
@Composable
fun AppNavigation (
    context: Context,
){
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "/home"
    ) {
        composable(route = "/home") { HomeScreen() }
    }
}
