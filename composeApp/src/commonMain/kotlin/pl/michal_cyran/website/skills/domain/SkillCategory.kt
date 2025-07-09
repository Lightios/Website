package pl.michal_cyran.website.skills.domain

import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.StringResource
import website.composeapp.generated.resources.Res
import website.composeapp.generated.resources.build
import website.composeapp.generated.resources.code
import website.composeapp.generated.resources.deployed_code
import website.composeapp.generated.resources.frameworks
import website.composeapp.generated.resources.language
import website.composeapp.generated.resources.languages
import website.composeapp.generated.resources.libraries
import website.composeapp.generated.resources.light_mode
import website.composeapp.generated.resources.markup_style
import website.composeapp.generated.resources.other
import website.composeapp.generated.resources.palette
import website.composeapp.generated.resources.programming_languages
import website.composeapp.generated.resources.tools_project

enum class SkillCategory(
    val title: StringResource,
    val icon: DrawableResource
) {
    PROGRAMMING_LANGUAGES(Res.string.programming_languages, Res.drawable.code),
    MARKUP_AND_STYLE(Res.string.markup_style, Res.drawable.palette),
    FRAMEWORKS(Res.string.frameworks, Res.drawable.deployed_code),
    NATURAL_LANGUAGES(Res.string.languages, Res.drawable.language),
    TOOLS_AND_LIBRARIES(Res.string.libraries, Res.drawable.build),
    OTHER(Res.string.other, Res.drawable.light_mode)
}