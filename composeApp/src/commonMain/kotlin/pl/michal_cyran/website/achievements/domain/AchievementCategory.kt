package pl.michal_cyran.website.achievements.domain

import org.jetbrains.compose.resources.StringResource
import website.composeapp.generated.resources.Res
import website.composeapp.generated.resources.math_competitions
import website.composeapp.generated.resources.other_achievements
import website.composeapp.generated.resources.programming_competitions
import website.composeapp.generated.resources.scholarships

enum class AchievementCategory(
    val displayName: StringResource
) {
    MATH(Res.string.math_competitions),
    PROGRAMMING(Res.string.programming_competitions),
    SCHOLARSHIP(Res.string.scholarships),
    OTHER(Res.string.other_achievements)
}

