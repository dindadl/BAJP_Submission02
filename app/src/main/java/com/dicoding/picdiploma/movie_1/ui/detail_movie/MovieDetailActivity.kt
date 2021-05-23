package com.dicoding.picdiploma.movie_1.ui.detail_movie

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.dicoding.picdiploma.movie_1.R
import com.dicoding.picdiploma.movie_1.databinding.ActivityMovieDetailBinding
import com.dicoding.picdiploma.movie_1.databinding.ContentMovieDetailBinding
import com.dicoding.picdiploma.movie_1.entity.MovieEntity
import com.dicoding.picdiploma.movie_1.ui.movie.MovieAdapter
import com.dicoding.picdiploma.movie_1.utils.DummyData

class MovieDetailActivity : AppCompatActivity() {


    companion object {
        const val EXTRA_MOVIES = "extra_movies"
    }

    private lateinit var movieDetailBinding: ContentMovieDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[MovieDetailViewModel::class.java]

        val activityMovieDetailBinding = ActivityMovieDetailBinding.inflate(layoutInflater)
        movieDetailBinding = activityMovieDetailBinding.movDetailContent

        setContentView(activityMovieDetailBinding.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val extras = intent.extras
        if (extras != null) {
            val movieId = extras.getString(EXTRA_MOVIES)
            if (movieId != null) {
               viewModel.setSelectedMov(movieId)

                populateMovies(viewModel.getMovies())

                for (movies in DummyData.generateDummyMovies()) {
                    if (movies.movieId == movieId) {
                        populateMovies(movies)
                        supportActionBar?.title = movies.movieTitle
                    }
                }

            }
        }

    }
        private fun populateMovies(moviesEntity: MovieEntity) {

            movieDetailBinding.tvMvTitle.text = moviesEntity.movieTitle
            movieDetailBinding.tvMvYear.text = moviesEntity.movieYear
            movieDetailBinding.tvMvGenreDetail.text = moviesEntity.movieGenre
            movieDetailBinding.tvMvRatingDetail.text = moviesEntity.movieRating
            movieDetailBinding.tvMvOverviewDet.text = moviesEntity.movieSynopsis
            movieDetailBinding.tvMvTopcastDet.text = moviesEntity.movieTopCast



            Glide.with(this)
                .load(moviesEntity.movieImage)
                .transform(RoundedCorners(120))
                    .apply(
                            RequestOptions.placeholderOf(R.drawable.ic_loading)
                                    .error(R.drawable.ic_error))
                .into(movieDetailBinding.imagePoster)

        }

        override fun onSupportNavigateUp(): Boolean {
            onBackPressed()
            return true
        }

    }

