package pl.michal_cyran.website.social_media.presentation

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import pl.michal_cyran.website.core.presentation.composables.StatisticCard
import pl.michal_cyran.website.core.presentation.composables.StatusBadge
import pl.michal_cyran.website.social_media.domain.SocialPlatform

@Composable
fun PlatformCard(
    platform: SocialPlatform,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier,
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFF1E293B)
        ),
        shape = RoundedCornerShape(16.dp),
        border = BorderStroke(1.dp, Color(0xFF334155))
    ) {
        Column(
            modifier = Modifier.padding(24.dp)
        ) {
            // Header with icon, title, and badge
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(bottom = 16.dp)
            ) {
                Text(
                    text = platform.icon,
                    fontSize = 24.sp,
                    color = platform.iconColor
                )

                Spacer(modifier = Modifier.width(12.dp))

                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = platform.name,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    StatusBadge(badge = platform.badge)
                }
            }

            // Description
            Text(
                text = platform.description,
                fontSize = 14.sp,
                color = Color(0xFF94A3B8),
                lineHeight = 20.sp,
                modifier = Modifier.padding(bottom = 20.dp)
            )

            // Stats
            Row(
                horizontalArrangement = Arrangement.spacedBy(24.dp),
                modifier = Modifier.padding(bottom = 20.dp)
            ) {
                platform.stats.forEach { stat ->
                    StatisticCard(stat = stat)
                }
            }

            // Tags
            LazyRow(
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier.padding(bottom = 24.dp)
            ) {
                items(platform.tags) { tag ->
                    TagChip(tag = tag)
                }
            }

            // Action button
            Button(
                onClick = { /* Handle platform action */ },
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(
                    containerColor = platform.buttonColor
                ),
                shape = RoundedCornerShape(8.dp)
            ) {
                Text(
                    text = platform.buttonText,
                    color = Color.White,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.padding(vertical = 4.dp)
                )
            }
        }
    }
}