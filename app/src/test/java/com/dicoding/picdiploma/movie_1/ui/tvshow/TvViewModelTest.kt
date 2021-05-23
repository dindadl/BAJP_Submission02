package com.dicoding.picdiploma.movie_1.ui.tvshow

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class TvViewModelTest {

    private lateinit var viewModel: TvViewModel
    @Before
    fun setUp() {
        viewModel = TvViewModel()
    }

    @Test
    fun getTvShows() {
        val tvEntities = viewModel.getTvShows()
        assertNotNull(tvEntities)
        assertEquals(15, tvEntities.size)

    }
}