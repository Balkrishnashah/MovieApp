package com.balkrishnashah.movieapp.data

import com.google.gson.annotations.SerializedName

data class GetMoviesResponse(
    @SerializedName("page") val page: Int,
    @SerializedName("results") val movies: List<movie>,
    @SerializedName("total_pages") val pages: Int
){

}