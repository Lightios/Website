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
import pl.michal_cyran.website.core.domain.Badge
import kotlin.time.TimeMark

data class Experience(
    val title: String,
    val description: String,
    val icon: DrawableResource,
    val iconColor: Color,
    val iconBackground: Color,
    val badges: List<Badge>,
    val startDate: LocalDate,
    val stats: List<Stat>,
    val endDate: LocalDate? = null,
    val technologies: List<Technology> = emptyList(),
) {
    val duration: String

    get () = if (endDate != null) {
        val difference = endDate - startDate
        "${difference.years} years"
    } else {
        val now: Instant = Clock.System.now()
        val today: LocalDate = now.toLocalDateTime(TimeZone.currentSystemDefault()).date
        val difference = today - startDate

        "${difference.years} years"
    }
}

