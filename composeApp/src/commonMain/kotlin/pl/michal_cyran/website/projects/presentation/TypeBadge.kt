package pl.michal_cyran.website.projects.presentation

import androidx.compose.runtime.Composable
import pl.michal_cyran.website.core.domain.Badge
import pl.michal_cyran.website.core.presentation.composables.StatusBadge
import pl.michal_cyran.website.projects.domain.ProjectCategory
import pl.michal_cyran.website.projects.domain.ProjectType

@Composable
fun TypeBadge(
    type: ProjectType
) {
    StatusBadge(
        Badge(
            text = type.displayName,
            backgroundColor = type.toColor(),
        )
    )
}


@Composable
fun CategoryBadge(
    category: ProjectCategory
) {
    StatusBadge(
        Badge(
            text = category.displayName,
            backgroundColor = category.toColor(),
        )
    )
}