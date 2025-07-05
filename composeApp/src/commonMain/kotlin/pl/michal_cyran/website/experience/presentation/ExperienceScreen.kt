package pl.michal_cyran.website.experience.presentation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.graphics.Color
import pl.michal_cyran.website.experience.data.experiences


@Composable
fun ExperienceScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(50.dp),
        horizontalAlignment = CenterHorizontally
    ) {
        for (experience in experiences) {
            ExperienceCard(
                experience = experience,
                modifier = Modifier.fillMaxWidth(0.6f)
            )
        }
    }
}



