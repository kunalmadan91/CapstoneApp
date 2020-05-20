package com.example.capstoneapp.network

import android.graphics.Movie
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface MoviesApiService {

    @GET("movie/popular")
    fun getPopularMovies(@Query("page") page: Int):
            Call<List<Movie>>
}