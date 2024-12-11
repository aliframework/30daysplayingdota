package com.example.a30daysplayingdota.ui.theme

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.example.a30daysplayingdota.Model.Hero
import com.example.a30daysplayingdota.components.HeroCard

@Composable
fun DotaLogScreen(contentPadding: PaddingValues) {
    LazyColumn(contentPadding = contentPadding) {
        items(Hero.heroes) { hero ->
            HeroCard(hero = hero)
        }
    }
}
