package pl.michal_cyran.website.projects.presentation

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.hoverable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import coil3.compose.AsyncImage
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import pl.michal_cyran.website.projects.data.projects
import pl.michal_cyran.website.skills.data.skillsBySlug
import pl.michal_cyran.website.skills.presentation.SkillCard
import website.composeapp.generated.resources.Res
import website.composeapp.generated.resources.project_overview
import website.composeapp.generated.resources.screenshots

@Composable
fun ProjectDetailsScreen(
    projectName: String,
    onBackClick: () -> Unit
) {
    val project = projects.find { it.name == projectName }
        ?: throw IllegalArgumentException("Project not found: $projectName")

//    var screenshotToDisplay by remember { mutableStateOf("") }

    Column(
        verticalArrangement = Arrangement.spacedBy(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth(0.8f)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            Image(
                painter = painterResource(project.logo),
                contentDescription = "Project Logo",
                modifier = Modifier.size(60.dp),
            )

            Text(
                text = project.name,
                style = MaterialTheme.typography.headlineLarge,
                modifier = Modifier.padding(16.dp)
            )
        }

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier.padding(bottom = 16.dp)
        ) {
            TypeBadge(
                type = project.type
            )

            CategoryBadge(
                category = project.category
            )
        }

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            modifier = Modifier.padding(bottom = 16.dp)
        ) {
            project.links.forEach { link ->
                ProjectLinkButton(link = link)
            }
        }

        Card(
            modifier = Modifier
                .fillMaxWidth(0.6f)
                .padding(16.dp),
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.surfaceContainer
            )
        ) {
            Column(
                modifier = Modifier.padding(40.dp)
            ) {
                Text(
                    text = stringResource(Res.string.project_overview),
                    style = MaterialTheme.typography.titleMedium,
                    modifier = Modifier.padding(bottom = 8.dp)
                )

                Text(
                    text = stringResource(project.description),
                    style = MaterialTheme.typography.bodyLarge,
                    modifier = Modifier.padding(bottom = 8.dp)
                )
            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth(0.8f)
                .padding(16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            project.skills.forEach { slug ->
                val skill = skillsBySlug[slug]!!

                val interactionSource = remember { MutableInteractionSource() }
                val isHovered by interactionSource.collectIsHoveredAsState()
                val scale by animateFloatAsState(
                    targetValue = if (isHovered) 1.05f else 1f,
                    label = "CardScale"
                )
                val color = if (isHovered) {
                    MaterialTheme.colorScheme.primaryContainer
                } else {
                    MaterialTheme.colorScheme.surfaceContainer
                }
                Card(
                    modifier = Modifier
                        .weight(1f)
                        .padding(8.dp)
                        .graphicsLayer(
                            scaleX = scale,
                            scaleY = scale
                        ).hoverable(
                            interactionSource
                        ),
                    colors = CardDefaults.cardColors(
                        containerColor = color
                    ),
                    shape = MaterialTheme.shapes.large
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.spacedBy(16.dp),
                        modifier = Modifier.padding(20.dp).fillMaxWidth()
                    ) {
                        Image(
                            painter = painterResource(skill.icon),
                            contentDescription = "Skill Icon",
                            modifier = Modifier
                                .size(50.dp)
                        )
                        Text(
                            text = skill.name,
                            style = MaterialTheme.typography.titleMedium,
                            modifier = Modifier.padding(8.dp)
                        )
                    }


                }

                Spacer(
                    modifier = Modifier.height(8.dp)
                )
            }
        }

        if (project.screenshots.isEmpty()) {
            return@Column
        }

        Card(
            modifier = Modifier
                .fillMaxWidth(0.6f)
                .padding(16.dp),
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.surfaceContainer
            )
        ) {
            Column(
                modifier = Modifier.padding(40.dp)
            ) {
                Text(
                    text = stringResource(Res.string.screenshots),
                    style = MaterialTheme.typography.titleMedium,
                    modifier = Modifier.padding(bottom = 8.dp)
                )
            }


            for (i in project.screenshots.indices step 2) {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(16.dp),
                    modifier = Modifier.fillMaxWidth().padding(vertical = 20.dp)
                ) {
                    project.screenshots.subList(i, (i + 2).coerceAtMost(project.screenshots.size)).forEach { screenshot ->
                        Screenshot(
                            screenshot.resource,
                            modifier = Modifier.weight(1f),
                            screenshotText = screenshot.label,
                        )
                    }
                    repeat(2 - (project.screenshots.size - i).coerceAtMost(2)) {
                        Spacer(modifier = Modifier.weight(1f))
                    }
                }
            }
        }
    }

}