package pl.michal_cyran.website.projects.presentation

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Badge
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import pl.michal_cyran.website.projects.domain.Project
import pl.michal_cyran.website.skills.data.skillsBySlug
import kotlin.collections.forEach

@Composable
fun ProjectCard(
    project: Project,
    onProjectClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .height(400.dp)
            .clickable(
                onClick = onProjectClick,
            )

        ,
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceContainer
        ),
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
    ) {
        Column(
            modifier = Modifier.padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                Box(
                    modifier = Modifier
                        .size(64.dp)
                        .background(MaterialTheme.colorScheme.surfaceContainerLow, CircleShape),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(project.logo),
                        contentDescription = "Project Logo",
                        modifier = Modifier.size(60.dp),
                    )
                }

                Spacer(
                    modifier = Modifier.weight(1f)
                )

                TypeBadge(
                    type = project.type
                )
            }

            Spacer(modifier = Modifier.width(5.dp))

            Text(
                text = project.name,
                style = MaterialTheme.typography.titleMedium,
                color = Color.White
            )

            Text(
                text = stringResource(project.shortDescription),
                style = MaterialTheme.typography.bodyMedium,
                color = Color(0xFF9CA3AF),
                modifier = Modifier.padding(horizontal = 10.dp)
            )


            Spacer(
                modifier = Modifier.weight(1f)
            )

            HorizontalDivider(
                color = MaterialTheme.colorScheme.outline,
                thickness = 1.dp,
                modifier = Modifier.padding(horizontal = 10.dp)
            )

            Row(
                modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp, vertical = 8.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                project.skills.forEach { slug ->
                    val skill = skillsBySlug[slug]!!
                    Image(
                        painter = painterResource(skill.icon),
                        contentDescription = skill.name,
                        modifier = Modifier
                            .size(40.dp)
                            .border(color = MaterialTheme.colorScheme.primary, width = 1.dp, shape = RoundedCornerShape(8.dp))
                            .clip(RoundedCornerShape(8.dp))
                            .background(MaterialTheme.colorScheme.surfaceContainerLow)
                            .padding(8.dp)
                    )
                }
            }
        }
    }
}