package pl.michal_cyran.website.projects.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.StringResource
import org.jetbrains.compose.resources.stringResource
import pl.michal_cyran.website.projects.domain.Project

@Composable
fun ProjectsSection(
    title: StringResource,
    projects: List<Project>,
    searchQuery: String,
    onProjectClick: (String) -> Unit,
) {
    val filteredProjects = projects.filter {
        it.name.contains(searchQuery, ignoreCase = true)
    }

    if (filteredProjects.isNotEmpty()) {
        Column(
            modifier = Modifier
                .fillMaxWidth(0.8f)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                modifier = Modifier.padding(bottom = 24.dp)
            ) {
//                Icon(
//                    painter = painterResource(icon),
//                    contentDescription = "Skill Icon",
//                    modifier = Modifier.size(32.dp),
//                    tint = MaterialTheme.colorScheme.primary
//                )
                Text(
                    text = stringResource(title),
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
            }

            for (i in filteredProjects.indices step 3) {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(16.dp),
                    modifier = Modifier.fillMaxWidth().padding(vertical = 20.dp)
                ) {
                    filteredProjects.subList(i, (i + 3).coerceAtMost(filteredProjects.size)).forEach { project ->
                        ProjectCard(
                            project = project,
                            onProjectClick = { onProjectClick(project.name) },
                            modifier = Modifier.weight(1f)
                        )
                    }
                    repeat(3 - (filteredProjects.size - i).coerceAtMost(3)) {
                        Spacer(modifier = Modifier.weight(1f))
                    }
                }

            }

        }
    }
}
