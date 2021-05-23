package com.dicoding.picdiploma.movie_1.ui.home

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.dicoding.picdiploma.movie_1.R
import com.dicoding.picdiploma.movie_1.utils.DummyData
import org.junit.Rule
import org.junit.Test


class HomeActivityTest{

    private val dummyMovie = DummyData.generateDummyMovies()
    private val dummyTv = DummyData.generateDummyTv()

    @get:Rule
    var activityRule = ActivityScenarioRule(HomeActivity::class.java)

    @Test
    fun loadMovies() {
        onView(withId(R.id.rv_movies)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_movies)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyMovie.size))
    }


    @Test
    fun loadDetailMovie() {
        onView(withId(R.id.rv_movies)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0,click()))

        onView(withId(R.id.image_poster)).check(matches(isDisplayed()))

        onView(withId(R.id.tv_mv_title)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_mv_title)).check(matches(withText(dummyMovie[0].movieTitle)))

        onView(withId(R.id.tv_mv_year)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_mv_year)).check(matches(withText(dummyMovie[0].movieYear)))

        onView(withId(R.id.tv_mv_genre_detail)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_mv_genre_detail)).check(matches(withText(dummyMovie[0].movieGenre)))

        onView(withId(R.id.tv_mv_rating_detail)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_mv_rating_detail)).check(matches(withText(dummyMovie[0].movieRating)))

        onView(withId(R.id.tv_mv_overview_det)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_mv_overview_det)).check(matches(withText(dummyMovie[0].movieSynopsis)))

        onView(withId(R.id.tv_mv_topcast_det)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_mv_topcast_det)).check(matches(withText(dummyMovie[0].movieTopCast)))

    }

    @Test
    fun loadShows() {
        onView(withText("TV SHOWS")).perform(click())
        onView(withId(R.id.rv_tvshows)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_tvshows)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyTv.size))
    }

    @Test
    fun loadDetailShows() {
        onView(withText("TV SHOWS")).perform(click())

        onView(withId(R.id.rv_tvshows)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0,click()))

        onView(withId(R.id.tv_image_poster)).check(matches(isDisplayed()))

        onView(withId(R.id.tvshow_title)).check(matches(isDisplayed()))
        onView(withId(R.id.tvshow_title)).check(matches(withText(dummyTv[0].tvTitle)))

        onView(withId(R.id.tvshow_year)).check(matches(isDisplayed()))
        onView(withId(R.id.tvshow_year)).check(matches(withText(dummyTv[0].tvYear)))

        onView(withId(R.id.tvshow_genre_detail)).check(matches(isDisplayed()))
        onView(withId(R.id.tvshow_genre_detail)).check(matches(withText(dummyTv[0].tvGenre)))

        onView(withId(R.id.tvshow_rating_detail)).check(matches(isDisplayed()))
        onView(withId(R.id.tvshow_rating_detail)).check(matches(withText(dummyTv[0].tvRating)))

        onView(withId(R.id.tvshow_overview_det)).check(matches(isDisplayed()))
        onView(withId(R.id.tvshow_overview_det)).check(matches(withText(dummyTv[0].tvSynopsis)))

        onView(withId(R.id.tvshow_topcast_det)).check(matches(isDisplayed()))
        onView(withId(R.id.tvshow_topcast_det)).check(matches(withText(dummyTv[0].tvTopCast)))

    }
}