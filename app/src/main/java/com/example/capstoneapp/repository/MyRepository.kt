package com.example.capstoneapp.repository

import android.app.Application
import com.example.capstoneapp.Utility
import com.example.capstoneapp.network.MarsApi

class MyRepository constructor(val application: Application) {

    suspend fun fetchData(){
        MarsApi.retrofitService.getPopularMovies(2)
    }
    fun getConnection(): Boolean {
        return Utility.hasNetwork(application)
    }

}