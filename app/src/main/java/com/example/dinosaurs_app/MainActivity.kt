package com.example.dinosaurs_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode.Companion.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dinosaurs_app.data.DataSource
import com.example.dinosaurs_app.model.Dinosaurs_App
import com.example.dinosaurs_app.ui.theme.Dinosaurs_AppTheme
import androidx.compose.foundation.lazy.items
import com.example.dinosaurs_app.data.DataSource.dinosaursApp

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
                    Dinosaurs_App()
                }
            }
        }
    }
}
@Preview
@Composable
fun Dinosaurs_App() {
    Dinosaurs_AppList(DataSource.dinosaursApp)
}

@Composable
fun Dinosaurs_AppList(dinosaursAppList: List<Dinosaurs_App>, modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier) {
        items(dinosaursAppList) { dinosaursApp ->
            Dinosaurs_AppCard(
                dinosaursApp = dinosaursApp,
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}

@Composable
fun Dinosaurs_AppCard(dinosaursApp: Dinosaurs_App, modifier: Modifier = Modifier) {
    Card(modifier = modifier) {
        Column {
            Image(
                painter = painterResource(id = dinosaursApp.imageResourceId),
                contentDescription = stringResource(id = dinosaursApp.name), // Assuming name holds the content description
                modifier = Modifier
                    .fillMaxWidth()
                    .height(194.dp)
                    .background(Color.Black),
            )
            Text(
                text = stringResource(id = dinosaursApp.description),
                modifier = Modifier.padding(16.dp),
                style = MaterialTheme.typography.headlineSmall // Adjusted the style to headline
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
