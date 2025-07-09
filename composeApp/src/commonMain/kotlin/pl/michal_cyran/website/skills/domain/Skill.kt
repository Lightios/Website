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
    val level: SkillLevel,
    val category: SkillCategory,
    val icon: DrawableResource,
)


