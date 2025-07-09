package pl.michal_cyran.website.projects.domain

import org.jetbrains.compose.resources.StringResource
import website.composeapp.generated.resources.Res
import website.composeapp.generated.resources.console_application
import website.composeapp.generated.resources.desktop_application
import website.composeapp.generated.resources.game
import website.composeapp.generated.resources.library
import website.composeapp.generated.resources.mobile_application
import website.composeapp.generated.resources.multiplatform_application
import website.composeapp.generated.resources.other
import website.composeapp.generated.resources.web_application


enum class ProjectType(
    val displayName: StringResource
) {
    MOBILE_APPLICATION(Res.string.mobile_application),
    WEB_APPLICATION(Res.string.web_application),
    DESKTOP_APPLICATION(Res.string.desktop_application),
    MULTIPLATFORM_APPLICATION(Res.string.multiplatform_application),
    LIBRARY(Res.string.library),
    CONSOLE(Res.string.console_application),
    GAME(Res.string.game),
    OTHER(Res.string.other);
}