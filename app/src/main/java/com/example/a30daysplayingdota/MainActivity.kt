package com.example.a30daysplayingdota

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.a30daysplayingdota.ui.theme.DotaLogScreen
import com.example.a30daysplayingdota.ui.theme._30DaysPlayingDotaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            _30DaysPlayingDotaTheme(
                darkTheme = false
            ) {
                Surface(color = MaterialTheme.colorScheme.background) {
                    _30DaysPlayingDota()
                }
            }
        }
    }
}

@Composable
fun _30DaysPlayingDota() {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            TopAppBar()
        }
    ) { paddingValues ->
        DotaLogScreen(contentPadding = paddingValues)
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBar(modifier: Modifier = Modifier) {
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = "30 Days Playing Dota",
                style = MaterialTheme.typography.bodyLarge,
                color = MaterialTheme.colorScheme.onPrimary
            )
        },
        modifier = modifier,
        colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
            containerColor = MaterialTheme.colorScheme.primary
        )
    )
}

@Preview(showBackground = true)
@Composable
fun DotaLogScreenPreview() {
    _30DaysPlayingDotaTheme {
        _30DaysPlayingDota()
    }
}
