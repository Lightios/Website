package pl.michal_cyran.website.education.domain

import org.jetbrains.compose.resources.StringResource
import website.composeapp.generated.resources.Res
import website.composeapp.generated.resources.ai_and_cognitive_science
import website.composeapp.generated.resources.mathematics
import website.composeapp.generated.resources.other
import website.composeapp.generated.resources.programming_and_software_engineering
import website.composeapp.generated.resources.systems_and_computer_technology

enum class SubjectCategory(
    val displayName: StringResource
) {
    ProgrammingAndSoftwareEngineering(Res.string.programming_and_software_engineering),
    Mathematics(Res.string.mathematics),
    SystemsAndComputerTechnology(Res.string.systems_and_computer_technology),
    AIAndCognitiveScience(Res.string.ai_and_cognitive_science),
    Other(Res.string.other),
}