package com.pdmtaller2.C00080323_PabloVides.ui.screens

import com.pdmtaller2.C00080323_PabloVides.ui.layout.CustomScaffold
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
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
import com.pdmtaller2.C00080323_PabloVides.ui.components.DishCard


@Composable
fun OrderScreen(navController: NavHostController, restaurant: Restaurant?) {
    CustomScaffold(navController = navController) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            if (restaurant == null) {
                Text(
                    text = "No restaurant selected.",
                    style = MaterialTheme.typography.headlineSmall
                )
            } else {
                Text(
                    text = "Menu - ${restaurant.name}",
                    style = MaterialTheme.typography.headlineMedium
                )

                Spacer(modifier = Modifier.height(16.dp))

                LazyColumn(verticalArrangement = Arrangement.spacedBy(12.dp)) {
                    items(restaurant.dishes) { dish ->
                        DishCard(dish = dish)
                    }
                }
            }
        }

    }
}
