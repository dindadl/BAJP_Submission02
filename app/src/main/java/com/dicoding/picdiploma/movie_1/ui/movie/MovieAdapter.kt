package com.dicoding.picdiploma.movie_1.ui.movie

import android.content.Intent
import android.graphics.Movie
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dicoding.picdiploma.movie_1.R
import com.dicoding.picdiploma.movie_1.databinding.ItemsMvBinding
import com.dicoding.picdiploma.movie_1.entity.MovieEntity
import com.dicoding.picdiploma.movie_1.ui.detail_movie.MovieDetailActivity

class MovieAdapter : RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {


    private var movieList = ArrayList<MovieEntity>()

    fun setMovies(movies : List<MovieEntity>?){
        if (movies == null) return
        this.movieList.clear()
        this.movieList.addAll(movies)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val itemsMvBinding = ItemsMvBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MovieViewHolder(itemsMvBinding)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
    val movies = movieList[position]
        holder.bind(movies)
    }

    override fun getItemCount(): Int = movieList.size

    class MovieViewHolder(private val binding: ItemsMvBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(movies: MovieEntity) {
            with(binding) {
              tvMvTitle.text = movies.movieTitle
                tvMvRatingDetail.text = movies.movieRating
                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, MovieDetailActivity::class.java)
                    intent.putExtra(MovieDetailActivity.EXTRA_MOVIES, movies.movieId)
                    itemView.context.startActivity(intent)
                }
                Glide.with(itemView.context)
                    .load(movies.movieImage)
                    .apply(
                        RequestOptions.placeholderOf(R.drawable.ic_loading)
                        .error(R.drawable.ic_error))
                    .into(imgPoster)
            }
        }
    }
}

