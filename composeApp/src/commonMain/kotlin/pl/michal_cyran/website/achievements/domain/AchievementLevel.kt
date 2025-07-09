package pl.michal_cyran.website.achievements.domain

import org.jetbrains.compose.resources.StringResource
import website.composeapp.generated.resources.Res
import website.composeapp.generated.resources.district
import website.composeapp.generated.resources.international
import website.composeapp.generated.resources.national
import website.composeapp.generated.resources.regional
import website.composeapp.generated.resources.school

enum class AchievementLevel(
    val displayName: StringResource
) {
    SCHOOL(Res.string.school),
    REGIONAL(Res.string.regional),
    NATIONAL(Res.string.national),
    INTERNATIONAL(Res.string.international),
    DISTRICT(Res.string.district);


}
