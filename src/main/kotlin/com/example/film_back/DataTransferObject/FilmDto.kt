package com.example.film_back.DataTransferObject

data class FilmDto(
    val title: String,
    val image : ByteArray?,
    val director : String,
    val synopsis : String ) {
}
