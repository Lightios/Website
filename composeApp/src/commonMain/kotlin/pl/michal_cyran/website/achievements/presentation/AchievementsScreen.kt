package pl.michal_cyran.website.achievements.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import pl.michal_cyran.website.achievements.data.achievements
import pl.michal_cyran.website.achievements.domain.AchievementCategory
import pl.michal_cyran.website.core.domain.Stat
import pl.michal_cyran.website.core.presentation.composables.StatisticCard

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
                text = "My Achievements",
                fontSize = 48.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "A comprehensive collection of awards, recognitions, and\naccomplishments spanning programming, mathematics, academics,\nand scholarships from 2016 to 2021.",
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





