package tour.donnees.artisan.view.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import tour.donnees.artisan.view.ui.theme.Shapes

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun GoogleButton() {
    var click by remember { mutableStateOf(false) }

    Surface(
        onClick = { click = click.not() },
        shape = Shapes.medium,
        border = BorderStroke(1.dp, color = Color.Gray),
        color = MaterialTheme.colors.surface
    ) {
        Row(
            modifier = Modifier.padding(8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Icon(
                painter = painterResource(id = tour.donnees.artisan.R.drawable.ic_launcher_foreground),
                contentDescription = "Icon",
                tint = Color.Unspecified,
                modifier = Modifier
                    .width(40.dp)
                    .height(40.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = "Sign up with Google"
            )

            if (click) {
                Spacer(modifier = Modifier.width(8.dp))
                CircularProgressIndicator(
                    modifier = Modifier.width(16.dp).height(16.dp),
                    strokeWidth = 2.dp,
                    color = MaterialTheme.colors.primary
                )
            }
        }
    }
}

@Preview
@Composable
fun Preview() {
    GoogleButton()
}