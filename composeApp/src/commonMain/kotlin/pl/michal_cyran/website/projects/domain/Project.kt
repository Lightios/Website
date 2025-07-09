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
    val links: List<ProjectLink>,
    val category: ProjectCategory,
    val screenshots: List<Screenshot>,
)

//description: 'projects.vl.description',
//shortDescription: 'projects.vl.shortDescription',
//links: [{ to: 'https://play.google.com/store/apps/details?id=pl.ppistudio.valorantlineups.ppistudio.valorantlineups&hl=pl/', label: 'Google Play' }, ],
//logo: Assets.ValorantLineups,
//name: 'Valorant Lineups',
//period: {
//    from: new Date(2021, 7, 1),
//    to: new Date(2023, 7, 30)
//},
//skills: getSkills('python', 'kivy', 'kotlin', 'compose'),
//type: 'Mobile Application',