package pl.michal_cyran.website.core.presentation.composables

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import pl.michal_cyran.website.core.domain.Badge


@Composable
fun StatusBadge(
    badge: Badge
) {
    Surface(
        color = badge.backgroundColor.copy(alpha = 0.15f),
        shape = RoundedCornerShape(8.dp),
        border = BorderStroke(1.dp, badge.backgroundColor.copy(alpha = 0.3f)),
        modifier = Modifier.clip(RoundedCornerShape(8.dp))
    ) {
        Text(
            text = badge.text,
            color = badge.backgroundColor,
            fontSize = 12.sp,
            fontWeight = FontWeight.Medium,
            modifier = Modifier.padding(horizontal = 10.dp, vertical = 2.dp)
        )
    }
}