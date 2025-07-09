package pl.michal_cyran.website.education.domain

import org.jetbrains.compose.resources.StringResource

data class Subject(
    val name: StringResource,
    val category: SubjectCategory
)