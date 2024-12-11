package com.example.a30daysplayingdota.components

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.a30daysplayingdota.R
import com.example.a30daysplayingdota.data.HeroData

@Composable
fun HeroCard(hero: HeroData) {
    var isExpanded by remember { mutableStateOf(false) }

    Card(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
            .animateContentSize(),
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        onClick = { isExpanded = !isExpanded }
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = stringResource(id = hero.dateRes),
                style = MaterialTheme.typography.bodyLarge
            )

            Spacer(modifier = Modifier.height(8.dp))

            Image(
                painter = painterResource(id = hero.imageRes),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = stringResource(id = hero.titleRes),
                style = MaterialTheme.typography.headlineSmall
            )

            Spacer(modifier = Modifier.height(4.dp))

            if (isExpanded) {
                Text(
                    text = stringResource(id = hero.descriptionRes),
                    style = MaterialTheme.typography.bodyMedium
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewHeroCard() {
    val exampleHero = HeroData(
        dateRes = R.string.date1,
        titleRes = R.string.hero1,
        descriptionRes = R.string.hero_description1,
        imageRes = R.drawable.axe
    )
    HeroCard(hero = exampleHero)
}
