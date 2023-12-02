package com.cantrk.recipefinderwithcompose.ui.viewmodel

import com.cantrk.recipefinderwithcompose.data.model.Meal

sealed class RecipeViewState{
    object Loading:RecipeViewState()
    data class Success(val recipes:List<Meal>):RecipeViewState()
    data class Error(val message:String) : RecipeViewState()
}
