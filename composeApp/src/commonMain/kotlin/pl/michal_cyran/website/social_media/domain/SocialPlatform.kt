package pl.michal_cyran.website.social_media.domain

import androidx.compose.ui.graphics.Color
import pl.michal_cyran.website.core.domain.Badge
import pl.michal_cyran.website.core.domain.Stat

data class SocialPlatform(
    val name: String,
    val icon: String,
    val badge: Badge,
    val description: String,
    val stats: List<Stat>,
    val tags: List<String>,
    val buttonText: String,
    val buttonColor: Color,
    val iconColor: Color
)