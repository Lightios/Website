package pl.michal_cyran.website.skills.domain

import org.jetbrains.compose.resources.StringResource
import website.composeapp.generated.resources.Res
import website.composeapp.generated.resources.advanced
import website.composeapp.generated.resources.beginner
import website.composeapp.generated.resources.expert
import website.composeapp.generated.resources.native
import website.composeapp.generated.resources.c1
import website.composeapp.generated.resources.competent
import website.composeapp.generated.resources.proficient

enum class SkillLevel(
    val displayName: StringResource
) {
    BEGINNER(Res.string.beginner),
    COMPETENT(Res.string.competent),
    PROFICIENT(Res.string.proficient),
    ADVANCED(Res.string.advanced),
    EXPERT(Res.string.expert),
    NATIVE(Res.string.native),
    C1(Res.string.c1),
}