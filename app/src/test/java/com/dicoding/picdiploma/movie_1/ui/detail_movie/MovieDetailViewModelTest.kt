package com.dicoding.picdiploma.movie_1.ui.detail_movie

import com.dicoding.picdiploma.movie_1.utils.DummyData
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class MovieDetailViewModelTest {

    private lateinit var viewModel: MovieDetailViewModel
    private val dummyMovie = DummyData.generateDummyMovies()[0]
    private val movieId = dummyMovie.movieId



    @Before
    fun setUp() {
        viewModel = MovieDetailViewModel()
        viewModel.setSelectedMov(movieId)
    }

    @Test
    fun getMovies() {
        viewModel.setSelectedMov(dummyMovie.movieId)
        val movieEntity = viewModel.getMovies()
        assertNotNull(movieEntity)
        assertEquals(dummyMovie.movieId, movieEntity.movieId)
        assertEquals(dummyMovie.movieGenre, movieEntity.movieGenre)
        assertEquals(dummyMovie.movieRating, movieEntity.movieRating)
        assertEquals(dummyMovie.movieSynopsis, movieEntity.movieSynopsis)
        assertEquals(dummyMovie.movieImage, movieEntity.movieImage)
        assertEquals(dummyMovie.movieTitle, movieEntity.movieTitle)
        assertEquals(dummyMovie.movieTopCast, movieEntity.movieTopCast)
        assertEquals(dummyMovie.movieYear, movieEntity.movieYear)
    }
}