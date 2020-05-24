package com.example.capstoneapp.network


import com.example.capstoneapp.database.BaseMovie
import com.example.capstoneapp.database.Movie
import kotlinx.coroutines.Deferred
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface MoviesApiService {

    @GET("movie/popular")
    suspend fun getPopularMoviesAsync(@Query("api_key") key: String):
            Response<BaseMovie>
}
