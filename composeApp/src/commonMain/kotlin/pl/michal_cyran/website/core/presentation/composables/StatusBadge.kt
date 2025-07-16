package pl.michal_cyran.website.core.presentation.composables

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.hoverable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.stringResource
import pl.michal_cyran.website.core.domain.Badge


@Composable
fun StatusBadge(
    badge: Badge,
    modifier: Modifier = Modifier
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isHovered by interactionSource.collectIsHoveredAsState()
    val scale by animateFloatAsState(
        targetValue = if (isHovered) 1.05f else 1f,
        label = "CardScale"
    )


    Surface(
        color = badge.color.copy(alpha = 0.15f),
        shape = RoundedCornerShape(8.dp),
        modifier = modifier.clip(RoundedCornerShape(8.dp))
            .border(
                width = 1.dp,
                color = badge.color.copy(alpha = 0.3f),
                shape = RoundedCornerShape(8.dp)
            )
            .graphicsLayer(
                scaleX = scale,
                scaleY = scale
            ).hoverable(
                interactionSource
            )
    ) {
        Text(
            text = stringResource(badge.text),
            color = badge.color,
            fontSize = 12.sp,
            fontWeight = FontWeight.Medium,
            modifier = Modifier.padding(horizontal = 10.dp, vertical = 2.dp),
            textAlign = TextAlign.Center
        )
    }
}