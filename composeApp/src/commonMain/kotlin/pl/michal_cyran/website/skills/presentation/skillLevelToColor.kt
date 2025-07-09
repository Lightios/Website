package pl.michal_cyran.website.skills.presentation

import pl.michal_cyran.website.skills.domain.SkillLevel
import androidx.compose.ui.graphics.Color
import pl.michal_cyran.website.core.presentation.BadgeColors

fun SkillLevel.toColor(): Color {
    return when (this) {
        SkillLevel.BEGINNER -> BadgeColors.blue
        SkillLevel.PROFICIENT -> BadgeColors.green
        SkillLevel.COMPETENT -> BadgeColors.red
        SkillLevel.ADVANCED -> BadgeColors.cyan
        SkillLevel.EXPERT -> BadgeColors.gold
        SkillLevel.NATIVE -> BadgeColors.magenta
        SkillLevel.C1 -> BadgeColors.pink
    }
}