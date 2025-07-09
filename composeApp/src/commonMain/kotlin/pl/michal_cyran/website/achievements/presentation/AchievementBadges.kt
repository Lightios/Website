package pl.michal_cyran.website.achievements.presentation

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import pl.michal_cyran.website.achievements.domain.AchievementLevel
import pl.michal_cyran.website.core.domain.Badge
import pl.michal_cyran.website.core.presentation.BadgeColors
import pl.michal_cyran.website.core.presentation.composables.StatusBadge
import website.composeapp.generated.resources.Res
import website.composeapp.generated.resources.`_1st place`

@Composable
fun FirstPlaceBadge() {
    StatusBadge(
        Badge(
            text = Res.string.`_1st place`,
            color = BadgeColors.gold
        )

    )

}

@Composable
fun LevelBadge(
    level: AchievementLevel
) {
    val backgroundColor = when (level) {
        AchievementLevel.SCHOOL -> BadgeColors.gold
        AchievementLevel.INTERNATIONAL -> BadgeColors.red
        AchievementLevel.DISTRICT -> BadgeColors.cyan
        AchievementLevel.REGIONAL -> BadgeColors.green
        AchievementLevel.NATIONAL -> BadgeColors.pink
    }

    StatusBadge(
        Badge(
            text = level.displayName,
            color = backgroundColor,
        )
    )
}