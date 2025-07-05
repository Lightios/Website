package pl.michal_cyran.website.achievements.presentation

import androidx.compose.ui.graphics.Color
import org.jetbrains.compose.resources.DrawableResource
import pl.michal_cyran.website.achievements.domain.AchievementCategory
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
        AchievementCategory.PROGRAMMING -> Color(0xFF3B82F6) // Green
        AchievementCategory.MATH -> Color(0xFF10B981) // Blue
        AchievementCategory.SCHOLARSHIP -> Color(0xFF8B5CF6) // Yellow
        AchievementCategory.OTHER -> Color(0xFFF59E0B) // Red
    }
}
