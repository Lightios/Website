package pl.michal_cyran.website.core.utils

import androidx.compose.runtime.Composable
import kotlinx.datetime.LocalDate
import org.jetbrains.compose.resources.StringResource
import org.jetbrains.compose.resources.stringResource
import website.composeapp.generated.resources.Res
import website.composeapp.generated.resources.april
import website.composeapp.generated.resources.august
import website.composeapp.generated.resources.december
import website.composeapp.generated.resources.february
import website.composeapp.generated.resources.january
import website.composeapp.generated.resources.july
import website.composeapp.generated.resources.june
import website.composeapp.generated.resources.march
import website.composeapp.generated.resources.may
import website.composeapp.generated.resources.november
import website.composeapp.generated.resources.now
import website.composeapp.generated.resources.october
import website.composeapp.generated.resources.september
@Composable
fun displayDate(date: LocalDate?): String {
    if (date == null) return stringResource(Res.string.now)
    val months = listOf(
        Res.string.january,
        Res.string.february,
        Res.string.march,
        Res.string.april,
        Res.string.may,
        Res.string.june,
        Res.string.july,
        Res.string.august,
        Res.string.september,
        Res.string.october,
        Res.string.november,
        Res.string.december
    )

    val name = months[date.monthNumber - 1]
    val monthName = stringResource(name)

    return "$monthName ${date.year}"
}