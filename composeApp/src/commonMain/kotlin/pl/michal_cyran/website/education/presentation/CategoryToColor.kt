package pl.michal_cyran.website.education.presentation

import androidx.compose.ui.graphics.Color
import pl.michal_cyran.website.core.presentation.BadgeColors
import pl.michal_cyran.website.education.domain.SubjectCategory

fun categoryToColor(category: SubjectCategory): Color {
    return when (category) {
        SubjectCategory.Mathematics -> BadgeColors.cyan
        SubjectCategory.ProgrammingAndSoftwareEngineering -> BadgeColors.magenta
        SubjectCategory.SystemsAndComputerTechnology -> BadgeColors.green
        SubjectCategory.AIAndCognitiveScience -> BadgeColors.red
        SubjectCategory.Other -> BadgeColors.blue
    }
}