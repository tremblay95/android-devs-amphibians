package ca.sneakysquid.learnandroid.amphibians.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import ca.sneakysquid.learnandroid.amphibians.ui.screens.ResultScreen.AmphibianCard

@Composable
fun ResultScreen(amphibians: String, modifier: Modifier = Modifier) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
    ) {
        Text(
            text = amphibians
        )
    }
    /*val amphibians = List(10) { it }
    LazyColumn() {
        items(amphibians) {
            AmphibianCard("Amphibian #$it")
        }
    }*/
}