package com.dicoding.picdiploma.movie_1.ui.tvshow

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dicoding.picdiploma.movie_1.R
import com.dicoding.picdiploma.movie_1.databinding.ItemsTvBinding
import com.dicoding.picdiploma.movie_1.entity.TvEntity
import com.dicoding.picdiploma.movie_1.ui.detail_tv.TvDetailActivity

class TvAdapter : RecyclerView.Adapter<TvAdapter.TvViewHolder>() {

    private var tvList = ArrayList<TvEntity>()

    fun setTvshows(tvshows : List<TvEntity>?){
        if (tvshows == null) return
        this.tvList.clear()
        this.tvList.addAll(tvshows)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TvViewHolder {
        val itemsTvBinding = ItemsTvBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TvViewHolder(itemsTvBinding)
    }

    override fun onBindViewHolder(holder: TvViewHolder, position: Int) {
        val tvshows = tvList[position]
        holder.bind(tvshows)
    }

    override fun getItemCount(): Int = tvList.size

    class TvViewHolder(private val binding: ItemsTvBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(tvshows: TvEntity) {
            with(binding) {
                tvTitle.text = tvshows.tvTitle
                tvRatingDetail.text = tvshows.tvRating
                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, TvDetailActivity::class.java)
                    intent.putExtra(TvDetailActivity.EXTRA_TV, tvshows.tvId)
                    itemView.context.startActivity(intent)
                }
                Glide.with(itemView.context)
                    .load(tvshows.tvImage)
                    .apply(
                        RequestOptions.placeholderOf(R.drawable.ic_loading)
                            .error(R.drawable.ic_error))
                    .into(tvImagePoster)
            }
        }
    }


}