package pl.michal_cyran.website.achievements.presentation

import androidx.compose.ui.graphics.Color
import org.jetbrains.compose.resources.DrawableResource
import pl.michal_cyran.website.achievements.domain.AchievementCategory
import pl.michal_cyran.website.core.presentation.BadgeColors
import website.composeapp.generated.resources.Res
import website.composeapp.generated.resources.calculate
import website.composeapp.generated.resources.code
import website.composeapp.generated.resources.school
import website.composeapp.generated.resources.trophy

fun AchievementCategory.toIcon(): DrawableResource {
    return when (this) {
        AchievementCategory.PROGRAMMING -> Res.drawable.code
        AchievementCategory.MATH -> Res.drawable.calculate
        AchievementCategory.SCHOLARSHIP -> Res.drawable.school
        AchievementCategory.OTHER -> Res.drawable.trophy
    }
}

fun AchievementCategory.toColor(): androidx.compose.ui.graphics.Color {
    return when (this) {
        AchievementCategory.PROGRAMMING -> BadgeColors.green
        AchievementCategory.MATH -> BadgeColors.cyan
        AchievementCategory.SCHOLARSHIP -> BadgeColors.gold
        AchievementCategory.OTHER -> BadgeColors.magenta
    }
}
