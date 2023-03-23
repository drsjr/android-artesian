package tour.donnees.arch.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import tour.donnees.arch.designsystem.*
import tour.donnees.domain.pokedex.model.Pokemon


@Composable
fun PokemonItemCard(pokemon: Pokemon) {
    Surface(
        modifier = Modifier.sizeIn(110.dp),
        shape = Shapes.large,
        elevation = 6.dp) {
        Column {
            Box(modifier = Modifier
                .sizeIn(110.dp)
                .background(
                    brush = Brush.verticalGradient(
                        listOf(Purple700, Purple500, Purple200, White)
                    )
                )
                .padding(8.dp)
            ) {
                AsyncImage(
                    modifier = Modifier
                        .size(100.dp)
                        .align(Alignment.Center),
                    model = pokemon.urlImage, contentDescription = pokemon.name)
            }
            Column(
                modifier = Modifier.padding(8.dp),
            ) {
                Text( text = "#${pokemon.nameId}", fontSize = 12.sp, fontStyle = FontStyle.Italic, fontWeight = FontWeight(100))
                Text( text = pokemon.name, maxLines = 1, fontSize = 14.sp)
            }
        }
    }
}

/**
 * {
    "id": "1",
    "nameId": "001",
    "name": "Bulbasaur",
    "type": [
    "Grass",
    "Poison"
    ],
    "url": "http://10.0.2.2:8000/images/001.png"
    }
 */
@Preview(showBackground = true)
@Composable
fun BaseItemCardPreview() {
    AndroidArtisanTheme {
        Surface(modifier = Modifier.padding(16.dp)) {
            PokemonItemCard(Pokemon(
                "1", "Bulbasaur", "001", listOf("Grass", "Poison"),
                "http://10.0.2.2:8000/images/001.png"
            ))
        }
    }
}