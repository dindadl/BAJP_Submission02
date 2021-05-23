package com.dicoding.picdiploma.movie_1.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dicoding.picdiploma.movie_1.R
import com.dicoding.picdiploma.movie_1.ui.home.HomeActivity

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        supportActionBar?.hide()

        val background = object : Thread(){
            override fun run(){
                try {
                    sleep(3000)

                    val intent = Intent(baseContext, HomeActivity::class.java)
                    startActivity(intent)
                } catch (e: Exception){
                    e.printStackTrace()
                }
            }
        }
        background.start()

    }
}