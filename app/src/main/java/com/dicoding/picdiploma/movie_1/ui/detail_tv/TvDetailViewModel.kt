package com.dicoding.picdiploma.movie_1.ui.detail_tv

import androidx.lifecycle.ViewModel
import com.dicoding.picdiploma.movie_1.entity.MovieEntity
import com.dicoding.picdiploma.movie_1.entity.TvEntity
import com.dicoding.picdiploma.movie_1.utils.DummyData

class TvDetailViewModel : ViewModel() {

    private lateinit var tvId: String

    fun setSelectedShows(tvId: String) {
        this.tvId = tvId
    }

    fun getShows(): TvEntity {
        lateinit var tvshows: TvEntity
        val tvEntities = DummyData.generateDummyTv()
        for (tvEntity in tvEntities) {
            if (tvEntity.tvId == tvId) {
                tvshows = tvEntity
            }
        }
        return tvshows
    }
}