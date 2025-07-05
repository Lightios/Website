package pl.michal_cyran.website.projects.domain

data class ProjectLink (
    val to: String,
    val type: ProjectLinkType,
)


enum class ProjectLinkType {
    GITHUB,
    GOOGLE_PLAY,
    APP_STORE,
    WEBSITE,
    OTHER
}
