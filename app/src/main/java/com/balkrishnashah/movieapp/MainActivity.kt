package com.balkrishnashah.movieapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.balkrishnashah.movieapp.data.MoviesRepository

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MoviesRepository.getPopularMovies()
    }
}