package pl.michal_cyran.website.education.presentation

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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.painterResource
import pl.michal_cyran.website.education.domain.Education
import website.composeapp.generated.resources.Res
import website.composeapp.generated.resources.light_mode


@Composable
fun EducationCard(
    education: Education,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFF1E293B)
        ),
        shape = RoundedCornerShape(16.dp)
    ) {
        Column(
            modifier = Modifier.padding(24.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = education.title,
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
                Icon(
                    painter = painterResource(Res.drawable.light_mode),
                    contentDescription = "Institution",
                    tint = Color(0xFF06B6D4),
                    modifier = Modifier.size(16.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = education.institution,
                    color = Color(0xFF06B6D4),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium
                )
            }

            // Duration and location
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(bottom = 8.dp)
            ) {
                Icon(
                    painter = painterResource(Res.drawable.light_mode),
                    contentDescription = "Duration",
                    tint = Color(0xFF64748B),
                    modifier = Modifier.size(16.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = education.duration,
                    color = Color(0xFF64748B),
                    fontSize = 14.sp
                )

                Spacer(modifier = Modifier.width(16.dp))

                Icon(
                    painter = painterResource(Res.drawable.light_mode),
                    contentDescription = "Location",
                    tint = Color(0xFF64748B),
                    modifier = Modifier.size(16.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = education.location,
                    color = Color(0xFF64748B),
                    fontSize = 14.sp
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Qualification description
            Text(
                text = "Qualification",
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color.White,
                modifier = Modifier.padding(bottom = 8.dp)
            )

            Text(
                text = education.qualification,
                color = Color(0xFF94A3B8),
                fontSize = 14.sp,
                lineHeight = 20.sp
            )

            Spacer(modifier = Modifier.height(24.dp))

            // Core Subjects
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = if (education.certificates.isNotEmpty()) "Core Subjects" else "Course Curriculum",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.White
                )

                Text(
                    text = "${education.subjects.size} ${if (education.certificates.isNotEmpty()) "Subjects" else "Courses"}",
                    fontSize = 14.sp,
                    color = Color(0xFF64748B)
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Subject list
            education.subjects.forEach { subject ->
                SubjectItem(subject = subject)
                Spacer(modifier = Modifier.height(12.dp))
            }

            // Certificates section (only for IT Technician)
            if (education.certificates.isNotEmpty()) {
                Spacer(modifier = Modifier.height(16.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Professional Certificates",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color.White
                    )

                    Text(
                        text = "${education.certificates.size} Certificates",
                        fontSize = 14.sp,
                        color = Color(0xFF64748B)
                    )
                }

                Spacer(modifier = Modifier.height(16.dp))

                education.certificates.take(3).forEach { certificate ->
                    CertificateItem(certificate = certificate)
                    Spacer(modifier = Modifier.height(8.dp))
                }
            }

            Spacer(modifier = Modifier.height(24.dp))
        }
    }
}