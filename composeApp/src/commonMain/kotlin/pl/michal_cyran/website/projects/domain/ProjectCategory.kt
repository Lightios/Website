package pl.michal_cyran.website.projects.domain

import org.jetbrains.compose.resources.StringResource
import website.composeapp.generated.resources.Res
import website.composeapp.generated.resources.commercial_project
import website.composeapp.generated.resources.academic_project
import website.composeapp.generated.resources.tools_project
import website.composeapp.generated.resources.practice_project

enum class ProjectCategory(
    val displayName: StringResource,
) {
    COMMERCIAL(Res.string.commercial_project),
    ACADEMIC(Res.string.academic_project),
    TOOLS(Res.string.tools_project),
    PRACTICE(Res.string.practice_project),
}