package tour.donnees.artisan.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import org.koin.androidx.viewmodel.ext.android.getViewModel
import tour.donnees.arch.designsystem.AndroidArtisanTheme
import tour.donnees.artisan.home.view.HomeScreen

class MainActivity : ComponentActivity() {

    private val viewModel: MainViewModel by lazy { getViewModel() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidArtisanTheme {
                HomeScreen()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AndroidArtisanTheme {
        HomeScreen()
    }
}
