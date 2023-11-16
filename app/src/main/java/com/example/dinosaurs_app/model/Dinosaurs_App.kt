package com.example.dinosaurs_app.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Dinosaurs_App(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int,

)
