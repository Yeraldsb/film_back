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
    @Lob
    @Column(name = "image")
    var image : ByteArray?, // Use a byte array to store the image data
    var director : String,
    var synopsis : String
) {
    constructor() : this(null,"", null, "", ""  ) {

    }

    constructor(filmDto: FilmDto) : this(
        null,
        filmDto.title,
        null,
        filmDto.director,
        filmDto.synopsis)
}