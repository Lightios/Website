package pl.michal_cyran.website.projects.presentation

import androidx.compose.ui.graphics.Color
import org.jetbrains.compose.resources.DrawableResource
import pl.michal_cyran.website.achievements.domain.AchievementCategory
import pl.michal_cyran.website.projects.domain.ProjectCategory
import pl.michal_cyran.website.projects.domain.ProjectType
import website.composeapp.generated.resources.Res
import website.composeapp.generated.resources.calculate
import website.composeapp.generated.resources.code
import website.composeapp.generated.resources.school
import website.composeapp.generated.resources.trophy



fun ProjectType.toColor(): androidx.compose.ui.graphics.Color {
    return when (this) {
        ProjectType.MOBILE_APPLICATION -> Color(0xFF3B82F6)
        ProjectType.WEB_APPLICATION -> Color(0xFF10B981)
        ProjectType.DESKTOP_APPLICATION -> Color(0xFF8B5CF6)
        ProjectType.MULTIPLATFORM_APPLICATION -> Color(0xFFF59E0B)
        else -> Color(0xFFF59E0B)
    }
}

fun ProjectCategory.toColor(): Color {
    return when (this) {
        ProjectCategory.COMMERCIAL -> Color(0xFF3B82F6)
        ProjectCategory.ACADEMIC -> Color(0xFF10B981)
        ProjectCategory.TOOLS -> Color(0xFF8B5CF6)
        ProjectCategory.PRACTICE -> Color(0xFFF59E0B)
    }
}