package tour.donnees.artisan.view.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImagePainter
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest
import coil.size.Size
import coil.transform.CircleCropTransformation
import coil.transform.Transformation
import tour.donnees.artisan.R

@Composable
fun CoilImage() {
    Box(
        modifier = Modifier
            .width(500.dp)
            .height(600.dp),
        contentAlignment = Alignment.Center) {
        val url = "https://i.pinimg.com/originals/d5/45/db/d545db2e55270b7cf8ae58b9323e0677.jpg"

        val painter = rememberAsyncImagePainter(
            model = ImageRequest.Builder(LocalContext.current)
                .data(url)
                .placeholder(R.drawable.ic_launcher_foreground)
                .crossfade(2000)
                .transformations(
                    CircleCropTransformation()
                )

                .size(Size.ORIGINAL) // Set the target size to load the image at.
                .build()
        )

        if (painter.state is AsyncImagePainter.State.Success) {
            // This will be executed during the first composition if the image is in the memory cache.
            //CircularProgressIndicator()
        }

        Image(
            painter = painter,
            contentDescription = "Nice Image"
        )
    }
}