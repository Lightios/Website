package pl.michal_cyran.website.core.presentation.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import pl.michal_cyran.website.ui.theme.AppThemeM3
import website.composeapp.generated.resources.Res
import website.composeapp.generated.resources.light_mode

@Composable
fun NavigationCard(
    icon: DrawableResource,
    title: String,
    content: String,
    buttonText: String,
    onClick: () -> Unit,
    color: Color = MaterialTheme.colorScheme.primary,
    modifier: Modifier = Modifier,
) {
    Card(
        modifier = modifier.height(200.dp),
        shape = MaterialTheme.shapes.large,
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceContainer
        )
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(20.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painter = painterResource(icon),
                    contentDescription = "icon",
                    tint = color,
                    modifier = Modifier.size(40.dp)
                )

                Text(
                    text = title,
                    style = MaterialTheme.typography.titleLarge,
                    color = MaterialTheme.colorScheme.onSurface
                )
            }

            Text(
                text = content,
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.7f),
            )

            Spacer(
                modifier = Modifier.weight(1f)
            )

            TextButton(
                onClick = onClick,
            ) {
                Text(
                    text = buttonText,
                    style = MaterialTheme.typography.labelMedium,
                    color = color
                )

                Icon(
                    painter = painterResource(Res.drawable.light_mode),
                    contentDescription = "button icon",
                    tint = color,
                    modifier = Modifier.padding(start = 8.dp)
                )
            }
        }
    }
}


@Preview
@Composable
fun NavigationCardPreview() {
    AppThemeM3(
        darkTheme = true,
    ) {
        NavigationCard(
            icon = Res.drawable.light_mode,
            title = "Title",
            content = "Learn about my background, education, and what drives my passion for teaching and technology.",
            buttonText = "Click Me",
            onClick = {},
            color = MaterialTheme.colorScheme.primary,
            modifier = Modifier.width(200.dp)
        )
    }
}