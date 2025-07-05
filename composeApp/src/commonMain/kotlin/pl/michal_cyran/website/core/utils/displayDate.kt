package pl.michal_cyran.website.core.utils

import kotlinx.datetime.LocalDate

fun displayDate(date: LocalDate?): String {
    if (date == null) return "now"

    return "${date.month.name.lowercase().replaceFirstChar { it.uppercase() }} ${date.year}"
}