package tour.donnees.artisan.view

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import org.koin.androidx.viewmodel.ext.android.getViewModel
import tour.donnees.arch.designsystem.AndroidArtisanTheme
import tour.donnees.artisan.home.ui.HomeActivity

class MainActivity : ComponentActivity() {

    private val viewModel: MainViewModel by lazy { getViewModel() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            AndroidArtisanTheme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                        .clickable {
                            startActivity(
                                Intent(this, HomeActivity::class.java)
                            )
                        }
                ) {

                }
            }
        }
    }
}