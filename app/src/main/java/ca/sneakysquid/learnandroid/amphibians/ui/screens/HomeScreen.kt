package ca.sneakysquid.learnandroid.amphibians.ui.screens

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ca.sneakysquid.learnandroid.amphibians.ui.screens.HomeScreen.AmphibianCard

@Preview(showBackground = true)
@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    contentPadding: PaddingValues = PaddingValues(0.dp)
) {
    val amphibians = List(10) { it }
    LazyColumn() {
        items(amphibians) {
            AmphibianCard("Amphibian #$it")
        }
    }
}