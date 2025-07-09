package pl.michal_cyran.website.education.data

import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.graphics.Color
import kotlinx.datetime.LocalDate
import pl.michal_cyran.website.education.domain.Education
import pl.michal_cyran.website.education.domain.Subject
import pl.michal_cyran.website.education.domain.SubjectCategory
import website.composeapp.generated.resources.Algebra
import website.composeapp.generated.resources.`Algorithms and Data Structures`
import website.composeapp.generated.resources.`Android Programming`
import website.composeapp.generated.resources.`C# Programming`
import website.composeapp.generated.resources.`Certificate 3ds Max Animation`
import website.composeapp.generated.resources.`Certificate 3ds Max Modeling`
import website.composeapp.generated.resources.`Certificate 3ds Max Visualisation`
import website.composeapp.generated.resources.`Certificate Be Your Own Boss`
import website.composeapp.generated.resources.`Certificate CCNA Routing and Switching Introduction to Networks`
import website.composeapp.generated.resources.`Certificate CPA Programming Essentials in C++`
import website.composeapp.generated.resources.`Certificate Cybersecurity Essentials`
import website.composeapp.generated.resources.`Certificate EU Code Week`
import website.composeapp.generated.resources.`Certificate Get Connected`
import website.composeapp.generated.resources.`Certificate Introduction to Cybersecurity`
import website.composeapp.generated.resources.`Certificate Introduction to the Internet of Everything`
import website.composeapp.generated.resources.`Certificate NDG Linux Unhatched`
import website.composeapp.generated.resources.`Certificate PCAP Programming Essentials in Python`
import website.composeapp.generated.resources.`Cognitive Science`
import website.composeapp.generated.resources.`Cognitive Systems`
import website.composeapp.generated.resources.`Computer Organization and Architecture`
import website.composeapp.generated.resources.Databases
import website.composeapp.generated.resources.`Design Patterns`
import website.composeapp.generated.resources.`Discrete Mathematics`
import website.composeapp.generated.resources.English
import website.composeapp.generated.resources.`Formal Languages and Automata`
import website.composeapp.generated.resources.`Functional Programming`
import website.composeapp.generated.resources.`Fundamentals of AI`
import website.composeapp.generated.resources.`Hardware Maintenance`
import website.composeapp.generated.resources.`Logic and Set Theory`
import website.composeapp.generated.resources.`Mathematical Analysis`
import website.composeapp.generated.resources.Networking
import website.composeapp.generated.resources.`Numerical Methods`
import website.composeapp.generated.resources.`Operating Systems`
import website.composeapp.generated.resources.Poland
import website.composeapp.generated.resources.`Probability and Statistics`
import website.composeapp.generated.resources.Programming
import website.composeapp.generated.resources.`Programming Methods`
import website.composeapp.generated.resources.Res
import website.composeapp.generated.resources.`Software Engineering`
import website.composeapp.generated.resources.`Web Programming`
import website.composeapp.generated.resources.education_uj_degree
import website.composeapp.generated.resources.education_uj_organization
import website.composeapp.generated.resources.education_zsz_degree
import website.composeapp.generated.resources.education_zsz_organization
import website.composeapp.generated.resources.uj
import website.composeapp.generated.resources.zsz

