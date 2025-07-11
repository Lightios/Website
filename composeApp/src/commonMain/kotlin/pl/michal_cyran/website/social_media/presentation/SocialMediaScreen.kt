package pl.michal_cyran.website.social_media.presentation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import pl.michal_cyran.website.core.domain.Badge
import pl.michal_cyran.website.experience.domain.Stat
import pl.michal_cyran.website.social_media.domain.SocialPlatform

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.BorderStroke
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import pl.michal_cyran.website.social_media.data.socialMedia
import website.composeapp.generated.resources.Res
import website.composeapp.generated.resources.calendar_month
import website.composeapp.generated.resources.social_media
import website.composeapp.generated.resources.social_media_subtitle
import website.composeapp.generated.resources.social_media_title

@Composable
fun SocialMediaScreen(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(24.dp, Alignment.CenterVertically)
    ) {
//        Row(
//            verticalAlignment = Alignment.CenterVertically,
//            modifier = Modifier.padding(bottom = 48.dp)
//        ) {
//            IconButton(
//                onClick = { /* Navigate back */ }
//            ) {
//                Icon(
//                    painter = painterResource(Res.drawable.calendar_month),
//                    contentDescription = "Back to Home",
//                    tint = Color.White,
//                    modifier = Modifier.size(24.dp)
//                )
//            }
//
//            Spacer(modifier = Modifier.width(8.dp))
//
//            Text(
//                text = "Back to Home",
//                color = Color.White,
//                fontSize = 16.sp
//            )
//        }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
//                .fillMaxWidth()
                .padding(bottom = 48.dp)
        ) {
            Text(
                text = stringResource(Res.string.social_media_title),
                fontSize = 48.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = stringResource(Res.string.social_media_subtitle),
                fontSize = 16.sp,
                color = Color(0xFF94A3B8),
                textAlign = TextAlign.Center,
                lineHeight = 24.sp
            )
        }

        // Platform cards
        Row(
            modifier = Modifier.fillMaxWidth(0.6f),
            horizontalArrangement = Arrangement.spacedBy(24.dp)
        ) {
            socialMedia.forEach { platform ->
                PlatformCard(
                    platform = platform,
                    modifier = Modifier.weight(1f)
                )
            }
        }
    }
}
