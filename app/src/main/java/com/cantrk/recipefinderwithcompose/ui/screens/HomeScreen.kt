package com.cantrk.recipefinderwithcompose.ui.screens

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import com.cantrk.recipefinderwithcompose.ui.components.ErrorComponent
import com.cantrk.recipefinderwithcompose.ui.components.LoadingComponent
import com.cantrk.recipefinderwithcompose.ui.components.SuccessComponent
import com.cantrk.recipefinderwithcompose.ui.viewmodel.RecipeViewIntent
import com.cantrk.recipefinderwithcompose.ui.viewmodel.RecipeViewModel
import com.cantrk.recipefinderwithcompose.ui.viewmodel.RecipeViewState

@Composable
fun HomeScreen(recipeViewModel: RecipeViewModel) {
    val state by recipeViewModel.state

    when(state) {
        is RecipeViewState.Loading -> LoadingComponent()
        is RecipeViewState.Success -> {
            val recipes = (state as RecipeViewState.Success).recipes
            SuccessComponent(recipes = recipes, onSearchClicked = {query ->
                recipeViewModel.processIntent(RecipeViewIntent.SearchRecipes(query))
            })
        }
        is RecipeViewState.Error -> {
            val message = (state as RecipeViewState.Error).message
            ErrorComponent(message = message, onRefreshClicked = {
                recipeViewModel.processIntent(RecipeViewIntent.LoadRandomRecipe)
            })
        }
    }

    LaunchedEffect(Unit) {
        recipeViewModel.processIntent(RecipeViewIntent.LoadRandomRecipe)
    }
}