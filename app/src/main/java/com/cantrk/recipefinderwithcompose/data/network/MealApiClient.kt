package com.cantrk.recipefinderwithcompose.data.network

import com.cantrk.recipefinderwithcompose.data.model.Meal
import com.cantrk.recipefinderwithcompose.data.model.MealResponse
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.engine.cio.CIO
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.request.get
import io.ktor.serialization.kotlinx.json.json

object MealApiClient{
    private val apiClient= HttpClient(CIO){
        install(ContentNegotiation){
            json()
        }
    }

    suspend fun getRandomRecipe() : List<Meal>{
        val url="www.themealdb.com/api/json/v1/1/random.php"
        val response= apiClient.get(urlString = url).body() as MealResponse
        return response.meals
    }

    suspend fun getSearchedRecipe(query:String) : List<Meal>{
        val url="https://www.themealdb.com/api/json/v1/1/search.php?s=$query"
        val response= apiClient.get(urlString = url).body() as MealResponse
        return response.meals
    }
}