package pl.michal_cyran.website.social_media.presentation

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import pl.michal_cyran.website.experience.domain.Stat

@Composable
fun StatItem(stat: Stat) {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = stat.value,
            fontSize = 14.sp,
            color = Color(0xFF64748B)
        )

        Spacer(modifier = Modifier.width(6.dp))

        Text(
            text = stat.label,
            fontSize = 14.sp,
            color = Color(0xFF64748B),
            fontWeight = FontWeight.Medium
        )
    }
}