package pl.michal_cyran.website.social_media.data

import androidx.compose.ui.graphics.Color
import pl.michal_cyran.website.core.domain.Badge
import pl.michal_cyran.website.core.domain.Stat
import pl.michal_cyran.website.social_media.domain.SocialPlatform
import website.composeapp.generated.resources.Res
import website.composeapp.generated.resources.calendar_month
import website.composeapp.generated.resources.social_media
import website.composeapp.generated.resources.tiktok
import website.composeapp.generated.resources.youtube

val socialMedia = listOf(
    SocialPlatform(
        name = "YouTube Channel",
        icon = Res.drawable.youtube,
        badge = Badge(Res.string.social_media, Color(0xFFDC2626)),
        description = "",
        stats = listOf(
            Stat("25+", Res.string.social_media, Res.drawable.calendar_month, Color(0xFFDC2626)),
//            Stat("❤", "Growing Community")
        ),
        buttonText = "Subscribe to Channel",
        buttonColor = Color(0xFFDC2626),
        url = "https://www.youtube.com/@cyran.michal/videos"
    ),
    SocialPlatform(
        name = "TikTok",
        icon = Res.drawable.tiktok,
        badge = Badge(Res.string.social_media, Color(0xFFEC4899)),
        description = "",
        stats = listOf(
            Stat("25+", Res.string.social_media, Res.drawable.calendar_month, Color(0xFFDC2626)),
//        Stat("▶", "50+ Videos"),
//        Stat("❤", "Engaging Content")
        ),
        buttonText = "Follow on TikTok",
        buttonColor = Color(0xFFEC4899),
        url = "https://www.tiktok.com/@cyran_michal"
    )
)