package pl.michal_cyran.website.core.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.painterResource
import pl.michal_cyran.website.core.presentation.composables.ScreenButton
import website.composeapp.generated.resources.Res
import website.composeapp.generated.resources.achievements
import website.composeapp.generated.resources.dark_mode
import website.composeapp.generated.resources.deployed_code
import website.composeapp.generated.resources.education
import website.composeapp.generated.resources.experience
import website.composeapp.generated.resources.home
import website.composeapp.generated.resources.light_mode
import website.composeapp.generated.resources.main
import website.composeapp.generated.resources.person_play
import website.composeapp.generated.resources.projects
import website.composeapp.generated.resources.school
import website.composeapp.generated.resources.skills
import website.composeapp.generated.resources.smart_display
import website.composeapp.generated.resources.social_media
import website.composeapp.generated.resources.trophy
import website.composeapp.generated.resources.work_history

@Composable
fun TopBar(
    darkTheme: Boolean,
    onToggleTheme: () -> Unit,
    onHomeNavigate: () -> Unit,
    onSkillsNavigate: () -> Unit,
    onEducationNavigate: () -> Unit,
    onExperienceNavigate: () -> Unit,
    onProjectsNavigate: () -> Unit,
    onAchievementsNavigate: () -> Unit,
    onSocialMediaNavigate: () -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 120.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly,

    ) {

        IconButton(
            onClick = onToggleTheme
        ) {
            Icon(
                painter = if (darkTheme)
                    painterResource(Res.drawable.light_mode)
                else
                    painterResource(Res.drawable.dark_mode),
                contentDescription = "Menu"
            )
        }

        Text(
            text = "Michał Cyran",
            style = MaterialTheme.typography.bodyLarge,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary,
        )

        Spacer(
            modifier = Modifier.weight(1f)
        )

        ScreenButton(Res.string.main, icon=Res.drawable.home, onHomeNavigate, )
        ScreenButton(Res.string.skills, icon=Res.drawable.person_play, onSkillsNavigate)
        ScreenButton(Res.string.education, icon=Res.drawable.school, onEducationNavigate)
        ScreenButton(Res.string.experience, icon=Res.drawable.work_history, onExperienceNavigate)
        ScreenButton(Res.string.projects, icon=Res.drawable.deployed_code, onProjectsNavigate)
        ScreenButton(Res.string.achievements, icon=Res.drawable.trophy, onAchievementsNavigate)
        ScreenButton(Res.string.social_media, icon=Res.drawable.smart_display, onSocialMediaNavigate)
    }
}