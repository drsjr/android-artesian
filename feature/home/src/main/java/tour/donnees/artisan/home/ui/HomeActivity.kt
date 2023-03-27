package tour.donnees.artisan.home.ui


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import org.koin.androidx.viewmodel.ext.android.viewModel
import tour.donnees.arch.designsystem.AndroidArtisanTheme
import tour.donnees.artisan.home.ui.screen.HomeScreen
import tour.donnees.artisan.home.viewmodel.HomeViewModel
import tour.donnees.domain.pokedex.model.Pokemon

class HomeActivity : ComponentActivity() {

    private val viewModel by viewModel<HomeViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Home(pokemonList())
        }
        viewModel.getPokemon()
    }

    private fun pokemonList(): List<Pokemon> {
        return listOf(
            Pokemon(
                "1", "Bulbasaur", "001", listOf("Grass", "Poison"),
                "http://10.0.2.2:8000/images/001.png"
            ),
            Pokemon(
                "1", "Venossaur", "003", listOf("Grass", "Poison"),
                "http://10.0.2.2:8000/images/003.png"
            ),
            Pokemon(
                "1", "Charmander", "004", listOf("Grass", "Poison"),
                "http://10.0.2.2:8000/images/004.png"
            ),
            Pokemon(
                "1", "Raychu", "026", listOf("Grass", "Poison"),
                "http://10.0.2.2:8000/images/026.png"
            ),
            Pokemon(
                "1", "Pikachu", "025", listOf("Grass", "Poison"),
                "http://10.0.2.2:8000/images/025.png"
            )
        )
    }
}

@Composable
fun Home(pokemonList: List<Pokemon>) {
    AndroidArtisanTheme {
        Surface {
            HomeScreen(pokemonList, "a")
        }
    }
}

@Preview(name = "uiMode", showSystemUi = true)
@Composable
fun HomePreview() {
   Home(listOf(
       Pokemon(
           "1", "Bulbasaur", "001", listOf("Grass", "Poison"),
           "http://10.0.2.2:8000/images/001.png"
       ),
       Pokemon(
           "1", "Venossaur", "003", listOf("Grass", "Poison"),
           "http://10.0.2.2:8000/images/002.png"
       ),
       Pokemon(
           "1", "Charmander", "004", listOf("Grass", "Poison"),
           "http://10.0.2.2:8000/images/101.png"
       ),
       Pokemon(
           "1", "Raychu", "026", listOf("Grass", "Poison"),
           "http://10.0.2.2:8000/images/201.png"
       ),
       Pokemon(
           "1", "Pikachu", "025", listOf("Grass", "Poison"),
           "http://10.0.2.2:8000/images/301.png"
       )
   ))
}