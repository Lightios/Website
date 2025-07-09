package pl.michal_cyran.website.skills.data

import androidx.compose.ui.graphics.Color
import pl.michal_cyran.website.skills.domain.Skill
import pl.michal_cyran.website.skills.domain.SkillCategory
import pl.michal_cyran.website.skills.domain.SkillLevel
import website.composeapp.generated.resources.Res
import website.composeapp.generated.resources.csharp
import website.composeapp.generated.resources.css
import website.composeapp.generated.resources.en
import website.composeapp.generated.resources.fpdf2
import website.composeapp.generated.resources.html
import website.composeapp.generated.resources.jetpack_compose
import website.composeapp.generated.resources.kivymd
import website.composeapp.generated.resources.kotlin
import website.composeapp.generated.resources.latex_white
import website.composeapp.generated.resources.manim
import website.composeapp.generated.resources.pillow
import website.composeapp.generated.resources.pl
import website.composeapp.generated.resources.python
import website.composeapp.generated.resources.spring_boot

val skills = listOf(
    Skill(
        slug = "python",
        name = "Python",
        level = SkillLevel.ADVANCED,
        category = SkillCategory.PROGRAMMING_LANGUAGES,
        icon = Res.drawable.python
    ),

    Skill(
        slug = "kotlin",
        name = "Kotlin",
        level = SkillLevel.ADVANCED,
        category = SkillCategory.PROGRAMMING_LANGUAGES,
        icon = Res.drawable.kotlin
    ),

    Skill(
        slug = "c#",
        name = "C#",
        level = SkillLevel.COMPETENT,
        category = SkillCategory.PROGRAMMING_LANGUAGES,
        icon = Res.drawable.csharp
    ),

    Skill(
        slug = "latex",
        name = "LaTeX",
        level = SkillLevel.PROFICIENT,
        category = SkillCategory.MARKUP_AND_STYLE,
        icon = Res.drawable.latex_white
    ),

    Skill(
        slug = "html",
        name = "HTML",
        level = SkillLevel.COMPETENT,
        category = SkillCategory.MARKUP_AND_STYLE,
        icon = Res.drawable.html
    ),

    Skill(
        slug = "css",
        name = "CSS",
        level = SkillLevel.COMPETENT,
        category = SkillCategory.MARKUP_AND_STYLE,
        icon = Res.drawable.css
    ),

    Skill(
        slug = "kivy",
        name = "KivyMD",
        level = SkillLevel.PROFICIENT,
        category = SkillCategory.FRAMEWORKS,
        icon = Res.drawable.kivymd
    ),

    Skill(
        slug = "jetpack_compose",
        name = "Jetpack Compose",
        level = SkillLevel.PROFICIENT,
        category = SkillCategory.FRAMEWORKS,
        icon = Res.drawable.jetpack_compose
    ),

    Skill(
        slug = "manim",
        name = "Manim",
        level = SkillLevel.ADVANCED,
        category = SkillCategory.FRAMEWORKS,
        icon = Res.drawable.manim
    ),

    Skill(
        slug = "spring_boot",
        name = "Spring Boot",
        level = SkillLevel.BEGINNER,
        category = SkillCategory.FRAMEWORKS,
        icon = Res.drawable.spring_boot
    ),

    Skill(
        slug = "pillow",
        name = "Pillow",
        level = SkillLevel.COMPETENT,
        category = SkillCategory.TOOLS_AND_LIBRARIES,
        icon = Res.drawable.pillow
    ),

    Skill(
        slug = "fpdf2",
        name = "FPDF2",
        level = SkillLevel.COMPETENT,
        category = SkillCategory.TOOLS_AND_LIBRARIES,
        icon = Res.drawable.fpdf2
    ),

    Skill(
        slug = "polish",
        name = "Polish",
        level = SkillLevel.NATIVE,
        category = SkillCategory.NATURAL_LANGUAGES,
        icon = Res.drawable.pl
    ),

    Skill(
        slug = "english",
        name = "English",
        level = SkillLevel.C1,
        category = SkillCategory.NATURAL_LANGUAGES,
        icon = Res.drawable.en
    )
)

val skillsBySlug = skills.associateBy { it.slug }