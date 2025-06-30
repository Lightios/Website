package pl.michal_cyran.website.education.presentation

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import pl.michal_cyran.website.education.domain.Subject


@Composable
fun SubjectItem(subject: Subject) {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = subject.name,
            color = Color.White,
            fontSize = 14.sp,
            fontWeight = FontWeight.Medium
        )

        Spacer(modifier = Modifier.weight(1f))

        Surface(
            color = categoryToColor(subject.category),
            shape = RoundedCornerShape(6.dp)
        ) {
            Text(
                text = subject.name,
                color = Color.White,
                fontSize = 10.sp,
                fontWeight = FontWeight.Medium,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
            )
        }
    }
}