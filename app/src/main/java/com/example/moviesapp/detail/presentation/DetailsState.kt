package com.example.moviesapp.detail.presentation

import com.example.moviesapp.movielist.domain.model.Movie


data class DetailsState(
    val isLoading: Boolean = false,
    val movie: Movie? = null
)
