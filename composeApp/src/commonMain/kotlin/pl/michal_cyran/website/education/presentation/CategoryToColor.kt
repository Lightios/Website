package pl.michal_cyran.website.education.presentation

import androidx.compose.ui.graphics.Color
import pl.michal_cyran.website.education.domain.SubjectCategory

fun categoryToColor(category: SubjectCategory): Color {
    return when (category) {
        SubjectCategory.Mathematics -> Color.Cyan
        SubjectCategory.ProgrammingAndSoftwareEngineering -> Color.Green
        SubjectCategory.SystemsAndComputerTechnology -> Color.Yellow
        SubjectCategory.AIAndCognitiveScience ->Color.Red
        SubjectCategory.Other -> Color.Magenta
    }
}