package pl.michal_cyran.website.experience.data

import androidx.compose.ui.graphics.Color
import kotlinx.datetime.LocalDate
import pl.michal_cyran.website.core.domain.Badge
import pl.michal_cyran.website.experience.domain.Experience
import pl.michal_cyran.website.experience.domain.Stat
import pl.michal_cyran.website.experience.domain.Technology
import website.composeapp.generated.resources.Res
import website.composeapp.generated.resources.calculate
import website.composeapp.generated.resources.kotlin
import website.composeapp.generated.resources.light_mode
import website.composeapp.generated.resources.logo_dev
import website.composeapp.generated.resources.python

val experiences = listOf(
    Experience(
        title = "Math Tutor",
        description = "Teaching mathematics to students",
        icon = Res.drawable.calculate,
        iconColor = Color.White,
        iconBackground = Color(0xFF3B82F6),
        badges = listOf(
            Badge("Self-employed", Color(0xFF0EA5E9)),
            Badge("Home", Color(0xFF10B981))
        ),
        startDate = LocalDate(2021, 9, 1),
        stats = listOf(
            Stat("50+", "Students Taught"),
            Stat("5/5", "Rating"),
            Stat("20+", "Reviews")
        )
    ),
    Experience(
        title = "Commercial App Developer",
        description = "Building and monetizing my own commercial applications",
        icon = Res.drawable.logo_dev,
        iconColor = Color.White,
        iconBackground = Color(0xFF10B981),
        badges = listOf(
            Badge("Self-employed", Color(0xFF0EA5E9)),
            Badge("Commercial", Color(0xFF8B5CF6))
        ),
        startDate = LocalDate(2021, 7, 1),
        technologies = listOf(
            Technology("Python", Res.drawable.python),
            Technology("Kotlin", Res.drawable.kotlin)
        ),
        stats = listOf(
            Stat("2", "Apps Published"),
            Stat("100K+", "Total Downloads"),
        )
    )
)