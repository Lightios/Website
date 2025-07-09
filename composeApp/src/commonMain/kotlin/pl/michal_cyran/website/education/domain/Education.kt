package pl.michal_cyran.website.education.domain

import androidx.compose.ui.graphics.Color
import kotlinx.datetime.LocalDate
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.StringResource

data class Education(
    val title: StringResource,
    val institution: StringResource,
    val location: StringResource,
    val subjects: List<Subject>,
    val icon: DrawableResource,
    val startDate: LocalDate,
    val endDate: LocalDate,
    val certificates: List<StringResource> = emptyList(),
) {
    val durationInYears: Int
        get() {
            val difference = endDate.year - startDate.year
            return difference
        }
}