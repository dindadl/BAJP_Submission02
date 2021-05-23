package com.dicoding.picdiploma.movie_1.ui.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dicoding.picdiploma.movie_1.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val activityHomeBinding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(activityHomeBinding.root)

        val sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)
        activityHomeBinding.viewPager.adapter = sectionsPagerAdapter
        activityHomeBinding.tabsHome.setupWithViewPager(activityHomeBinding.viewPager)
        supportActionBar?.elevation = 0f
        supportActionBar?.title = "Home"
    }
}