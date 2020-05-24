package com.example.capstoneapp.database

data class BaseMovie (

    val page : Int,
    val total_results : Int,
    val total_pages : Int,
    val results : List<Movie>
)