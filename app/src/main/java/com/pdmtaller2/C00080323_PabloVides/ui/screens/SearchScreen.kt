package com.pdmtaller2.C00080323_PabloVides.ui.screens

import Restaurants
import com.pdmtaller2.C00080323_PabloVides.ui.layout.CustomScaffold
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.compose.runtime.rememberCoroutineScope
import kotlinx.coroutines.launch
import androidx.compose.material3.SnackbarDuration
import androidx.compose.material3.SnackbarHost
import com.pdmtaller2.C00080323_PabloVides.data.Restaurant
import com.pdmtaller2.C00080323_PabloVides.ui.components.DishCard


@Composable
fun SearchScreen(navController: NavHostController, restaurantId: Int) {
    val selectedRestaurant = Restaurants.find { it.id == restaurantId }
    val snackbarHostState = remember { SnackbarHostState() }
    val coroutineScope = rememberCoroutineScope()

    CustomScaffold(navController = navController, snackbarHostState = snackbarHostState) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            if (selectedRestaurant != null) {
                Text(
                    text = "Menu of ${selectedRestaurant.name}",
                    fontSize = 24.sp,
                    modifier = Modifier.padding(bottom = 16.dp)
                )

                LazyColumn(verticalArrangement = Arrangement.spacedBy(12.dp)) {
                    items(selectedRestaurant.dishes) { dish ->
                        DishCard(dish = dish) {
                            coroutineScope.launch {
                                snackbarHostState.showSnackbar(
                                    message = "${dish.name} added successfully"
                                )
                            }
                        }
                    }
                }
            } else {
                Text("No restaurant selected.", fontSize = 20.sp)
            }
        }
    }
}
