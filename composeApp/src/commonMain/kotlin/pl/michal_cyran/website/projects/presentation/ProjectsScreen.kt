package pl.michal_cyran.website.projects.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import pl.michal_cyran.website.projects.data.projects
import pl.michal_cyran.website.projects.domain.ProjectCategory
import website.composeapp.generated.resources.Res
import website.composeapp.generated.resources.projects_subtitle
import website.composeapp.generated.resources.projects_title
import website.composeapp.generated.resources.search
import website.composeapp.generated.resources.search_placeholder
import kotlin.collections.component1
import kotlin.collections.component2

@Composable
fun ProjectsScreen(
    onProjectClick: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    var searchQuery by remember { mutableStateOf("") }

    Column(
        modifier = modifier
            .fillMaxWidth(0.4f)
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Header
        Text(
            text = stringResource(Res.string.projects_title),
            fontSize = 48.sp,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.onSurface,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = stringResource(Res.string.projects_subtitle),
            fontSize = 16.sp,
            color = Color(0xFF9CA3AF),
            textAlign = TextAlign.Center,
            lineHeight = 24.sp
        )

        Spacer(modifier = Modifier.height(32.dp))

        // Search Bar
        OutlinedTextField(
            value = searchQuery,
            onValueChange = { searchQuery = it },
            placeholder = {
                Text(
                    stringResource(Res.string.search_placeholder),
                    color = Color(0xFF6B7280)
                )
            },
            leadingIcon = {
                Icon(
                    painter = painterResource(Res.drawable.search),
                    contentDescription = "Search",
                    tint = Color(0xFF6B7280)
                )
            },
            modifier = Modifier
                .clip(RoundedCornerShape(12.dp)),
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color(0xFF374151),
                unfocusedBorderColor = Color(0xFF374151),
                focusedTextColor = Color.White,
                unfocusedTextColor = Color.White,
                cursorColor = Color(0xFF4A90E2)
            ),
            shape = RoundedCornerShape(12.dp)
        )

        Spacer(modifier = Modifier.height(48.dp))

        Column(
            verticalArrangement = Arrangement.spacedBy(32.dp)
        ) {
            ProjectCategory.entries.forEach { projectCategory ->
                ProjectsSection(
                    title = projectCategory.displayName,
                    projects = projects.filter { it.category == projectCategory },
                    searchQuery = searchQuery,
                    onProjectClick = onProjectClick
                )
            }
//            projects
//                .groupBy { it.category }
//                .forEach { (category, projectsList) ->
//                    if (projectsList.isEmpty()) return@forEach
//
//                    ProjectsSection(
//                        title = category.displayName,
//                        projects = projectsList,
//                        searchQuery = searchQuery,
//                        onProjectClick = onProjectClick,
//                    )
//                }
        }
    }
}
