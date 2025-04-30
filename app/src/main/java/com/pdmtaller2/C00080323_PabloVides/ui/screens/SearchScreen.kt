package com.pdmtaller2.C00080323_PabloVides.ui.screens

import Restaurants
import com.pdmtaller2.C00080323_PabloVides.ui.layout.CustomScaffold
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.pdmtaller2.C00080323_PabloVides.data.Restaurant


@Composable
fun SearchScreen(navController: NavHostController, restaurantId: Int) {

    val selectedRestaurant = Restaurants.find { it.id == restaurantId }

    CustomScaffold(navController = navController) {
        Column(
            modifier = Modifier.fillMaxSize().padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            if (selectedRestaurant != null) {
                Text("Menu of ${selectedRestaurant.name}", fontSize = 24.sp)
            } else {

                Text("No restaurant selected.", fontSize = 20.sp)
            }
        }
    }
}

