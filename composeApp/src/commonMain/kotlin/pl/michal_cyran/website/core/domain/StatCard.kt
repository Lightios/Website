package pl.michal_cyran.website.core.domain

import androidx.compose.ui.graphics.Color
import org.jetbrains.compose.resources.DrawableResource

data class Stat(
    val value: String,
    val label: String,
    val icon: DrawableResource,
    val iconColor: Color
)