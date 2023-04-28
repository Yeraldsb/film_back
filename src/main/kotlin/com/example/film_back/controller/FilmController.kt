package com.example.film_back.controller

import com.example.film_back.data.Film
import com.example.film_back.service.FilmService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import org.springframework.web.multipart.MultipartFile
import org.springframework.web.server.ResponseStatusException

@CrossOrigin
@RestController
@RequestMapping("/")
class FilmController(@Autowired private val filmService: FilmService) {


    @GetMapping("/movies")
    fun all(): ResponseEntity<Iterable<Film>> {
        return ResponseEntity.ok(filmService.all())
    }


    @GetMapping("{id}")
    fun findById(@PathVariable id: Long): ResponseEntity<Film> {
        val returnFilm = filmService.findById(id)
        if (returnFilm.isPresent) {
            return ResponseEntity.ok(returnFilm.get())
        } else {
            throw ResponseStatusException(
                HttpStatus.NOT_FOUND,
                "film with id: $id not found"
            )
        }
    }
    @PostMapping("/films")
    fun createFilm(@RequestBody film: Film, @RequestParam("image") imageFile: MultipartFile): Film {
        return filmService.create(film, imageFile)
    }


}
