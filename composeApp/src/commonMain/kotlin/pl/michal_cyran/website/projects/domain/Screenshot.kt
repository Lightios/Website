package pl.michal_cyran.website.projects.domain

import org.jetbrains.compose.resources.DrawableResource

data class Screenshot(
    val resource: DrawableResource,
    val label: String,
)