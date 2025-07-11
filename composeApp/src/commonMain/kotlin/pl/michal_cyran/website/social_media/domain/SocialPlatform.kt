package pl.michal_cyran.website.social_media.domain

import androidx.compose.ui.graphics.Color
import io.ktor.http.Url
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.skia.Drawable
import pl.michal_cyran.website.core.domain.Badge
import pl.michal_cyran.website.core.domain.Stat

data class SocialPlatform(
    val name: String,
    val icon: DrawableResource,
    val badge: Badge,
    val description: String,
    val stats: List<Stat>,
    val buttonText: String,
    val buttonColor: Color,
    val url: String,
)