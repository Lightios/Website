package pl.michal_cyran.website.projects.domain

import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.StringResource

data class Project (
    val name: String,
    val description: StringResource,
    val shortDescription: StringResource,
    val logo: DrawableResource,
    val skills: List<String>,
    val type: ProjectType,
    val category: ProjectCategory,
    val links: List<ProjectLink> = emptyList(),
    val screenshots: List<Screenshot> = emptyList(),
)
