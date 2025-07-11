package pl.michal_cyran.website.projects.presentation

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.painterResource
import pl.michal_cyran.website.projects.domain.ProjectLink
import pl.michal_cyran.website.projects.domain.ProjectLinkType
import website.composeapp.generated.resources.Res
import website.composeapp.generated.resources.app_store
import website.composeapp.generated.resources.github
import website.composeapp.generated.resources.globe
import website.composeapp.generated.resources.google_play
import website.composeapp.generated.resources.unknown

@Composable
fun ProjectLinkButton(
    link: ProjectLink
) {
    val uriHandler = LocalUriHandler.current

    val icon = when (link.type) {
        ProjectLinkType.GITHUB -> Res.drawable.github
        ProjectLinkType.GOOGLE_PLAY -> Res.drawable.google_play
        ProjectLinkType.APP_STORE -> Res.drawable.app_store
        ProjectLinkType.WEBSITE -> Res.drawable.globe
        ProjectLinkType.OTHER -> Res.drawable.unknown
    }

    val color = when (link.type) {
        ProjectLinkType.WEBSITE -> MaterialTheme.colorScheme.primary
        else -> MaterialTheme.colorScheme.primaryContainer
    }

    val contentColor = when (link.type) {
        ProjectLinkType.WEBSITE -> MaterialTheme.colorScheme.onPrimary
        else -> MaterialTheme.colorScheme.onSurface
    }

    val text = when (link.type) {
        ProjectLinkType.GITHUB -> "GitHub"
        ProjectLinkType.GOOGLE_PLAY -> "Google Play"
        ProjectLinkType.APP_STORE -> "App Store"
        ProjectLinkType.WEBSITE -> "Website"
        ProjectLinkType.OTHER -> "Other"
    }

    Card(
        onClick = {
            uriHandler.openUri(link.to)
        },
        colors = CardDefaults.cardColors(
            containerColor = color,
            contentColor = contentColor
        ),
        shape = RoundedCornerShape(8.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
    ) {
        Row {
            Icon(
                painter = painterResource(icon),
                contentDescription = null,
                tint = contentColor,
                modifier = Modifier.padding(8.dp).size(24.dp)
            )
            Text(
                text = text,
                color = contentColor,
                modifier = Modifier.padding(8.dp)
            )
        }
    }

}