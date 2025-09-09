package ca.sneakysquid.learnandroid.amphibians.ui.screens.ResultScreen

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun AmphibianCard(
    test: String,
    modifier: Modifier = Modifier
) {
    Text(text = test)
}