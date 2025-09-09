package ca.sneakysquid.learnandroid.amphibians.ui.screens

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ca.sneakysquid.learnandroid.amphibians.ui.theme.AmphibiansTheme


@Composable
fun HomeScreen(
    amphibianUiState: AmphibianUiState,
    modifier: Modifier = Modifier,
    contentPadding: PaddingValues = PaddingValues(0.dp)
) {
    when (amphibianUiState) {
        is AmphibianUiState.Loading -> LoadingScreen(modifier = modifier.fillMaxSize())
        is AmphibianUiState.Success -> ResultScreen(
            amphibianUiState.amphibians, modifier = modifier.fillMaxSize()
        )
        is AmphibianUiState.Error -> ErrorScreen(modifier = modifier.fillMaxSize())
    }
}



@Preview(showBackground = true)
@Composable
fun HomeScreenLoadingPreview()
{
    AmphibiansTheme {
        HomeScreen(AmphibianUiState.Loading)
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenErrorPreview()
{
    AmphibiansTheme {
        HomeScreen(AmphibianUiState.Error)
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenSuccessPreview()
{
    AmphibiansTheme {
        HomeScreen(AmphibianUiState.Success("Placeholder"))
    }
}
