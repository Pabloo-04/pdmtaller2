package com.pdmtaller2.C00080323_PabloVides.ui.screens

import com.pdmtaller2.C00080323_PabloVides.ui.layout.CustomScaffold
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.pdmtaller2.C00080323_PabloVides.data.Restaurant
import com.pdmtaller2.C00080323_PabloVides.ui.components.RestaurantCard


@Composable
fun ListScreen(navController: NavHostController) {
    // Dummy data – replace with your real data


    CustomScaffold(navController = navController) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(24.dp)
        ) {
            item {
                CategoryRow("Mexican", mexicanRestaurants)
            }
            item {
                CategoryRow("Italian", italianRestaurants)
            }
            item {
                CategoryRow("Burgers", burgerRestaurants)
            }
        }
    }
}

@Composable
fun CategoryRow(category: String, restaurants: List<Restaurant>) {
    Column {
        Text(
            text = category,
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier.padding(bottom = 8.dp)
        )
        LazyRow(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
            items(restaurants) { restaurant ->
                RestaurantCard(restaurant = restaurant, onClick = {
                    // handle selection or navigation here
                })
            }
        }
    }
}

