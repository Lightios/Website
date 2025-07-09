package pl.michal_cyran.website.experience.domain

import androidx.compose.ui.graphics.Color
import org.jetbrains.compose.resources.StringResource

data class Stat(
    val value: String,
    val label: StringResource,
    val color: Color = Color(0xFF06B6D4)
)