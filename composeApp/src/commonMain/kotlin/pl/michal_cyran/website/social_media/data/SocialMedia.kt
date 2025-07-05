package pl.michal_cyran.website.social_media.data

import androidx.compose.ui.graphics.Color
import pl.michal_cyran.website.core.domain.Badge
import pl.michal_cyran.website.core.domain.Stat
import pl.michal_cyran.website.social_media.domain.SocialPlatform
import website.composeapp.generated.resources.Res
import website.composeapp.generated.resources.calendar_month

val socialMedia = listOf(
    SocialPlatform(
        name = "YouTube Channel",
        icon = "📺",
        badge = Badge("Educational Content", Color(0xFFDC2626)),
        description = "Join me on YouTube for in-depth educational tutorials, study tips, and comprehensive lessons across various subjects. New videos uploaded weekly!",
        stats = listOf(
            Stat("25+", "Videos", Res.drawable.calendar_month, Color(0xFFDC2626)),
//            Stat("❤", "Growing Community")
        ),
        tags = listOf("Tutorial Videos", "Study Tips", "Subject Reviews", "Exam Prep"),
        buttonText = "Subscribe to Channel",
        buttonColor = Color(0xFFDC2626),
        iconColor = Color(0xFFDC2626)
    ),
    SocialPlatform(
        name = "TikTok",
        icon = "🎵",
        badge = Badge("Quick Learning", Color(0xFFEC4899)),
        description = "Follow me on TikTok for bite-sized educational content, study motivation, and creative ways to make learning fun and memorable!",
        stats = listOf(
            Stat("25+", "Videos", Res.drawable.calendar_month, Color(0xFFDC2626)),
//        Stat("▶", "50+ Videos"),
//        Stat("❤", "Engaging Content")
        ),
        tags = listOf("Quick Tips", "Study Hacks", "Motivation", "Fun Learning"),
        buttonText = "Follow on TikTok",
        buttonColor = Color(0xFFEC4899),
        iconColor = Color(0xFFEC4899)
    )
)