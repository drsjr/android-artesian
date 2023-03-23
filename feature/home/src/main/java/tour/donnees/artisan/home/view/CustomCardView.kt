package tour.donnees.artisan.home.view

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import tour.donnees.arch.designsystem.AndroidArtisanTheme
import tour.donnees.arch.designsystem.Shapes
import kotlin.random.Random
import kotlin.random.nextInt


@Composable
fun CustomCardView(description: String, url: String) {

    Box(
        contentAlignment = Alignment.Center
    ) {
        
        Column(Modifier.padding(16.dp)) {
            Surface(

                shape = Shapes.medium,
            ) {
                Box(modifier = Modifier
                    .background(color = Color.LightGray)
                    .padding(16.dp)) {
                    AsyncImage(model = url, contentDescription = description)
                }
            }
            Box(modifier = Modifier
                .fillMaxWidth()
                .padding(4.dp)) {
                Text( text = "$${Random.nextInt(1000)}", fontSize = 12.sp)
            }
        }
        
    }
}

@Composable
fun CustomCardView2(description: String, url: String) {

    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        Box {
            AsyncImage(model = url, contentDescription = description)
        }
        Surface(
            shape = RoundedCornerShape(12.dp)
        ) {
            Box(modifier = Modifier
                .background(color = Color.LightGray)
                .padding(16.dp)) {
                Column(
                ) {
                    Row {
                        Text( text = description, fontSize = 20.sp)
                    }

                    Row {
                        Text( text = "$${Random.nextInt(1000)}", fontSize = 12.sp)
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun CustomCardViewPreview() {
    
    AndroidArtisanTheme {

        Surface(Modifier.padding(20.dp)) {
            CustomCardView2("Pokemon", "https://assets.pokemon.com/assets/cms2/img/pokedex/full//080.png")
        }
    }
    
}