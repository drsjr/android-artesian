package tour.donnees.artisan.view

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.BaselineShift
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import tour.donnees.artisan.view.ui.theme.AndroidArtisanTheme
import tour.donnees.artisan.view.ui.theme.Typography
import tour.donnees.artisan.R
import tour.donnees.artisan.view.ui.CoilImage
import tour.donnees.artisan.view.ui.ExampleLazyColum
import tour.donnees.artisan.view.ui.GoogleButton
import tour.donnees.artisan.view.ui.SignIn
import tour.donnees.artisan.view.ui.theme.Purple700

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterialApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidArtisanTheme {
                // A surface container using the 'background' color from the theme
               ExampleLazyColum()
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Composable
fun CustomText(text: String) {
    Text(
        text = text,
        style = Typography.h5
    )
}


@Composable
fun ColumnScope.CustomItem(weight: Float, color: Color = MaterialTheme.colors.secondary) {
    Surface(
        modifier = Modifier
            .width(200.dp)
            .weight(weight),
        color = color,

        ) {}
}

@Composable
fun RowScope.CustomItem2(weight: Float, color: Color = MaterialTheme.colors.secondary) {
    Surface(
        modifier = Modifier
            .height(50.dp)
            .weight(weight),
        color = color,

        ) {}
}

@OptIn(ExperimentalMaterialApi::class)
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AndroidArtisanTheme {
        /*Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally) {
            CustomItem(weight = 1f)
            CustomItem(weight = 3f, color = MaterialTheme.colors.primary)
        }
        
        Row(
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.Start) {
            CustomItem2(weight = 3f)
            CustomItem2(weight = 1f, color = MaterialTheme.colors.primary)
        }
        TheBox()
        CustomText()
        CustomTextWithAnnotatedString()*/
        ExampleLazyColum()

        //Column(modifier = Modifier
          ///  .fillMaxSize()
           // .padding(16.dp)) {
            //SuperScriptText(normalText = "Hello World", superText = "Olá Mundo")
            //ExpandableCard()
            //CustomTextField()
            //GoogleButton()
            //CoilImage()
         //   SignIn()
       // }

    }
}

@Composable
fun TheBox() {
    Box(modifier = Modifier.fillMaxSize(),
    contentAlignment = Alignment.TopCenter
    ) {
        Box(modifier = Modifier
            .background(Color.Blue)
            .width(100.dp)
            .height(100.dp)
            .verticalScroll(rememberScrollState())){
            Text(text = "Android is Great because i love it", fontSize = 24.sp)
            Box(modifier = Modifier
                .background(Color.Yellow)
                .width(20.dp)
                .height(20.dp))
        }
    }
}

@Composable
fun CustomText() {
    Column(modifier = Modifier.fillMaxSize()) {
        Text(
            text = stringResource(id = R.string.app_name),
            modifier = Modifier
                .background(MaterialTheme.colors.primary)
                .padding(16.dp)
                .fillMaxWidth(),
            color = Color.Yellow,
            fontSize = MaterialTheme.typography.h5.fontSize,
            fontWeight = FontWeight.Light,
            textAlign = TextAlign.End

        )
    }
}

@Composable
fun CustomTextWithAnnotatedString() {
    Column(modifier = Modifier.fillMaxSize()) {
        Text(
            buildAnnotatedString {
                withStyle(
                    style = SpanStyle(
                        fontSize = 30.sp,
                        fontWeight = FontWeight.ExtraBold,
                        color = Purple700

                    )
                ) {
                    append("A")

                }
                append("B")
                append("C")
                append("D")
            }
        )
    }
}

@Composable
fun SuperScriptText(
    normalText: String,
    superText: String
) {
    Text(buildAnnotatedString {
        withStyle(
            style = SpanStyle(
                fontSize = MaterialTheme.typography.subtitle1.fontSize
            )
        ) {
            append(text = normalText)
        }

        withStyle(
            style = SpanStyle(
                fontSize = MaterialTheme.typography.overline.fontSize,
                fontWeight = FontWeight.Normal,
                baselineShift = BaselineShift.Superscript
            )
        ) {
            append(text = superText)
        }
    })
}

@Composable
fun CustomTextField() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        var text by remember { mutableStateOf("Type here...") }
        BasicTextField(
            value = text,
            onValueChange = { newText ->
                text = newText
            },
            //enabled = false,
            //readOnly = true,
           // label = {
           //     Text(text = "Text")
           // },
            //singleLine = true,
            maxLines = 5,
            /*leadingIcon = {
                IconButton(
                    onClick = {

                    }) {
                    Icon(
                        imageVector = Icons.Filled.Email,
                        contentDescription = "Email Icon")
                }
            },
            trailingIcon = {
                IconButton(
                    onClick = {
                        Log.d("", " ")
                    }) {
                    Icon(
                        imageVector = Icons.Filled.Check,
                        contentDescription = "Email Icon")
                }
            },*/
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email,
                imeAction = ImeAction.Search
            ),
            keyboardActions = KeyboardActions(
                onSearch = {
                    Log.d("Trailing", "CLicked")
                }
            )
        )
    }

}



