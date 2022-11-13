package tour.donnees.artisan.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.BaselineShift
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import tour.donnees.artisan.view.ui.theme.AndroidArtisanTheme
import tour.donnees.artisan.view.ui.theme.Typography
import tour.donnees.artisan.R
import tour.donnees.artisan.view.ui.ExpandableCard
import tour.donnees.artisan.view.ui.theme.Purple700

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterialApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidArtisanTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize()
                        .padding(16.dp),
                    color = MaterialTheme.colors.background
                ) {
                    ExpandableCard()
                }
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
        Column(modifier = Modifier.fillMaxSize()
            .padding(16.dp)) {
            //SuperScriptText(normalText = "Hello World", superText = "Olá Mundo")
            ExpandableCard()
        }

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



