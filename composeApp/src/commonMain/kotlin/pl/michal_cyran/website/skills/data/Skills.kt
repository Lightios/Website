package pl.michal_cyran.website.skills.data

import androidx.compose.ui.graphics.Color
import pl.michal_cyran.website.skills.domain.Skill
import pl.michal_cyran.website.skills.domain.SkillCategory
import website.composeapp.generated.resources.Res
import website.composeapp.generated.resources.css
import website.composeapp.generated.resources.en
import website.composeapp.generated.resources.fpdf2
import website.composeapp.generated.resources.html
import website.composeapp.generated.resources.jetpack_compose
import website.composeapp.generated.resources.kivy
import website.composeapp.generated.resources.kotlin
import website.composeapp.generated.resources.latex_white
import website.composeapp.generated.resources.manim
import website.composeapp.generated.resources.pillow
import website.composeapp.generated.resources.pl
import website.composeapp.generated.resources.python
import website.composeapp.generated.resources.spring_boot

val skills = listOf(
    Skill(
        name = "Python",
        level = "Advanced",
        color = Color(0xFF4A90E2),
        category = SkillCategory.PROGRAMMING_LANGUAGES,
        icon = Res.drawable.python
    ),

    Skill(
        name = "Kotlin",
        level = "Advanced",
        color = Color(0xFFE94B3C),
        category = SkillCategory.PROGRAMMING_LANGUAGES,
        icon = Res.drawable.kotlin
    ),

//    Skill(
//        name = "C#",
//        level = "Intermediate",
//        color = Color(0xFF7B68EE),
//        category = SkillCategory.PROGRAMMING_LANGUAGES
//    ),

    Skill(
        name = "LaTeX",
        level = "Advanced",
        color = Color(0xFF50E3C2),
        category = SkillCategory.MARKUP_AND_STYLE,
        icon = Res.drawable.latex_white
    ),

    Skill(
        name = "HTML",
        level = "Intermediate",
        color = Color(0xFFFF5722),
        category = SkillCategory.MARKUP_AND_STYLE,
        icon = Res.drawable.html
    ),

    Skill(
        name = "CSS",
        level = "Intermediate",
        color = Color(0xFF7B68EE),
        category = SkillCategory.MARKUP_AND_STYLE,
        icon = Res.drawable.css
    ),

    Skill(
        name = "KivyMD",
        level = "Intermediate",
        color = Color.Cyan,
        category = SkillCategory.FRAMEWORKS,
        icon = Res.drawable.kivy
    ),

    Skill(
        name = "Jetpack Compose",
        level = "Intermediate",
        color = Color.Blue,
        category = SkillCategory.FRAMEWORKS,
        icon = Res.drawable.jetpack_compose
    ),

    Skill(
        name = "Manim",
        level = "Intermediate",
        color = Color.Yellow,
        category = SkillCategory.FRAMEWORKS,
        icon = Res.drawable.manim
    ),

    Skill(
        name = "Spring Boot",
        level = "Beginner",
        color = Color(0xFF4CAF50),
        category = SkillCategory.FRAMEWORKS,
        icon = Res.drawable.spring_boot
    ),

    Skill(
        name = "Pillow",
        level = "Intermediate",
        color = Color(0xFF6A1B9A),
        category = SkillCategory.TOOLS_AND_LIBRARIES,
        icon = Res.drawable.pillow
    ),

    Skill(
        name = "FPDF2",
        level = "Intermediate",
        color = Color(0xFF8E24AA),
        category = SkillCategory.TOOLS_AND_LIBRARIES,
        icon = Res.drawable.fpdf2
    ),

    Skill(
        name = "Polish",
        level = "Native",
        color = Color(0xFFB71C1C),
        category = SkillCategory.NATURAL_LANGUAGES,
        icon = Res.drawable.pl
    ),

    Skill(
        name = "English",
        level = "C1",
        color = Color(0xFF0D47A1),
        category = SkillCategory.NATURAL_LANGUAGES,
        icon = Res.drawable.en
    )
)
