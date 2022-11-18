package tour.donnees.artisan.view.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import tour.donnees.artisan.view.ui.theme.AndroidArtisanTheme


@Composable
fun SignIn() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        var password by rememberSaveable { mutableStateOf("") }
        var visibility by remember { mutableStateOf(false) }

        val icon = if (visibility) {
            painterResource(id = android.R.drawable.arrow_down_float) 
        } else {
            painterResource(id = android.R.drawable.arrow_up_float)
        }

        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text(text = "Password") },
            placeholder = { Text(text = "Password") },
            trailingIcon = {
                IconButton(onClick = {
                    visibility = visibility.not()
                }) {
                    Icon(painter = icon,
                        contentDescription = "")
                }
            },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password
            ),
            singleLine = true,
            visualTransformation = if (visibility) VisualTransformation.None else PasswordVisualTransformation()
        )
    }
}

@Composable
@Preview
fun SignInPreview() {
    AndroidArtisanTheme {
        SignIn()
    }
}