package com.example.miam

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent { App() }
  }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun App() {
  MaterialTheme {
    Scaffold(topBar = { TopAppBar(title = { Text("Miam-Miam") }) }) { pad ->
      Column(Modifier.padding(pad).padding(16.dp)) {
        Text("Projet minimal OK ✅")
        Text("On ajoutera frigo/congélo/recettes après que la CI soit verte.")
      }
    }
  }
}
