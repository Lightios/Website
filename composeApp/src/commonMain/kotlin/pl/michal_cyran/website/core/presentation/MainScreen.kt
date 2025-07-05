package pl.michal_cyran.website.core.presentation

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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import pl.michal_cyran.website.core.presentation.composables.NavigationCard
import website.composeapp.generated.resources.Res
import website.composeapp.generated.resources.deployed_code
import website.composeapp.generated.resources.person_play
import website.composeapp.generated.resources.school
import website.composeapp.generated.resources.smart_display
import website.composeapp.generated.resources.trophy
import website.composeapp.generated.resources.work_history

@Composable
fun MainScreen(
    onSkillsNavigate: () -> Unit,
    onEducationNavigate: () -> Unit,
    onExperienceNavigate: () -> Unit,
    onProjectsNavigate: () -> Unit,
    onAchievementsNavigate: () -> Unit,
    onSocialMediaNavigate: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Spacer(
        modifier = Modifier.height(16.dp)
    )

    Column(
        modifier = modifier
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
                icon = Res.drawable.person_play,
                title = "Skills",
                content = "Discover my programming languages, frameworks, and technical expertise across different domains.",
                buttonText = "View skills",
                onClick = onSkillsNavigate,
                color = MaterialTheme.colorScheme.primary,
                modifier = Modifier.weight(1f),
            )
            NavigationCard(
                icon = Res.drawable.school,
                title = "Education",
                content = "Explore my academic journey from high school through university with detailed coursework and achievements.",
                buttonText = "Learn More",
                onClick = onEducationNavigate,
                color = MaterialTheme.colorScheme.primary,
                modifier = Modifier.weight(1f),
            )
            NavigationCard(
                icon = Res.drawable.work_history,
                title = "Experience",
                content = "Explore my professional journey, tutoring experience, and the skills I've developed along the way.",
                buttonText = "Learn More",
                onClick = onExperienceNavigate,
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
                icon = Res.drawable.deployed_code,
                title = "Projects",
                content = "Discover the projects I've worked on, from educational tools to creative endeavors.",
                buttonText = "Learn More",
                onClick = onProjectsNavigate,
                color = MaterialTheme.colorScheme.primary,
                modifier = Modifier.weight(1f),
            )
            NavigationCard(
                icon = Res.drawable.trophy,
                title = "Achievements",
                content = "Check out my accomplishments, certifications, and milestones throughout my journey.",
                buttonText = "Learn More",
                onClick = onAchievementsNavigate,
                color = MaterialTheme.colorScheme.primary,
                modifier = Modifier.weight(1f),
            )
            NavigationCard(
                icon = Res.drawable.smart_display,
                title = "Social Media",
                content = "Follow my educational content on YouTube and TikTok for tutorials and study tips.",
                buttonText = "Learn More",
                onClick = onSocialMediaNavigate,
                color = Color.Red,
                modifier = Modifier.weight(1f),
            )
        }
    }

}