package com.example.cleanarchitecture

interface IMDbApiService {
    @GET("/en/API/SearchMovie/YOUR_API_KEY/{expression}")
    fun searchMovies(@Path("expression") expression: String): Call<MoviesSearchResponse>
}