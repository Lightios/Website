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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import pl.michal_cyran.website.education.data.education
import pl.michal_cyran.website.education.domain.Education
import pl.michal_cyran.website.education.domain.Subject
import website.composeapp.generated.resources.Res
import website.composeapp.generated.resources.education_subtitle
import website.composeapp.generated.resources.education_title
import website.composeapp.generated.resources.light_mode
import website.composeapp.generated.resources.skills_subtitle
import website.composeapp.generated.resources.skills_title


@Composable
fun EducationScreen() {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(Res.string.education_title),
            fontSize = 48.sp,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.onSurface,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = stringResource(Res.string.education_subtitle),
            fontSize = 16.sp,
            color = Color(0xFF9CA3AF),
            textAlign = TextAlign.Center,
            lineHeight = 24.sp
        )

        Spacer(modifier = Modifier.height(32.dp))

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

