package com.example.almatyapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Recommendation(
    val id: Int,
    val name: String,
    val category: String,
    val address: String,
    val description: String,
    @DrawableRes val imageResourceId: Int,
)
