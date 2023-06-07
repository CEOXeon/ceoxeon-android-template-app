package com.ceoxeon.android.template.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.ceoxeon.android.template.app.ui.theme.CEOXeonAndroidTemplateAppTheme
import com.ceoxeon.android.template.app.ui.theme.Typography

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CEOXeonAndroidTemplateAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android and CEOXeon")
                    CustomText(text = "I wasted 1h for this")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun CustomText(text: String, modifier: Modifier = Modifier) {
    Text(
        text = "$text",
        modifier = modifier
        /* style = Typography.h5; I have watched an old tutorial where Compose was in Beta so this doesn't work */
    )
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CEOXeonAndroidTemplateAppTheme {
        Greeting("Android")
    }
}