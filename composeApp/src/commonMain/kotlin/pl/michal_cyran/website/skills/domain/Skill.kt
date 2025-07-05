package pl.michal_cyran.website.skills.domain

import androidx.compose.ui.graphics.Color
import org.jetbrains.compose.resources.DrawableResource
import website.composeapp.generated.resources.Res
import website.composeapp.generated.resources.build
import website.composeapp.generated.resources.code
import website.composeapp.generated.resources.deployed_code
import website.composeapp.generated.resources.language
import website.composeapp.generated.resources.light_mode
import website.composeapp.generated.resources.palette

data class Skill(
    val slug: String,
    val name: String,
    val level: String,
    val color: Color = Color.Unspecified,
    val category: SkillCategory,
    val icon: DrawableResource,
)


enum class SkillCategory(
    val title: String,
    val icon: DrawableResource
) {
    PROGRAMMING_LANGUAGES("Programming Languages", Res.drawable.code),
    MARKUP_AND_STYLE("Markup and Style", Res.drawable.palette),
    FRAMEWORKS("Frameworks", Res.drawable.deployed_code),
    NATURAL_LANGUAGES("Natural Languages", Res.drawable.language),
    TOOLS_AND_LIBRARIES("Tools and Libraries", Res.drawable.build),
    OTHER("Other", Res.drawable.light_mode)
}