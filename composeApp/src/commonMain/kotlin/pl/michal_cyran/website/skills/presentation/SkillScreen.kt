package pl.michal_cyran.website.skills.presentation

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.painterResource
import pl.michal_cyran.website.skills.data.skills

import website.composeapp.generated.resources.Res
import website.composeapp.generated.resources.light_mode


@Composable
fun SkillsScreen() {
    var searchQuery by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxWidth(0.8f)
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Header
        Text(
            text = "Technical Skills",
            fontSize = 48.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "A comprehensive overview of my programming languages,\nframeworks, and technical expertise.",
            fontSize = 16.sp,
            color = Color(0xFF9CA3AF),
            textAlign = TextAlign.Center,
            lineHeight = 24.sp
        )

        Spacer(modifier = Modifier.height(32.dp))

        // Search Bar
        OutlinedTextField(
            value = searchQuery,
            onValueChange = { searchQuery = it },
            placeholder = {
                Text(
                    "Search skills...",
                    color = Color(0xFF6B7280)
                )
            },
            leadingIcon = {
                Icon(
                    painter = painterResource(Res.drawable.light_mode),
                    contentDescription = "Search",
                    tint = Color(0xFF6B7280)
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(12.dp)),
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color(0xFF374151),
                unfocusedBorderColor = Color(0xFF374151),
                focusedTextColor = Color.White,
                unfocusedTextColor = Color.White,
                cursorColor = Color(0xFF4A90E2)
            ),
            shape = RoundedCornerShape(12.dp)
        )

        Spacer(modifier = Modifier.height(48.dp))

        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(32.dp)
        ) {
            skills
                .groupBy { it.category }
                .forEach {
                    (category, skillsList) ->

                    if (skillsList.isEmpty()) return@forEach
                    item {
                        SkillSection(
                            title = category.title,
                            icon = category.icon,
                            skills = skillsList,
                            searchQuery = searchQuery
                        )
                    }
                }

        }
    }
}


