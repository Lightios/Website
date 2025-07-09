package pl.michal_cyran.website.experience.data

import androidx.compose.ui.graphics.Color
import kotlinx.datetime.LocalDate
import pl.michal_cyran.website.core.domain.Badge
import pl.michal_cyran.website.experience.domain.Experience
import pl.michal_cyran.website.experience.domain.Stat
import pl.michal_cyran.website.experience.domain.Technology
import website.composeapp.generated.resources.Res
import website.composeapp.generated.resources.apps_published
import website.composeapp.generated.resources.calculate
import website.composeapp.generated.resources.commercial
import website.composeapp.generated.resources.experience_app_developer_description
import website.composeapp.generated.resources.experience_app_developer_title
import website.composeapp.generated.resources.experience_tutor_description
import website.composeapp.generated.resources.experience_tutor_title
import website.composeapp.generated.resources.home
import website.composeapp.generated.resources.kotlin
import website.composeapp.generated.resources.light_mode
import website.composeapp.generated.resources.logo_dev
import website.composeapp.generated.resources.python
import website.composeapp.generated.resources.rating
import website.composeapp.generated.resources.reviews
import website.composeapp.generated.resources.self_employed
import website.composeapp.generated.resources.students_taught
import website.composeapp.generated.resources.total_downloads

val experiences = listOf(
    Experience(
        title = Res.string.experience_tutor_title,
        description = Res.string.experience_tutor_description,
        icon = Res.drawable.calculate,
        iconColor = Color.White,
        iconBackground = Color(0xFF3B82F6),
        badges = listOf(
            Badge(Res.string.self_employed, Color(0xFF0EA5E9)),
            Badge(Res.string.home, Color(0xFF10B981))
        ),
        startDate = LocalDate(2021, 9, 1),
        stats = listOf(
            Stat("50+", Res.string.students_taught),
            Stat("5/5", Res.string.rating),
            Stat("20+", Res.string.reviews)
        )
    ),
    Experience(
        title = Res.string.experience_app_developer_title,
        description = Res.string.experience_app_developer_description,
        icon = Res.drawable.logo_dev,
        iconColor = Color.White,
        iconBackground = Color(0xFF10B981),
        badges = listOf(
            Badge(Res.string.self_employed, Color(0xFF0EA5E9)),
            Badge(Res.string.commercial, Color(0xFF8B5CF6))
        ),
        startDate = LocalDate(2021, 7, 1),
        technologies = listOf(
            Technology("Python", Res.drawable.python),
            Technology("Kotlin", Res.drawable.kotlin)
        ),
        stats = listOf(
            Stat("2", Res.string.apps_published),
            Stat("100K+", Res.string.total_downloads),
        )
    )
)