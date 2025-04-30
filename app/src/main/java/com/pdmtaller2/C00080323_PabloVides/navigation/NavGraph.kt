package com.pdmtaller2.C00080323_PabloVides.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.pdmtaller2.C00080323_PabloVides.data.Restaurant
import kotlinx.serialization.Serializable

import com.pdmtaller2.C00080323_PabloVides.ui.screens.ListScreen
import com.pdmtaller2.C00080323_PabloVides.ui.screens.OrderScreen
import com.pdmtaller2.C00080323_PabloVides.ui.screens.SearchScreen

@Serializable
object List

@Serializable
data class Search(val restaurantId: Int)

@Serializable
object Order




@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = List) {
        composable<List> {
            val onRestaurantClick = { ClickId: Int ->
                navController.navigate(SearchScreen(navController, ClickId))
            }
            ListScreen(navController, onClick = )
        }

        composable<Search> {
        }


        // Add Order screen similarly
    }
}