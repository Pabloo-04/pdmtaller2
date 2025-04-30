package com.pdmtaller2.C00080323_PabloVides.ui.components

import android.R
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.pdmtaller2.C00080323_PabloVides.data.Dish
import com.pdmtaller2.C00080323_PabloVides.ui.theme.BackgroundColor

@Composable
fun DishCard(dish: Dish, onAddClick: () -> Unit) {
    Card(modifier = Modifier.fillMaxWidth()) {
        Row(modifier = Modifier.padding(12.dp)) {
            AsyncImage(
                model = dish.imageUrl,
                contentDescription = dish.name,
                modifier = Modifier.size(80.dp)
            )
            Spacer(modifier = Modifier.width(12.dp))
            Column {
                Text(dish.name, style = MaterialTheme.typography.titleMedium)
                Text(dish.description, style = MaterialTheme.typography.bodyMedium)
                Button(onClick = onAddClick) {
                    Text("Add")
                }
            }
        }
    }
}
