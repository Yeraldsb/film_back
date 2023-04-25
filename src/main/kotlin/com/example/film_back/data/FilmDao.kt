package com.example.film_back.data

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.CrudRepository

interface FilmDao : JpaRepository<Film, Long>{
}