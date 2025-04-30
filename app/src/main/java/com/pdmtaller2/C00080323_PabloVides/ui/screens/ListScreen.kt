package com.pdmtaller2.C00080323_PabloVides.ui.screens

import Restaurants
import com.pdmtaller2.C00080323_PabloVides.ui.layout.CustomScaffold
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.pdmtaller2.C00080323_PabloVides.data.Restaurant
import com.pdmtaller2.C00080323_PabloVides.navigation.Search
import com.pdmtaller2.C00080323_PabloVides.ui.components.RestaurantCard


@Composable
fun ListScreen(navController: NavHostController, onClick: (Int) -> Unit) {
    val categories = listOf("Mexican", "Italian", "Burgers")

    CustomScaffold(navController = navController) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(24.dp)
        ) {
            categories.forEach { category ->
                item {
                    val filteredRestaurants = Restaurants.filter { it.category == category }
                    println("Filtered restaurants for $category: $filteredRestaurants")
                    if (filteredRestaurants.isNotEmpty()) {
                        CategoryRow(
                            category = category,
                            restaurants = filteredRestaurants,
                            onClick = onClick
                        )
                    }
                }
            }
        }
    }
}


@Composable
fun CategoryRow(
    category: String,
    restaurants: List<Restaurant>,
   onClick: (Int) -> Unit,
) {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            text = category,
            style = MaterialTheme.typography.headlineSmall.copy(
                fontSize = 22.sp,
            ),
            modifier = Modifier.padding(start = 8.dp, bottom = 8.dp)
        )
        LazyRow(
            contentPadding = PaddingValues(horizontal = 8.dp),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(restaurants) { restaurant ->
                RestaurantCard(
                    restaurant = restaurant,
                    onClick = {onClick}
                )

            }
        }
    }
}

