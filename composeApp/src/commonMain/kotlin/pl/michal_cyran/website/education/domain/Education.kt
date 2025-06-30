package pl.michal_cyran.website.education.domain

import androidx.compose.ui.graphics.Color

data class Education(
    val title: String,
    val institution: String,
    val duration: String,
    val location: String,
    val qualification: String,
    val subjects: List<Subject>,
    val certificates: List<String> = emptyList(),
)