package com.dicoding.picdiploma.movie_1.ui.detail_tv

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.dicoding.picdiploma.movie_1.databinding.ActivityTvDetailBinding
import com.dicoding.picdiploma.movie_1.databinding.ContentTvDetailBinding
import com.dicoding.picdiploma.movie_1.entity.TvEntity
import com.dicoding.picdiploma.movie_1.ui.tvshow.TvViewModel
import com.dicoding.picdiploma.movie_1.utils.DummyData

class TvDetailActivity : AppCompatActivity() {

    private lateinit var  tvShowDetailBinding: ContentTvDetailBinding

    companion object {
        const val EXTRA_TV = "extra_tv"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[TvDetailViewModel::class.java]

        val activityTvDetailBinding = ActivityTvDetailBinding.inflate(layoutInflater)
        tvShowDetailBinding = activityTvDetailBinding.tvDetailContent

        setContentView(activityTvDetailBinding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)


        val extras = intent.extras

        if (extras != null) {
            val tvId = extras.getString(EXTRA_TV)
            if (tvId != null) {
                viewModel.setSelectedShows(tvId)

                populatetvShows(viewModel.getShows())
                for (tvshows in DummyData.generateDummyTv()) {
                    if (tvshows.tvId == tvId) {
                        populatetvShows(tvshows)
                        supportActionBar?.title = tvshows.tvTitle
                    }
                }

            }
        }
    }
    private fun populatetvShows(tvEntity: TvEntity) {

        tvShowDetailBinding.tvshowTitle.text = tvEntity.tvTitle
        tvShowDetailBinding.tvshowYear.text = tvEntity.tvYear
        tvShowDetailBinding.tvshowGenreDetail.text = tvEntity.tvGenre
        tvShowDetailBinding.tvshowRatingDetail.text =tvEntity.tvRating
        tvShowDetailBinding.tvshowOverviewDet.text = tvEntity.tvSynopsis
        tvShowDetailBinding.tvshowTopcastDet.text = tvEntity.tvTopCast


        Glide.with(this)
            .load(tvEntity.tvImage)
            .transform(RoundedCorners(120))
            .into(tvShowDetailBinding.tvImagePoster)

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}
