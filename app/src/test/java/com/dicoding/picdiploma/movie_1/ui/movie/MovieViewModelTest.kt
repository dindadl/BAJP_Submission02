package com.dicoding.picdiploma.movie_1.ui.movie

import com.dicoding.picdiploma.movie_1.ui.tvshow.TvViewModel
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class MovieViewModelTest {
    private lateinit var viewModel: MovieViewModel
    @Before
    fun setUp() {
        viewModel = MovieViewModel()
    }

    @Test
    fun getMovies() {
        val movieEntities = viewModel.getMovies()
        assertNotNull(movieEntities)
        assertEquals(15,movieEntities.size)
    }
}