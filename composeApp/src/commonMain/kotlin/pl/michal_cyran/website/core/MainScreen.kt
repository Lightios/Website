package pl.michal_cyran.website.core

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import website.composeapp.generated.resources.Res
import website.composeapp.generated.resources.light_mode

@Composable
fun MainScreen(
    onEducationNavigate: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Spacer(
        modifier = Modifier.height(16.dp)
    )

    Column(
        modifier = Modifier
            .fillMaxWidth(0.5f)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(
            text = buildAnnotatedString {
                append("Welcome to My\n")
                withStyle(SpanStyle(color = MaterialTheme.colorScheme.primary)) {
                    append("Digital Portfolio")
                }
            },
            style = MaterialTheme.typography.headlineLarge
        )

        Text(
            text = "Discover my journey, skills, projects, and achievements. From tutoring to content creation, explore what drives my passion for learning and teaching.",
            style = MaterialTheme.typography.bodyLarge,
            textAlign = TextAlign.Center,
            color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.7f),
        )

        Spacer(
            modifier = Modifier.height(100.dp)
        )

        Row(
            modifier = Modifier.fillMaxWidth(0.6f).padding(16.dp),
            horizontalArrangement = Arrangement.spacedBy(20.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            NavigationCard(
                icon = Res.drawable.light_mode,
                title = "Education",
                content = "Explore my digital portfolio, showcasing my journey, skills, and projects.",
                buttonText = "Learn More",
                onClick = onEducationNavigate,
                color = MaterialTheme.colorScheme.primary,
                modifier = Modifier.weight(1f),
            )
            NavigationCard(
                icon = Res.drawable.light_mode,
                title = "Home",
                content = "Explore my digital portfolio, showcasing my journey, skills, and projects.",
                buttonText = "Learn More",
                onClick = { /* Navigate to Home */ },
                color = MaterialTheme.colorScheme.primary,
                modifier = Modifier.weight(1f),
            )
            NavigationCard(
                icon = Res.drawable.light_mode,
                title = "Home",
                content = "Explore my digital portfolio, showcasing my journey, skills, and projects.",
                buttonText = "Learn More",
                onClick = { /* Navigate to Home */ },
                color = MaterialTheme.colorScheme.primary,
                modifier = Modifier.weight(1f),
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth(0.6f).padding(16.dp),
            horizontalArrangement = Arrangement.spacedBy(20.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            NavigationCard(
                icon = Res.drawable.light_mode,
                title = "Home",
                content = "Explore my digital portfolio, showcasing my journey, skills, and projects.",
                buttonText = "Learn More",
                onClick = { /* Navigate to Home */ },
                color = MaterialTheme.colorScheme.primary,
                modifier = Modifier.weight(1f),
            )
            NavigationCard(
                icon = Res.drawable.light_mode,
                title = "Home",
                content = "Explore my digital portfolio, showcasing my journey, skills, and projects.",
                buttonText = "Learn More",
                onClick = { /* Navigate to Home */ },
                color = MaterialTheme.colorScheme.primary,
                modifier = Modifier.weight(1f),
            )
            NavigationCard(
                icon = Res.drawable.light_mode,
                title = "Home",
                content = "Explore my digital portfolio, showcasing my journey, skills, and projects.",
                buttonText = "Learn More",
                onClick = { /* Navigate to Home */ },
                color = MaterialTheme.colorScheme.primary,
                modifier = Modifier.weight(1f),
            )
        }
    }

}