package com.example.film_back.service

import com.example.film_back.data.Film
import com.example.film_back.data.FilmDao
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*
import java.nio.file.Paths
import java.nio.file.Files

@Service
class FilmServiceSql(@Autowired private val filmDao: FilmDao) : FilmService {
    override fun findById(id: Long): Optional<Film> {
        return filmDao.findById(id)
    }

    override fun create(film: Film): Film {
        return filmDao.save(film)
    }

    override fun all(): Iterable<Film> {
        return filmDao.findAll()
    }

    override fun save(film: Film): Film {
        // Read the image data from a file
        val path = Paths.get("/templates/img/duck.jpg")
        val imageData = Files.readAllBytes(path)

        // Set the image data on the film entity
        film.image = imageData

        return filmDao.save(film)
    }
}

