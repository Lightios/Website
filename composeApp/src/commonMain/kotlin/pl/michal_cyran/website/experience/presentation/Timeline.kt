package pl.michal_cyran.website.experience.presentation

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.painterResource
import pl.michal_cyran.website.core.utils.displayDate
import pl.michal_cyran.website.experience.domain.Experience
import website.composeapp.generated.resources.Res
import website.composeapp.generated.resources.calendar_month

@Composable
fun Timeline(
    experience: Experience,
    modifier: Modifier = Modifier
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
    ) {
        Icon(
            painter = painterResource(Res.drawable.calendar_month),
            contentDescription = "Timeline",
            tint = Color(0xFF64748B),
            modifier = Modifier.size(16.dp)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Date(date = displayDate(experience.startDate))

        Surface(
            modifier = Modifier
                .weight(1f)
                .padding(horizontal =  12.dp)
                .height(5.dp),
            shape = RoundedCornerShape(10.dp),
            color = Color(0xFF64748B).copy(alpha = 0.7f),
        ) {}

        Date(date = displayDate(experience.endDate))
    }
}

@Composable
fun Date(
    date: String,
) {
    Surface(
        color = Color(0xFF06B6D4).copy(alpha = 0.15f),
        shape = RoundedCornerShape(8.dp),
        border = BorderStroke(1.dp, Color(0xFF06B6D4).copy(alpha = 0.3f)),
        modifier = Modifier.clip(RoundedCornerShape(8.dp))
    ) {
        Text(
            text = date,
            color = Color(0xFF06B6D4),
            fontSize = 12.sp,
            fontWeight = FontWeight.Medium,
            modifier = Modifier.padding(horizontal = 10.dp, vertical = 2.dp)
        )
    }
}