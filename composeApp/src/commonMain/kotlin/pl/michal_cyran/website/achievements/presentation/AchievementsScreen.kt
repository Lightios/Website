package pl.michal_cyran.website.achievements.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.stringResource
import pl.michal_cyran.website.achievements.data.achievements
import pl.michal_cyran.website.achievements.domain.AchievementCategory
import pl.michal_cyran.website.core.domain.Stat
import pl.michal_cyran.website.core.presentation.composables.StatisticCard
import website.composeapp.generated.resources.Res
import website.composeapp.generated.resources.achievements_subtitle
import website.composeapp.generated.resources.achievements_title

data class Badge(
    val text: String,
    val color: Color
)


@Composable
fun AchievementsScreen(
    modifier: Modifier = Modifier
) {
    val statCards = achievements
        .groupBy { it.category }
        .map { (category, achievements) ->
            Stat(
                label = category.displayName,
                value = achievements.size.toString(),
                icon = category.toIcon(),
                iconColor = category.toColor()
            )
        }.sortedWith(
            compareBy<Stat> { it.label == AchievementCategory.OTHER.displayName }
                .thenByDescending { it.value }
            )


    Column(
        modifier = Modifier
            .fillMaxWidth(0.4f)
            .padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(32.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(
                text = stringResource(Res.string.achievements_title),
                fontSize = 48.sp,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onSurface,
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = stringResource(Res.string.achievements_subtitle),
                fontSize = 16.sp,
                color = Color(0xFF94A3B8),
                textAlign = TextAlign.Center,
                lineHeight = 24.sp
            )
        }

        Row(
            modifier = Modifier.fillMaxWidth(0.8f),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            statCards.forEach { stat ->
                StatisticCard(
                    stat = stat,
                    modifier = Modifier.weight(1f)
                )
            }
        }

        val groups = achievements.groupBy{ it.category }

        for (category in AchievementCategory.entries) {
            AchievementCategorySection(
                category = category,
                achievements = groups[category] ?: emptyList(),
                modifier = Modifier.fillMaxSize(0.8f)
            )
        }
    }
}





