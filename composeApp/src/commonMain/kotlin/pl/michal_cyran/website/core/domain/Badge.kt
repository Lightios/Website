package pl.michal_cyran.website.core.domain

import androidx.compose.ui.graphics.Color

data class Badge(
    val text: String,
    val backgroundColor: Color,
    val textColor: Color = Color.Companion.White
)