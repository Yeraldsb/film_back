package com.example.film_back.data

import org.springframework.data.jpa.repository.JpaRepository


interface FilmDao : JpaRepository<Film, Long>{

}