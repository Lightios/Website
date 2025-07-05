package pl.michal_cyran.website.projects.domain

enum class ProjectType(
    val displayName: String
) {
    MOBILE_APPLICATION("Mobile Application"),
    WEB_APPLICATION("Web Application"),
    DESKTOP_APPLICATION("Desktop Application"),
    MULTIPLATFORM_APPLICATION("Multiplatform Application"),
    LIBRARY("Library"),
    CONSOLE("Console"),
    GAME("Game"),
    OTHER("Other")
}