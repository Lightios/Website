package pl.michal_cyran.website.skills.presentation

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.hoverable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import pl.michal_cyran.website.skills.domain.Skill

@Composable
fun SkillCard(
    skill: Skill,
    modifier: Modifier = Modifier
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isHovered by interactionSource.collectIsHoveredAsState()
    val scale by animateFloatAsState(
        targetValue = if (isHovered) 1.05f else 1f,
        label = "CardScale"
    )

    Card(
        modifier = modifier
            .graphicsLayer(
                scaleX = scale,
                scaleY = scale
            ).hoverable(
                interactionSource
            ),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceContainer,
            contentColor = MaterialTheme.colorScheme.onSurface,
        ),
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
    ) {
        Row(
            modifier = Modifier.padding(20.dp),
            horizontalArrangement = Arrangement.spacedBy(20.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(64.dp)
                    .background(MaterialTheme.colorScheme.surfaceContainerLow, CircleShape)
                    .border(color = skill.level.toColor(), width = 2.dp, shape = CircleShape),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(skill.icon),
                    contentDescription = "Skill Icon",
                    modifier = Modifier.size(40.dp),
                )
            }

            Text(
                text = skill.name,
                style = MaterialTheme.typography.titleMedium,
                modifier = Modifier
                    .weight(1f)
                    .padding(end = 8.dp)
            )

            SkillLevelIndicator(
                filled = skill.level.ordinal + 1,
                filledColor = skill.level.toColor()
            )


            SkillLevelBadge(
                skill.level,
                modifier = Modifier
                    .weight(1f)
            )

        }
    }
}

@Composable
fun SkillLevelIndicator(
    filled: Int,
    total: Int = 5,
    filledColor: Color,
    emptyColor: Color = Color.Gray,
    modifier: Modifier = Modifier
) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(4.dp),
        modifier = modifier
    ) {
        repeat(total) { index ->
            Box(
                modifier = Modifier
                    .size(width = 16.dp, height = 6.dp)
                    .background(
                        color = if (index < filled) filledColor else emptyColor,
                        shape = RoundedCornerShape(3.dp)
                    )
            )
        }
    }
}