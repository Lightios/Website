package pl.michal_cyran.website.education.data

import androidx.compose.ui.graphics.Color
import pl.michal_cyran.website.education.domain.Education
import pl.michal_cyran.website.education.domain.Subject
import pl.michal_cyran.website.education.domain.SubjectCategory

val education = listOf(
    Education(
        title = "IT Technician",
        institution = "Technical School of Przeworsk",
        duration = "4 years",
        location = "Poland",
        qualification = "Technical education focused on IT systems, programming, and network administration",
        subjects = listOf(
            Subject("Programming", SubjectCategory.ProgrammingAndSoftwareEngineering),
            Subject("Networking", SubjectCategory.SystemsAndComputerTechnology),
            Subject("Hardware Maintenance", SubjectCategory.SystemsAndComputerTechnology),
            Subject("Operating Systems", SubjectCategory.SystemsAndComputerTechnology),
            Subject("Databases", SubjectCategory.SystemsAndComputerTechnology),
            Subject("Web Programming", SubjectCategory.ProgrammingAndSoftwareEngineering),
        ),
        certificates = listOf(
            "Certificate: CCNA Routing and Switching: Introduction to Networks",
            "Certificate: PCAP: Programming Essentials in Python",
            "Certificate: NDG Linux Unhatched",
            "Certificate: Introduction to Cybersecurity",
            "Certificate: Cybersecurity Essentials",
            "Certificate: Be Your Own Boss",
            "Certificate: Get Connected",
            "Certificate: Introduction to the Internet of Everything",
            "Certificate: 3ds Max Animation",
            "Certificate: 3ds Max Visualisation",
            "Certificate: 3ds Max Modeling",
            "Certificate: EU Code Week",
            "Certificate: CPA: Programming Essentials in C++",
        ),
    ),
    Education(
        title = "Bachelor of Computer Science",
        institution = "Jagiellonian University",
        duration = "3 years",
        location = "Poland",
        qualification = "Comprehensive computer science education covering theoretical foundations and practical applications",
        subjects = listOf(
            Subject("Algebra", SubjectCategory.Mathematics),
            Subject("Computer Organization and Architecture", SubjectCategory.SystemsAndComputerTechnology),
            Subject("Programming", SubjectCategory.ProgrammingAndSoftwareEngineering),
            Subject("Logic and Set Theory", SubjectCategory.Mathematics),
            Subject("Mathematical Analysis", SubjectCategory.Mathematics),
            Subject("Programming Methods", SubjectCategory.ProgrammingAndSoftwareEngineering),
            Subject("Operating Systems", SubjectCategory.SystemsAndComputerTechnology),
            Subject("Algorithms and Data Structures", SubjectCategory.ProgrammingAndSoftwareEngineering),
            Subject("Discrete Mathematics", SubjectCategory.Mathematics),
            Subject("Databases", SubjectCategory.SystemsAndComputerTechnology),
            Subject("Software Engineering", SubjectCategory.ProgrammingAndSoftwareEngineering),
            Subject("Probability and Statistics", SubjectCategory.Mathematics),
            Subject("Computer Networks", SubjectCategory.SystemsAndComputerTechnology),
            Subject("Formal Languages and Automata", SubjectCategory.Mathematics),
            Subject("Numerical Methods", SubjectCategory.Mathematics),
            Subject("Functional Programming", SubjectCategory.ProgrammingAndSoftwareEngineering),
            Subject("Android Programming", SubjectCategory.ProgrammingAndSoftwareEngineering),
            Subject("Design Patterns", SubjectCategory.ProgrammingAndSoftwareEngineering),
            Subject("C# Programming", SubjectCategory.ProgrammingAndSoftwareEngineering),
            Subject("Cognitive Systems", SubjectCategory.AIAndCognitiveScience),
            Subject("Cognitive Science", SubjectCategory.AIAndCognitiveScience),
            Subject("Web Programming", SubjectCategory.ProgrammingAndSoftwareEngineering),
            Subject("Fundamentals of AI", SubjectCategory.AIAndCognitiveScience),
            Subject("English", SubjectCategory.Other)
        ),
        certificates = emptyList(),
    )
)