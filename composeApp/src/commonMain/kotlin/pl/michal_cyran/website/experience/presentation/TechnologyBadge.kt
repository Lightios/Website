package pl.michal_cyran.website.experience.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.painterResource
import pl.michal_cyran.website.experience.domain.Technology

@Composable
fun TechnologyBadge(technology: Technology) {
    Surface(
        color = Color(0xFF1F2937),
        shape = RoundedCornerShape(8.dp),
        modifier = Modifier.clip(RoundedCornerShape(8.dp))
    ) {
        Image(
            painter = painterResource(technology.icon),
            contentDescription = technology.name,
            modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp).size(40.dp),
        )
    }
}