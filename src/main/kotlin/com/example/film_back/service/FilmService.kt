package com.example.film_back.service

import com.example.film_back.data.Film
import java.util.*

interface FilmService {

    fun findById(id: Long): Optional<Film> // Object that can or nor exist

    fun create(film: Film): Film

    fun all(): Iterable<Film>

    fun save(film: Film): Film

}