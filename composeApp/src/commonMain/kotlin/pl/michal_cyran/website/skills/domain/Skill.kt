package pl.michal_cyran.website.skills.domain

import androidx.compose.ui.graphics.Color
import org.jetbrains.compose.resources.DrawableResource
import website.composeapp.generated.resources.Res
import website.composeapp.generated.resources.light_mode

data class Skill(
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
    PROGRAMMING_LANGUAGES("Programming Languages", Res.drawable.light_mode),
    MARKUP_AND_STYLE("Markup and Style", Res.drawable.light_mode),
    FRAMEWORKS("Frameworks", Res.drawable.light_mode),
    DATABASES("Databases", Res.drawable.light_mode),
    DEVOPS("DevOps", Res.drawable.light_mode),
    NATURAL_LANGUAGES("Natural Languages", Res.drawable.light_mode),
    TOOLS_AND_LIBRARIES("Tools and Libraries", Res.drawable.light_mode),
    OTHER("Other", Res.drawable.light_mode)
}