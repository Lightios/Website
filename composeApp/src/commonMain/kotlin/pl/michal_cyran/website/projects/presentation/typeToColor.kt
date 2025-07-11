package pl.michal_cyran.website.projects.presentation

import androidx.compose.ui.graphics.Color
import org.jetbrains.compose.resources.DrawableResource
import pl.michal_cyran.website.achievements.domain.AchievementCategory
import pl.michal_cyran.website.core.presentation.BadgeColors
import pl.michal_cyran.website.projects.domain.ProjectCategory
import pl.michal_cyran.website.projects.domain.ProjectType
import website.composeapp.generated.resources.Res
import website.composeapp.generated.resources.calculate
import website.composeapp.generated.resources.code
import website.composeapp.generated.resources.school
import website.composeapp.generated.resources.trophy



fun ProjectType.toColor(): androidx.compose.ui.graphics.Color {
    return when (this) {
        ProjectType.MOBILE_APPLICATION -> BadgeColors.cyan
        ProjectType.WEB_APPLICATION -> BadgeColors.magenta
        ProjectType.DESKTOP_APPLICATION -> BadgeColors.red
        ProjectType.MULTIPLATFORM_APPLICATION -> BadgeColors.green
        else -> BadgeColors.blue
    }
}

fun ProjectCategory.toColor(): Color {
    return when (this) {
        ProjectCategory.COMMERCIAL -> BadgeColors.cyan
        ProjectCategory.ACADEMIC -> BadgeColors.blue
        ProjectCategory.TOOLS -> BadgeColors.magenta
        ProjectCategory.PRACTICE -> BadgeColors.red
        ProjectCategory.PERSONAL -> BadgeColors.green
    }
}