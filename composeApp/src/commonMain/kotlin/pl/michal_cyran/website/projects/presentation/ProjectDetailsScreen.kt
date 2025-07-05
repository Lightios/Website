package pl.michal_cyran.website.projects.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.painterResource
import pl.michal_cyran.website.projects.data.projects
import pl.michal_cyran.website.skills.data.skillsBySlug
import pl.michal_cyran.website.skills.presentation.SkillCard

@Composable
fun ProjectDetailsScreen(
    projectName: String,
    onBackClick: () -> Unit
) {
    val project = projects.find { it.name == projectName }
        ?: throw IllegalArgumentException("Project not found: $projectName")

    Column(
        verticalArrangement = Arrangement.spacedBy(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
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

        Card {
            Text(
                text = project.description,
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(16.dp)
            )
        }


        Card(
            modifier = Modifier
                .fillMaxWidth(0.3f)
                .padding(16.dp),
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.surfaceContainer
            )
        ) {
            project.skills.forEach { slug ->
                val skill = skillsBySlug[slug]!!
                SkillCard(
                    skill = skill,
                    modifier = Modifier
                )

                Spacer(
                    modifier = Modifier.height(8.dp)
                )
            }
        }
    }
}