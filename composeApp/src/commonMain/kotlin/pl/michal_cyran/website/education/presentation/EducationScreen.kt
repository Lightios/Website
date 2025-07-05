package pl.michal_cyran.website.education.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.painterResource
import pl.michal_cyran.website.education.data.education
import pl.michal_cyran.website.education.domain.Education
import pl.michal_cyran.website.education.domain.Subject
import website.composeapp.generated.resources.Res
import website.composeapp.generated.resources.light_mode


@Composable
fun EducationScreen() {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(0.8f)
                .background(MaterialTheme.colorScheme.background)
                .padding(16.dp),
            horizontalArrangement = Arrangement.spacedBy(60.dp)
        ) {
            for (education in education) {
                EducationCard(
                    education = education,
                    modifier = Modifier.weight(1f).fillMaxHeight()
                )
            }
        }
    }
}

