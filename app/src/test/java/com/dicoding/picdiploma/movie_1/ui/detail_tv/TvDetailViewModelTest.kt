package com.dicoding.picdiploma.movie_1.ui.detail_tv

import com.dicoding.picdiploma.movie_1.ui.tvshow.TvViewModel
import com.dicoding.picdiploma.movie_1.utils.DummyData
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class TvDetailViewModelTest {

    private lateinit var viewModel: TvDetailViewModel
    private val dummyTv = DummyData.generateDummyTv()[0]
    private val tvId = dummyTv.tvId


    @Before
    fun setUp() {
        viewModel = TvDetailViewModel()
        viewModel.setSelectedShows(tvId)
    }

    @Test
    fun getShows() {
        viewModel.setSelectedShows(dummyTv.tvId)
        val tvEntity = viewModel.getShows()
        assertNotNull(tvEntity)
        assertEquals(dummyTv.tvImage, tvEntity.tvImage)
        assertEquals(dummyTv.tvTitle, tvEntity.tvTitle)
        assertEquals(dummyTv.tvId, tvEntity.tvId)
        assertEquals(dummyTv.tvGenre, tvEntity.tvGenre)
        assertEquals(dummyTv.tvRating, tvEntity.tvRating)
        assertEquals(dummyTv.tvSynopsis, tvEntity.tvSynopsis)
        assertEquals(dummyTv.tvTopCast, tvEntity.tvTopCast)
        assertEquals(dummyTv.tvYear, tvEntity.tvYear)
    }
}