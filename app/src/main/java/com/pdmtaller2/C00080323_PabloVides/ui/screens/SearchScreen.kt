package com.pdmtaller2.C00080323_PabloVides.ui.screens
import Restaurants
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.compose.foundation.lazy.items
import com.pdmtaller2.C00080323_PabloVides.data.Restaurant
import com.pdmtaller2.C00080323_PabloVides.ui.components.DishCard
import com.pdmtaller2.C00080323_PabloVides.ui.layout.CustomScaffold
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun SearchScreen(navController: NavHostController, restaurantId: Int) {
    val selectedRestaurant = Restaurants.find { it.id == restaurantId }
    val snackbarHostState = remember { SnackbarHostState() }
    val coroutineScope = rememberCoroutineScope()


    var searchQuery by remember { mutableStateOf("") }
    var filteredDishes by remember { mutableStateOf(selectedRestaurant?.dishes ?: emptyList()) }
    var isLoading by remember { mutableStateOf(false) }


    LaunchedEffect(searchQuery) {
        isLoading = true
        delay(500)
        filteredDishes = selectedRestaurant?.dishes?.filter { dish ->
            dish.name.contains(searchQuery, ignoreCase = true)
        } ?: emptyList()
        isLoading = false
    }

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


                TextField(
                    value = searchQuery,
                    onValueChange = { searchQuery = it },
                    label = { Text("Search for a dish") },
                    modifier = Modifier.fillMaxWidth(),
                    singleLine = true
                )
                Spacer(modifier = Modifier.height(16.dp))

                if (isLoading) {
                    CircularProgressIndicator(modifier = Modifier.align(Alignment.CenterHorizontally))
                    Spacer(modifier = Modifier.height(16.dp))
                }


                LazyColumn(verticalArrangement = Arrangement.spacedBy(12.dp)) {
                    items(filteredDishes) { dish ->
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
