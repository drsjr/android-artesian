package tour.donnees.artisan.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.compose.SubcomposeAsyncImage
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest
import coil.size.Size
import kotlinx.coroutines.coroutineScope
import org.koin.androidx.viewmodel.ext.android.getViewModel
import tour.donnees.arch.designsystem.AndroidArtisanTheme
import kotlin.coroutines.coroutineContext

class MainActivity : ComponentActivity() {


    private val viewModel: MainViewModel by lazy { getViewModel() }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            AndroidArtisanTheme {
                val test = viewModel.list.value
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background,

                ) {
                    LazyColumn(contentPadding = PaddingValues(16.dp),
                    verticalArrangement = Arrangement.spacedBy(12.dp)) {

                        items(items = test) {
                            Greeting2(name = it.name, url = it.url)
                        }
                    }
                }
            }
        }

        viewModel.getAllCards()

    }
}


@Composable
fun Greeting2(name: String, url: String) {
    Box(modifier = Modifier
        .background(Color.Black)) {
        AsyncImage(
            model = "https://assets.pokemon.com/assets/cms2/img/pokedex/full//080.png",
            contentDescription = name
        )


    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AndroidArtisanTheme {
        Greeting2("Nice", "nice")
    }
}
