package com.dicoding.picdiploma.movie_1.ui.tvshow

import androidx.lifecycle.ViewModel
import com.dicoding.picdiploma.movie_1.entity.TvEntity
import com.dicoding.picdiploma.movie_1.utils.DummyData

class TvViewModel : ViewModel() {

    fun getTvShows(): List<TvEntity> = DummyData.generateDummyTv()

}
