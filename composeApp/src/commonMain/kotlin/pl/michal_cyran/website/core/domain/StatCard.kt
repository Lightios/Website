package pl.michal_cyran.website.core.domain

import androidx.compose.ui.graphics.Color
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.StringResource

data class Stat(
    val value: String,
    val label: StringResource,
    val icon: DrawableResource,
    val iconColor: Color
)