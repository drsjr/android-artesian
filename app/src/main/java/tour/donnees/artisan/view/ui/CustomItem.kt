package tour.donnees.artisan.view.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import tour.donnees.artisan.model.Product
import tour.donnees.artisan.view.ui.theme.AndroidArtisanTheme



@Composable
fun ExampleLazyColum() {
    val list = listOf(
        Product(1, "Nice Product"),
        Product(2, "Great Product"),
        Product(3, "Beautiful Product"),
        Product(4, "Awesome Product"),
        Product(5, "Perfect Product"),
        Product(6, "Perfect Product"),
        Product(7, "Perfect Product"),
        Product(8, "Perfect Product"),
        Product(9, "Perfect Product"),
        Product(9, "Perfect Product"),
        Product(9, "Perfect Product"),
        Product(9, "Perfect Product"),
        Product(9, "Perfect Product"),
        Product(9, "Perfect Product"),
        Product(9, "Perfect Product"),
        Product(9, "Perfect Product"),
        Product(9, "Perfect Product"),
        Product(9, "Perfect Product"),
        Product(9, "Perfect Product"),
        Product(9, "Perfect Product"),
        Product(9, "Perfect Product"),
        Product(9, "Perfect Product"),
    )
    LazyColumn(
        modifier = Modifier.fillMaxWidth(),
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        items(list) { product ->
            CustomItem(product = product)
        }
    }
}

@Composable
fun CustomItem(product: Product) {
    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth()
            .background(Color.Gray), 
        ) {
        Text(text = product.id.toString(), fontSize = 48.sp)
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = product.name, fontSize = 36.sp)
    }
}

@Preview
@Composable
fun CustomItemPreview() {
    AndroidArtisanTheme {
        ExampleLazyColum()
    }
}