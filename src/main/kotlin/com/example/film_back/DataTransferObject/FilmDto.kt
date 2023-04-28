package com.example.film_back.DataTransferObject

data class FilmDto(
    val title: String,
    val yearr: Int,
    val image: String,
    val director: String,
    val synopsis: String,
) {
}