val education = listOf(
    Education(
        title = Res.string.education_zsz_degree,
        institution = Res.string.education_zsz_organization,
        location = Res.string.Poland,
        subjects = listOf(
            Subject(Res.string.Programming, SubjectCategory.ProgrammingAndSoftwareEngineering),
            Subject(Res.string.Networking, SubjectCategory.SystemsAndComputerTechnology),
            Subject(Res.string.`Hardware Maintenance`, SubjectCategory.SystemsAndComputerTechnology),
            Subject(Res.string.`Operating Systems`, SubjectCategory.SystemsAndComputerTechnology),
            Subject(Res.string.Databases, SubjectCategory.SystemsAndComputerTechnology),
            Subject(Res.string.`Web Programming`, SubjectCategory.ProgrammingAndSoftwareEngineering),
        ),
        certificates = listOf(
            Res.string.`Certificate CCNA Routing and Switching Introduction to Networks`,
            Res.string.`Certificate PCAP Programming Essentials in Python`,
            Res.string.`Certificate CPA Programming Essentials in C++`,
            Res.string.`Certificate NDG Linux Unhatched`,
            Res.string.`Certificate Introduction to Cybersecurity`,
            Res.string.`Certificate Cybersecurity Essentials`,
            Res.string.`Certificate Be Your Own Boss`,
            Res.string.`Certificate Get Connected`,
            Res.string.`Certificate Introduction to the Internet of Everything`,
            Res.string.`Certificate 3ds Max Animation`,
            Res.string.`Certificate 3ds Max Visualisation`,
            Res.string.`Certificate 3ds Max Modeling`,
            Res.string.`Certificate EU Code Week`,
        ),
        icon = Res.drawable.zsz,
        startDate = LocalDate(2017, 9, 1),
        endDate = LocalDate(2021, 6, 30)
    ),
    Education(
        title = Res.string.education_uj_degree,
        institution = Res.string.education_uj_organization,
        location = Res.string.Poland,
        subjects = listOf(
            Subject(Res.string.Algebra, SubjectCategory.Mathematics),
            Subject(Res.string.`Computer Organization and Architecture`, SubjectCategory.SystemsAndComputerTechnology),
            Subject(Res.string.Programming, SubjectCategory.ProgrammingAndSoftwareEngineering),
            Subject(Res.string.`Logic and Set Theory`, SubjectCategory.Mathematics),
            Subject(Res.string.`Mathematical Analysis`, SubjectCategory.Mathematics),
            Subject(Res.string.`Programming Methods`, SubjectCategory.ProgrammingAndSoftwareEngineering),
            Subject(Res.string.`Operating Systems`, SubjectCategory.SystemsAndComputerTechnology),
            Subject(Res.string.`Algorithms and Data Structures`, SubjectCategory.ProgrammingAndSoftwareEngineering),
            Subject(Res.string.`Discrete Mathematics`, SubjectCategory.Mathematics),
            Subject(Res.string.Databases, SubjectCategory.SystemsAndComputerTechnology),
            Subject(Res.string.`Software Engineering`, SubjectCategory.ProgrammingAndSoftwareEngineering),
            Subject(Res.string.`Probability and Statistics`, SubjectCategory.Mathematics),
            Subject(Res.string.Networking, SubjectCategory.SystemsAndComputerTechnology),
            Subject(Res.string.`Formal Languages and Automata`, SubjectCategory.Mathematics),
            Subject(Res.string.`Numerical Methods`, SubjectCategory.Mathematics),
            Subject(Res.string.`Functional Programming`, SubjectCategory.ProgrammingAndSoftwareEngineering),
            Subject(Res.string.`Android Programming`, SubjectCategory.ProgrammingAndSoftwareEngineering),
            Subject(Res.string.`Design Patterns`, SubjectCategory.ProgrammingAndSoftwareEngineering),
            Subject(Res.string.`C# Programming`, SubjectCategory.ProgrammingAndSoftwareEngineering),
            Subject(Res.string.`Cognitive Systems`, SubjectCategory.AIAndCognitiveScience),
            Subject(Res.string.`Cognitive Science`, SubjectCategory.AIAndCognitiveScience),
            Subject(Res.string.`Web Programming`, SubjectCategory.ProgrammingAndSoftwareEngineering),
            Subject(Res.string.`Fundamentals of AI`, SubjectCategory.AIAndCognitiveScience),
            Subject(Res.string.English, SubjectCategory.Other)
        ),

        certificates = emptyList(),
        icon = Res.drawable.uj,
        startDate = LocalDate(2021, 10, 1),
        endDate = LocalDate(2024, 6, 30),
    )
)