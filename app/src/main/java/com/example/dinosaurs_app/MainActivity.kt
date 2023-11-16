package com.example.dinosaurs_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.dinosaurs_app.data.DataSource
import com.example.dinosaurs_app.model.Dinosaurs_App
import com.example.dinosaurs_app.ui.theme.Dinosaurs_AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Dinosaurs_AppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    DinosaursAppContent()
                }
            }
        }
    }
}

@Composable
fun DinosaursAppContent() {
    Dinosaurs_App(name = "T-Rex")
}

@Composable
fun Dinosaurs_App(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
    Dinosaurs_AppCard(dinosaursApp = DataSource.dinosaursApp[0])
}

@Composable
fun Dinosaurs_AppCard(dinosaursApp: Dinosaurs_App, modifier: Modifier = Modifier) {
    Card(modifier = modifier) {
        Column {
            Image(
                painter = painterResource(id = dinosaursApp.imageResourceId),
                contentDescription = stringResource(id = dinosaursApp.stringResourceId)
                
            )

        }
    }
}

@Preview
@Composable
fun Dinosaurs_AppCardPreview() {
    Dinosaurs_AppTheme {
        Dinosaurs_AppCard(dinosaursApp = DataSource.dinosaursApp[0])
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Dinosaurs_AppTheme {
        Dinosaurs_App(name = "T-Rex")
    }
}