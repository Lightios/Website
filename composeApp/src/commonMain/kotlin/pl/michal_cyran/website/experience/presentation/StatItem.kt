package pl.michal_cyran.website.experience.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.stringResource
import pl.michal_cyran.website.experience.domain.Stat

@Composable
fun StatItem(stat: Stat) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stat.value,
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = stat.color
        )
        Text(
            text = stringResource(stat.label),
            fontSize = 13.sp,
            color = Color(0xFF64748B),
            textAlign = TextAlign.Center,
            lineHeight = 16.sp
        )
    }
}