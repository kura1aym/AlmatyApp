package com.example.almatyapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Recommendation(
    val id: Int,
    @StringRes val name: String,
    @StringRes val category: String,
    val address: String,
    val description: String,
    @DrawableRes val imageResourceId: Int,
)
