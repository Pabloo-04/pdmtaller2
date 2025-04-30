package com.pdmtaller2.C00080323_PabloVides.ui.layout



import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

@Composable
fun CustomScaffold(
    navController: NavHostController,
    snackbarHostState: SnackbarHostState? = null,
    content: @Composable () -> Unit
) {
    Scaffold(
        bottomBar = {
            CustomBottomBar(navController = navController)
        },
        snackbarHost = { snackbarHostState?.let { SnackbarHost(hostState = it) } }  // Only show snackbar if state is provided
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally
        ) {
            content()
        }
    }
}
