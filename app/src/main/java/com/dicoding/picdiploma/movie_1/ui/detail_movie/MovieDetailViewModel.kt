package com.dicoding.picdiploma.movie_1.ui.detail_movie

import androidx.lifecycle.ViewModel
import com.dicoding.picdiploma.movie_1.entity.MovieEntity
import com.dicoding.picdiploma.movie_1.utils.DummyData

class MovieDetailViewModel : ViewModel() {
    private lateinit var movieId: String

    fun setSelectedMov(movieId: String) {
        this.movieId = movieId
    }

    fun getMovies(): MovieEntity {
        lateinit var movie: MovieEntity
        val moviesEntities = DummyData.generateDummyMovies()
        for (movieEntity in moviesEntities) {
            if (movieEntity.movieId == movieId) {
                movie = movieEntity
            }
        }
        return movie
    }

}
