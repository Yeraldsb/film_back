package com.example.film_back.service

import com.example.film_back.data.Film
import org.springframework.stereotype.Service
import org.springframework.web.multipart.MultipartFile
import java.util.*


interface FilmService {

    fun findById(id: Long): Optional<Film> // Object that can or nor exist

    fun create(film: Film, imageFile: MultipartFile): Film

    fun all(): Iterable<Film>

    fun save(film: Film): Film

}