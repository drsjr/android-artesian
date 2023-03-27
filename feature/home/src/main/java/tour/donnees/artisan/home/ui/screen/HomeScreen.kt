package tour.donnees.artisan.home.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import tour.donnees.arch.component.PokemonItemCard
import tour.donnees.arch.designsystem.*
import tour.donnees.artisan.home.ui.components.SearchTextField
import tour.donnees.domain.pokedex.model.Pokemon

@Composable
fun HomeScreen(pokemonList: List<Pokemon>, searchText: String) {

    var textValue by remember { mutableStateOf(searchText) }


    val searchedPokemon = remember(textValue) {
        if (textValue.isNotBlank()) {
            pokemonList.filter { pokemon: Pokemon ->
                pokemon.name.contains(textValue)
            }
        } else {
            emptyList()
        }
    }

    Column {
        SearchTextField(searchText = textValue, onSearchChange = { newValue ->
            textValue = newValue
        })

        LazyColumn(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp),
            contentPadding = PaddingValues(16.dp)
        ) {

            when {
                textValue.isNotBlank() -> {
                    items(items = searchedPokemon) {
                        PokemonItemCard(pokemon = it)
                    }
                }
                else -> {
                    items(items = pokemonList) {
                        PokemonItemCard(pokemon = it)
                    }
                }
            }

        }
    }


}

@Preview(name = "uiMode", showSystemUi = true)
//@Preview(name = "HomeScreenPreview", heightDp = 800, widthDp = 600, showBackground = true)
@Composable
fun HomePreview() {
    AndroidArtisanTheme {
        Surface {
            HomeScreen(
                listOf(
                    Pokemon(
                        "1", "Bulbasaur", "001", listOf("Grass", "Poison"),
                        "http://10.0.2.2:8000/images/001.png"
                    )
                ),
                searchText = ""
            )
        }
    }
}