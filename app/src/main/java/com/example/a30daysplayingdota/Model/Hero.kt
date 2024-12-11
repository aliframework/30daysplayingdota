package com.example.a30daysplayingdota.Model

import com.example.a30daysplayingdota.R
import com.example.a30daysplayingdota.data.HeroData

object Hero {
    val heroes = listOf(
        HeroData(
            dateRes = R.string.date1,
            titleRes = R.string.hero1,
            descriptionRes = R.string.hero_description1,
            imageRes = R.drawable.axe
        ),
        HeroData(
            dateRes = R.string.date2,
            titleRes = R.string.hero2,
            descriptionRes = R.string.hero_description2,
            imageRes = R.drawable.invoker
        ),
        HeroData(
            dateRes = R.string.date3,
            titleRes = R.string.hero3,
            descriptionRes = R.string.hero_description3,
            imageRes = R.drawable.crystal_maiden
        ),
        HeroData(
            dateRes = R.string.date4,
            titleRes = R.string.hero4,
            descriptionRes = R.string.hero_description4,
            imageRes = R.drawable.earthshaker
        ),
        HeroData(
            dateRes = R.string.date5,
            titleRes = R.string.hero5,
            descriptionRes = R.string.hero_description5,
            imageRes = R.drawable.dazzle
        ),
        HeroData(
            dateRes = R.string.date6,
            titleRes = R.string.hero6,
            descriptionRes = R.string.hero_description6,
            imageRes = R.drawable.tinker
        ),
        HeroData(
            dateRes = R.string.date7,
            titleRes = R.string.hero7,
            descriptionRes = R.string.hero_description7,
            imageRes = R.drawable.pudge
        ),
        HeroData(
            dateRes = R.string.date8,
            titleRes = R.string.hero8,
            descriptionRes = R.string.hero_description8,
            imageRes = R.drawable.anti_mage
        )
    )
}