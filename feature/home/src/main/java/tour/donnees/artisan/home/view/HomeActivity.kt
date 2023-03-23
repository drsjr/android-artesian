package tour.donnees.artisan.home.view


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import tour.donnees.arch.component.BaseItemCard
import tour.donnees.arch.designsystem.AndroidArtisanTheme
import tour.donnees.artisan.home.R
import kotlin.random.Random

class HomeActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidArtisanTheme {
                Surface {
                    HomeScreen()
                }
            }
        }
    }
}



@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Spacer(Modifier)
        repeat(20) {
            BaseItemCard(itemName = "Pokemon", itemValue = Random.nextInt(100), image = painterResource(id = R.drawable.pokke))

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
            HomeScreen()
        }
    }
}