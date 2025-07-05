package pl.michal_cyran.website.education.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import pl.michal_cyran.website.education.domain.Subject
import pl.michal_cyran.website.education.domain.SubjectCategory


fun SubjectCategory.getDisplayName(): String {
    return when (this) {
        SubjectCategory.ProgrammingAndSoftwareEngineering -> "Programming & Software Engineering"
        SubjectCategory.Mathematics -> "Mathematics"
        SubjectCategory.SystemsAndComputerTechnology -> "Systems & Computer Technology"
        SubjectCategory.AIAndCognitiveScience -> "AI & Cognitive Science"
        SubjectCategory.Other -> "Other"
    }
}

@Composable
fun CategorySection(
    category: SubjectCategory,
    subjects: List<Subject>,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier,
    ) {
        Card(
            modifier = Modifier.padding(16.dp),
            shape = androidx.compose.foundation.shape.CircleShape,
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.secondaryContainer.copy(alpha = 0.3f),
                contentColor = categoryToColor(category),
            )
        ) {
            Text(
                text = category.getDisplayName(),
                modifier = Modifier.padding(horizontal = 12.dp, vertical = 4.dp),
                style = MaterialTheme.typography.labelSmall
            )
        }

        subjects.forEach { subject ->
            SubjectItem(
                subject = subject
            )
        }
    }
}