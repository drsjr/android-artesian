package tour.donnees.artisan.home.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import tour.donnees.arch.component.PokemonItemCard
import tour.donnees.arch.designsystem.AndroidArtisanTheme
import tour.donnees.domain.pokedex.model.Pokemon

@Composable
fun HomeScreen(pokemonList: List<Pokemon>) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Spacer(Modifier)
        for (p in pokemonList) {
            PokemonItemCard(p)
        }
        Spacer(Modifier)
    }
}

@Preview(name = "uiMode", showSystemUi = true)
//@Preview(name = "HomeScreenPreview", heightDp = 800, widthDp = 600, showBackground = true)
@Composable
fun HomePreview(){
    AndroidArtisanTheme {
        Surface {
            HomeScreen(listOf(
                Pokemon(
                    "1", "Bulbasaur", "001", listOf("Grass", "Poison"),
                    "http://10.0.2.2:8000/images/001.png"
                )
            ))
        }
    }
}