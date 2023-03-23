package tour.donnees.arch.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import tour.donnees.arch.designsystem.*


@Composable
fun BaseItemCard(
    itemName: String, 
    itemValue: Int, 
    image: Painter
) {
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
                Image(
                    modifier = Modifier
                        .size(100.dp)
                        .align(Alignment.Center),
                    painter = image, contentDescription = "Teste")
            }
            Column(
                modifier = Modifier.padding(8.dp),
            ) {
                Text( text = itemName, maxLines = 1, fontSize = 14.sp)
                Text( text = "\$$itemValue", fontSize = 12.sp, fontStyle = FontStyle.Italic, fontWeight = FontWeight(100))
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun BaseItemCardPreview() {
    AndroidArtisanTheme {
        Surface(modifier = Modifier.padding(16.dp)) {
            BaseItemCard("Item Name", 79, painterResource(id = android.R.drawable.ic_dialog_email))
        }
    }
}