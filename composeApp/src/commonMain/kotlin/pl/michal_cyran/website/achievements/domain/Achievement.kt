package pl.michal_cyran.website.achievements.domain

import kotlinx.datetime.LocalDate
import org.jetbrains.compose.resources.StringResource

data class Achievement (
    val name: StringResource,
    val organization: String,
    val date: LocalDate,
    val category: AchievementCategory,
    val level: AchievementLevel,
    val isFirstPlace: Boolean = false,
)
