@file:OptIn(ExperimentalMaterial3Api::class)

package ca.sneakysquid.learnandroid.amphibians.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import ca.sneakysquid.learnandroid.amphibians.R
import ca.sneakysquid.learnandroid.amphibians.ui.screens.AmphibiansViewModel
import ca.sneakysquid.learnandroid.amphibians.ui.screens.HomeScreen
import ca.sneakysquid.learnandroid.amphibians.ui.theme.AmphibiansTheme

@Composable
fun AmphibiansApp() {
    Scaffold (
        modifier = Modifier,
        topBar = { AmphibiansTopAppBar() }
    ) { innerPadding ->
        Surface (
            modifier = Modifier.fillMaxSize()
        ) {
            val amphibiansViewModel : AmphibiansViewModel = viewModel(factory = AmphibiansViewModel.Factory)
            HomeScreen(
                amphibianUiState = amphibiansViewModel.amphibianUiState,
                contentPadding = innerPadding
            )
        }
    }
}

@Composable
fun AmphibiansTopAppBar(modifier: Modifier = Modifier) {
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = stringResource(R.string.app_name),
                style = MaterialTheme.typography.headlineSmall
            )
        },
        modifier = modifier
    )
}

@Preview
@Composable
fun AmphibiansAppPreview() {
    AmphibiansTheme {
        AmphibiansApp()
    }
}
