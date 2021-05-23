package com.dicoding.picdiploma.movie_1.ui.movie

import androidx.lifecycle.ViewModel
import com.dicoding.picdiploma.movie_1.entity.MovieEntity
import com.dicoding.picdiploma.movie_1.utils.DummyData

class MovieViewModel : ViewModel() {

    fun getMovies(): List<MovieEntity> = DummyData.generateDummyMovies()
}