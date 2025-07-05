package pl.michal_cyran.website.experience.domain

import androidx.compose.ui.graphics.Color

data class Stat(
    val value: String,
    val label: String,
    val color: Color = Color(0xFF06B6D4)
)