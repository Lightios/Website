package pl.michal_cyran.website.education.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.pluralStringResource
import org.jetbrains.compose.resources.stringResource
import pl.michal_cyran.website.education.domain.Education
import website.composeapp.generated.resources.Res
import website.composeapp.generated.resources.calendar_month
import website.composeapp.generated.resources.courses
import website.composeapp.generated.resources.light_mode
import website.composeapp.generated.resources.location
import website.composeapp.generated.resources.n_certificates
import website.composeapp.generated.resources.n_courses
import website.composeapp.generated.resources.n_years
import website.composeapp.generated.resources.professional_certificates


@Composable
fun EducationCard(
    education: Education,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier,
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceContainer
        ),
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
    ) {
        Column(
            modifier = Modifier.padding(24.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = stringResource(education.title),
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(bottom = 8.dp)
            ) {
                Image(
                    painter = painterResource(education.icon),
                    contentDescription = "Institution",
                    modifier = Modifier.size(100.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = stringResource(education.institution),
                    color = Color(0xFF06B6D4),
                    style = MaterialTheme.typography.titleLarge,
                )
            }

            // Duration and location
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(bottom = 8.dp)
            ) {
                Icon(
                    painter = painterResource(Res.drawable.calendar_month),
                    contentDescription = "Duration",
                    tint = Color(0xFF64748B),
                    modifier = Modifier.size(16.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = pluralStringResource(Res.plurals.n_years, education.durationInYears, education.durationInYears),
                    color = Color(0xFF64748B),
                    fontSize = 14.sp
                )

                Spacer(modifier = Modifier.width(16.dp))

                Icon(
                    painter = painterResource(Res.drawable.location),
                    contentDescription = "Location",
                    tint = Color(0xFF64748B),
                    modifier = Modifier.size(16.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = stringResource(education.location),
                    color = Color(0xFF64748B),
                    fontSize = 14.sp
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Core Subjects
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = stringResource(Res.string.courses),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.White
                )

                Text(
                    text = pluralStringResource(
                        Res.plurals.n_courses,
                        education.subjects.size,
                        education.subjects.size
                    ),
                    fontSize = 14.sp,
                    color = Color(0xFF64748B)
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Subject list
            education.subjects
                .groupBy { it.category }
                .forEach { (category, subjects) ->
                    CategorySection(
                        category = category,
                        subjects = subjects,
                        modifier = Modifier.fillMaxWidth()
                    )
                    Spacer(modifier = Modifier.height(12.dp))
                }

            if (education.certificates.isNotEmpty()) {
                Spacer(modifier = Modifier.height(16.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = stringResource(Res.string.professional_certificates),
                        fontSize = 16.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color.White
                    )

                    Text(
                        text = pluralStringResource(
                            Res.plurals.n_certificates,
                            education.certificates.size,
                            education.certificates.size
                        ),
                        fontSize = 14.sp,
                        color = Color(0xFF64748B)
                    )
                }

                Spacer(modifier = Modifier.height(16.dp))

                education.certificates.forEach { certificate ->
                    CertificateItem(certificate = certificate)
                    Spacer(modifier = Modifier.height(8.dp))
                }
            }
        }
    }
}