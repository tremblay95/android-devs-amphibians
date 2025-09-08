package ca.sneakysquid.learnandroid.amphibians.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import ca.sneakysquid.learnandroid.amphibians.ui.screens.HomeScreen

@Composable
fun AmphibiansApp() {
    Scaffold (
        modifier = Modifier,
        topBar = { AmphibiansTopAppBar() }
    ) { innerPadding ->
        Surface (
            modifier = Modifier.fillMaxSize()
        ) {
            HomeScreen(contentPadding = innerPadding)
        }
    }
}

@Composable
fun AmphibiansTopAppBar() {
}