package com.example.film_back.data

import com.example.film_back.DataTransferObject.FilmDto
import jakarta.persistence.*


@Entity()
@Table(name = "films")
data class Film(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long?,
    var title: String,
    var yearr : Int,
    @Lob
    @Column(name = "image")
    var image : String, // Use a byte array to store the image data
    var director : String,
    var synopsis : String
) {
    constructor() : this(null,"", 0, "", "", ""  ) {

    }

    constructor(filmDto: FilmDto) : this(
        null,
        filmDto.title,
        filmDto.yearr,
        filmDto.image,
        filmDto.director,
        filmDto.synopsis)
}