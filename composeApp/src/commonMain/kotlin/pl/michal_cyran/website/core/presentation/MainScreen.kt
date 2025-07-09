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
import org.jetbrains.compose.resources.stringResource
import pl.michal_cyran.website.core.presentation.composables.NavigationCard
import website.composeapp.generated.resources.Res
import website.composeapp.generated.resources.achievements
import website.composeapp.generated.resources.achievements_button
import website.composeapp.generated.resources.achievements_description
import website.composeapp.generated.resources.deployed_code
import website.composeapp.generated.resources.education
import website.composeapp.generated.resources.education_button
import website.composeapp.generated.resources.education_description
import website.composeapp.generated.resources.experience
import website.composeapp.generated.resources.experience_button
import website.composeapp.generated.resources.experience_description
import website.composeapp.generated.resources.home_description
import website.composeapp.generated.resources.person_play
import website.composeapp.generated.resources.projects
import website.composeapp.generated.resources.projects_button
import website.composeapp.generated.resources.projects_description
import website.composeapp.generated.resources.school
import website.composeapp.generated.resources.skills
import website.composeapp.generated.resources.skills_button
import website.composeapp.generated.resources.skills_description
import website.composeapp.generated.resources.smart_display
import website.composeapp.generated.resources.social_media
import website.composeapp.generated.resources.social_media_button
import website.composeapp.generated.resources.social_media_description
import website.composeapp.generated.resources.trophy
import website.composeapp.generated.resources.welcome_p1
import website.composeapp.generated.resources.welcome_p2
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
                append(stringResource(Res.string.welcome_p1) + "\n")
                withStyle(SpanStyle(color = MaterialTheme.colorScheme.primary)) {
                    append(stringResource(Res.string.welcome_p2))
                }
            },
            style = MaterialTheme.typography.headlineLarge
        )

        Text(
            text = stringResource(Res.string.home_description),
            style = MaterialTheme.typography.bodyLarge,
            textAlign = TextAlign.Center,
            color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.7f),
        )

        Spacer(
            modifier = Modifier.height(100.dp)
        )

        Row(
            modifier = Modifier.fillMaxWidth(0.7f).padding(16.dp),
            horizontalArrangement = Arrangement.spacedBy(20.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            NavigationCard(
                icon = Res.drawable.person_play,
                title = Res.string.skills,
                content = Res.string.skills_description,
                buttonText = Res.string.skills_button,
                onClick = onSkillsNavigate,
                color = MaterialTheme.colorScheme.primary,
                modifier = Modifier.weight(1f),
            )
            NavigationCard(
                icon = Res.drawable.school,
                title = Res.string.education,
                content = Res.string.education_description,
                buttonText = Res.string.education_button,
                onClick = onEducationNavigate,
                color = MaterialTheme.colorScheme.primary,
                modifier = Modifier.weight(1f),
            )
            NavigationCard(
                icon = Res.drawable.work_history,
                title = Res.string.experience,
                content = Res.string.experience_description,
                buttonText = Res.string.experience_button,
                onClick = onExperienceNavigate,
                color = MaterialTheme.colorScheme.primary,
                modifier = Modifier.weight(1f),
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth(0.7f).padding(16.dp),
            horizontalArrangement = Arrangement.spacedBy(20.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            NavigationCard(
                icon = Res.drawable.deployed_code,
                title = Res.string.projects,
                content = Res.string.projects_description,
                buttonText = Res.string.projects_button,
                onClick = onProjectsNavigate,
                color = MaterialTheme.colorScheme.primary,
                modifier = Modifier.weight(1f),
            )
            NavigationCard(
                icon = Res.drawable.trophy,
                title = Res.string.achievements,
                content = Res.string.achievements_description,
                buttonText = Res.string.achievements_button,
                onClick = onAchievementsNavigate,
                color = MaterialTheme.colorScheme.primary,
                modifier = Modifier.weight(1f),
            )
            NavigationCard(
                icon = Res.drawable.smart_display,
                title = Res.string.social_media,
                content = Res.string.social_media_description,
                buttonText = Res.string.social_media_button,
                onClick = onSocialMediaNavigate,
                color = Color.Red,
                modifier = Modifier.weight(1f),
            )
        }
    }

}