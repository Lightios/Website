package pl.michal_cyran.website.education.presentation

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.hoverable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.StringResource
import org.jetbrains.compose.resources.stringResource

@Composable
fun CertificateItem(certificate: StringResource) {

    val interactionSource = remember { MutableInteractionSource() }
    val isHovered by interactionSource.collectIsHoveredAsState()
    val scale by animateFloatAsState(
        targetValue = if (isHovered) 1.05f else 1f,
        label = "CardScale"
    )
    val color = if (isHovered) {
        MaterialTheme.colorScheme.primary
    } else {
        Color(0xFF94A3B8)
    }

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .graphicsLayer(
                scaleX = scale,
                scaleY = scale
            ).hoverable(
                interactionSource
            )
    ) {
        Box(
            modifier = Modifier
                .size(8.dp)
                .background(Color(0xFF06B6D4), shape = RoundedCornerShape(4.dp))
        )

        Spacer(modifier = Modifier.width(12.dp))

        Text(
            text = stringResource(certificate),
            color = color,
            fontSize = 14.sp
        )
    }
}