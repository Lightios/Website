package pl.michal_cyran.website.experience.domain

import androidx.compose.ui.graphics.Color
import kotlinx.datetime.Clock
import kotlinx.datetime.Instant
import kotlinx.datetime.LocalDate
import kotlinx.datetime.LocalDateTime
import kotlinx.datetime.TimeZone
import kotlinx.datetime.minus
import kotlinx.datetime.toLocalDateTime
import kotlinx.datetime.todayIn
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.StringResource
import pl.michal_cyran.website.core.domain.Badge
import kotlin.time.TimeMark

data class Experience(
    val title: StringResource,
    val description: StringResource,
    val icon: DrawableResource,
    val iconColor: Color,
    val iconBackground: Color,
    val badges: List<Badge>,
    val startDate: LocalDate,
    val stats: List<Stat>,
    val endDate: LocalDate? = null,
    val technologies: List<Technology> = emptyList(),
) {
    val durationInYears: Int
        get() {
            val today = Clock.System.todayIn(TimeZone.currentSystemDefault())
            val end = endDate ?: today
            return (end.year - startDate.year) - if (end.month < startDate.month || (end.month == startDate.month && end.dayOfMonth < startDate.dayOfMonth)) 1 else 0
        }
}

