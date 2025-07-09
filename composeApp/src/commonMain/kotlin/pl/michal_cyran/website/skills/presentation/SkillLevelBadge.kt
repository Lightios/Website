package pl.michal_cyran.website.skills.presentation

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.stringResource
import pl.michal_cyran.website.core.domain.Badge
import pl.michal_cyran.website.core.presentation.composables.StatusBadge
import pl.michal_cyran.website.skills.domain.SkillLevel

@Composable
fun SkillLevelBadge(
    level: SkillLevel,
    modifier: Modifier = Modifier,
) {
    StatusBadge(
        Badge(
            text = level.displayName,
            color = level.toColor(),
        ),
        modifier = modifier,
    )
}