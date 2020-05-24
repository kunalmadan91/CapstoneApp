package com.example.capstoneapp.database

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "movie")
data class Movie constructor(var overview: String? = null) {


    @Entity(tableName = "movie")
    data class Movie(
        var overview: String? = null,

        var title: String? = null,

        @ColumnInfo(name = "poster_path")
         var posterPath: String? = null,

        @ColumnInfo(name = "backdrop_path")
        var backdropPath: String? = null,

        @ColumnInfo(name = "release_date")
        var releaseDate: String? = null,

        @ColumnInfo(name = "vote_average")
        var voteAverage: Double? = null,

        @PrimaryKey
        @NonNull
        var id: Int? = null)
}