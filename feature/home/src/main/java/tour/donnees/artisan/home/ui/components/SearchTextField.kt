package tour.donnees.artisan.home.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun SearchTextField(searchText: String, onSearchChange: (String) -> Unit) {
    OutlinedTextField(
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                top = 16.dp, start = 16.dp, end = 16.dp
            ),
        value = searchText,
        onValueChange = onSearchChange,
        shape = RoundedCornerShape(75),
        leadingIcon = {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = Icons.Default.Search.name
            )
        },
        label = { Text(text = "Pokemon") }
    )
}