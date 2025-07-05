package pl.michal_cyran.website.achievements.presentation

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import pl.michal_cyran.website.achievements.domain.AchievementLevel
import pl.michal_cyran.website.core.domain.Badge
import pl.michal_cyran.website.core.presentation.composables.StatusBadge

@Composable
fun FirstPlaceBadge() {
    StatusBadge(
        Badge(
            text = "1st Place",
            backgroundColor = Color(0xFFFFD700),
        )

    )

}

@Composable
fun LevelBadge(
    level: AchievementLevel
) {
    val backgroundColor = when (level) {
        AchievementLevel.SCHOOL -> Color(0xFFfb923c)
        AchievementLevel.INTERNATIONAL -> Color(0xFFf87171)
        AchievementLevel.DISTRICT -> Color(0xFF22d3ee)
        AchievementLevel.REGIONAL -> Color(0xFF4ade80)
        AchievementLevel.NATIONAL -> Color(0xFFc084fc)
    }

    StatusBadge(
        Badge(
            text = level.displayName,
            backgroundColor = backgroundColor,
        )
    )
}