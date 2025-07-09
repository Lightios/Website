package pl.michal_cyran.website.core.domain

import androidx.compose.ui.graphics.Color
import org.jetbrains.compose.resources.StringResource

data class Badge(
    val text: StringResource,
    val color: Color,
)