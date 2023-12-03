package com.cantrk.recipefinderwithcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.cantrk.recipefinderwithcompose.ui.screens.HomeScreen
import com.cantrk.recipefinderwithcompose.ui.theme.RecipeFinderWithComposeTheme
import com.cantrk.recipefinderwithcompose.ui.viewmodel.RecipeViewModel

class MainActivity : ComponentActivity() {
    private val viewModel : RecipeViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RecipeFinderWithComposeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    HomeScreen(recipeViewModel = viewModel)
                }
            }
        }
    }
}
