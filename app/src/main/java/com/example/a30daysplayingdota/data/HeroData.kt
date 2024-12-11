package com.example.a30daysplayingdota.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class HeroData(
    @StringRes val dateRes: Int,          // Tanggal
    @StringRes val titleRes: Int,         // Nama Hero
    @StringRes val descriptionRes: Int,   // Deskripsi Hero
    @DrawableRes val imageRes: Int        // Gambar Hero
)
