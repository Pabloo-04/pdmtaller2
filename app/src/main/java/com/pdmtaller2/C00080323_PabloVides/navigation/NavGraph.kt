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
data class Search(val restaurantId: Int) {
    companion object {
        fun create(restaurantId: Int): String {
            return "search_screen/$restaurantId"
        }
    }
}

@Serializable
object Order




@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "list") {
        composable("list") {
            ListScreen(navController) { restaurantId ->
                navController.navigate("search_screen/$restaurantId")
            }
        }

        composable("search_screen/{restaurantId}") { backStackEntry ->
            val restaurantId = backStackEntry.arguments?.getString("restaurantId")?.toIntOrNull() ?: 0
            SearchScreen(navController, restaurantId)
        }
    }
}
