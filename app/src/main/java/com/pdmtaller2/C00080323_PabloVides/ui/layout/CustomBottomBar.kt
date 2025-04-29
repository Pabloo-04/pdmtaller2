package com.pdmtaller2.C00080323_PabloVides.ui.layout

import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart

import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.List
import androidx.compose.material.icons.outlined.MailOutline
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.pdmtaller2.C00080323_PabloVides.navigation.List
import com.pdmtaller2.C00080323_PabloVides.navigation.Order
import com.pdmtaller2.C00080323_PabloVides.navigation.Search
import com.pdmtaller2.C00080323_PabloVides.ui.theme.BackgroundColor
import com.pdmtaller2.C00080323_PabloVides.ui.theme.MainAccent
import com.pdmtaller2.C00080323_PabloVides.ui.theme.MainColor
import com.pdmtaller2.C00080323_PabloVides.ui.theme.SecondaryAccent


data class NavItem(val label: String, val icon: ImageVector, val route: String)

@Composable
fun CustomBottomBar(navController: NavHostController) {
    val navItems = listOf(
        NavItem("Restaurants", Icons.Filled.ShoppingCart, List::class.qualifiedName!!),
        NavItem("Search", Icons.Outlined.Menu, Search::class.qualifiedName!!),
        NavItem("Order", Icons.Outlined.MailOutline, Order::class.qualifiedName!!)
        )

    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination?.route


    NavigationBar(
        containerColor = MainAccent,
    ) {
        navItems.forEach { item ->
            NavigationBarItem(
                label = { Text(item.label) },
                icon = { Icon(imageVector = item.icon, contentDescription = item.label) },
                selected = currentDestination == item.route,
                onClick = {
                    if (currentDestination != item.route) {
                        navController.navigate(item.route) {
                            popUpTo(navController.graph.startDestinationId) { saveState = true }
                            launchSingleTop = true
                            restoreState = true
                        }
                    }
                },

                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = MainColor,
                    unselectedIconColor = SecondaryAccent,
                    selectedTextColor = Color.Black,
                    unselectedTextColor = Color.Gray,
                    indicatorColor = BackgroundColor,
                )
            )
        }
    }
}
