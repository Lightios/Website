package pl.michal_cyran.website.achievements.data

import kotlinx.datetime.LocalDate
import pl.michal_cyran.website.achievements.domain.Achievement
import pl.michal_cyran.website.achievements.domain.AchievementCategory
import pl.michal_cyran.website.achievements.domain.AchievementLevel

val achievements = listOf(
    Achievement(
        name = "1st Place in the Independence Dictation Contest",
        organization = "Zespół Szkół Zawodowych w Przeworsku",
        date = LocalDate(2021, 11, 1),
        category = AchievementCategory.OTHER,
        level = AchievementLevel.NATIONAL,
        isFirstPlace = true
    ),

    Achievement(
        name = "Przeworsk County Scholarship",
        organization = "Starosta Przeworski",
        date = LocalDate(2020, 12, 1),
        category = AchievementCategory.SCHOLARSHIP,
        level = AchievementLevel.REGIONAL
    ),
    Achievement(
        name = "1st Place in the EXPERT Group at the PIX 2019 Contest - National School Programming Championship",
        organization = "eduLAB",
        date = LocalDate(2019, 12, 1),
        category = AchievementCategory.PROGRAMMING,
        level = AchievementLevel.NATIONAL,
        isFirstPlace = true
    ),

    Achievement(
        name = "Qualification to the Semi-Finals of the Polish Edition of the International Pix Programming Challenge",
        organization = "eduLAB",
        date = LocalDate(2019, 12, 13),
        category = AchievementCategory.PROGRAMMING,
        level = AchievementLevel.NATIONAL
    ),

    Achievement(
        name = "Honorable Mention in the National History Contest 'Krag'",
        organization = "Stowarzyszenie Upowszechniania Wiedzy i Kultury Regionalnej 'Pokolenie'",
        date = LocalDate(2019, 12, 1),
        category = AchievementCategory.OTHER,
        level = AchievementLevel.NATIONAL
    ),

    Achievement(
        name = "Przeworsk County Scholarship",
        organization = "Starosta Przeworski",
        date = LocalDate(2019, 12, 1),
        category = AchievementCategory.SCHOLARSHIP,
        level = AchievementLevel.REGIONAL
    ),

    Achievement(
        name = "Przeworsk County Scholarship",
        organization = "Starosta Przeworski",
        date = LocalDate(2018, 11, 18),
        category = AchievementCategory.SCHOLARSHIP,
        level = AchievementLevel.REGIONAL
    ),

    Achievement(
        name = "Honorable Mention in the International Math Contest 'Kangur Matematyczny'",
        organization = "Wydział Matematyki i Informatyki UMK w Toruniu",
        date = LocalDate(2017, 6, 26),
        category = AchievementCategory.MATH,
        level = AchievementLevel.INTERNATIONAL
    ),

    Achievement(
        name = "2nd Place in the 24th Prof. Jan Marszal Mathematics Contest for Middle Schools",
        organization = "I Liceum Ogólnokształcące w im. H. Sienkiewicza w Łańcucie",
        date = LocalDate(2017, 3, 10),
        category = AchievementCategory.MATH,
        level = AchievementLevel.REGIONAL,
    ),

    Achievement(
        name = "1st Place in the School Programming Contest",
        organization = "Zespół Szkół w Markowej",
        date = LocalDate(2017, 6, 12),
        category = AchievementCategory.PROGRAMMING,
        level = AchievementLevel.SCHOOL,
        isFirstPlace = true
    ),

    Achievement(
        name = "Honorable Mention in the 15th District Math Contest 'Procent'",
        organization = "Zespół Szkół im. A. Mickiewicza w Żołyni",
        date = LocalDate(2017, 6, 5),
        category = AchievementCategory.MATH,
        level = AchievementLevel.DISTRICT
    ),

    Achievement(
        name = "1st Place in the School Programming Contest",
        organization = "Zespół Szkół w Markowej",
        date = LocalDate(2016, 6, 12),
        category = AchievementCategory.PROGRAMMING,
        level = AchievementLevel.SCHOOL,
        isFirstPlace = true
    ),

    Achievement(
        name = "1st Place in the 14th District Math Contest for Second-Year Middle School Students",
        organization = "Publiczne Gimnazjum nr 1 w Łańcucie",
        date = LocalDate(2016, 6, 9),
        category = AchievementCategory.MATH,
        level = AchievementLevel.DISTRICT,
        isFirstPlace = true
    ),

    Achievement(
        name = "2nd Place in the School English Contest",
        organization = "Zespół Szkół w Markowej",
        date = LocalDate(2016, 6, 24),
        category = AchievementCategory.OTHER,
        level = AchievementLevel.SCHOOL
    )
)


//{
//        name: '1st Place in the Independence Dictation Contest',
//        organization: 'Zespół Szkół Zawodowych w Przeworsku',
//        date: new Date(2021, 10, 1),
//    },
//
//    {
//        name: 'Przeworsk County Scholarship',
//        organization: 'Starosta Przeworski',
//        date: new Date(2020, 11, 1),
//    },
//    {
//        name: '1st Place in the EXPERT Group at the PIX 2019 Contest - National School Programming Championship',
//        organization: 'eduLAB',
//        date: new Date(2019, 12, 1)
//    },
//
//    {
//        name: 'Qualification to the Semi-Finals of the Polish Edition of the International Pix Programming Challenge',
//        organization: 'eduLAB',
//        date: new Date(2019, 12, 13)
//    },
//    {
//        name: 'Honorable Mention in the National History Contest "Krag"',
//        organization: 'Stowarzyszenie Upowszechniania Wiedzy i Kultury Regionalnej „Pokolenie”',
//        date: new Date(2019, 12, 1)
//    },
//
//    {
//        name: 'Przeworsk County Scholarship',
//        organization: 'Starosta Przeworski',
//        date: new Date(2019, 11, 1),
//    },
//
//    {
//        name: 'Przeworsk County Scholarship',
//        organization: 'Starosta Przeworski',
//        date: new Date(2018, 10, 18),
//    },
//
//    {
//        name: 'Honorable Mention in the International Math Contest "Kangur Matematyczny"',
//        organization: 'Wydział Matematyki i Informatyki UMK w Toruniu',
//        date: new Date(2017, 5, 26),
//    },
//
//    {
//        name: '2nd Place in the 24th Prof. Jan Marszal Mathematics Contest for Middle Schools',
//        organization: 'I Liceum Ogólnokształcące w im. H. Sienkiewicza w Łańcucie',
//        date: new Date(2017, 2, 10)
//    },
//
//    {
//        name: '1st Place in the School Programming Contest',
//        organization: 'Zespół Szkół w Markowej',
//        date: new Date(2017, 5, 12)
//    },
//
//    {
//        name: 'Honorable Mention in the 15th District Math Contest "Procent"',
//        organization: 'Zespół Szkół im. A. Mickiewicza w Żołyni',
//        date: new Date(2017, 6, 5)
//    },
//
//    {
//        name: '1st Place in the School Programming Contest',
//        organization: 'Zespół Szkół w Markowej',
//        date: new Date(2016, 5, 12)
//    },
//
//    {
//        name: '1st Place in the 14th District Math Contest for Second-Year Middle School Students',
//        organization: 'Publiczne Gimnazjum nr 1 w Łańcucie',
//        date: new Date(2016, 6, 9)
//    },
//
//    {
//        name: '2nd Place in the School English Contest',
//        organization: 'Zespół Szkół w Markowej',
//        date: new Date(2016, 6, 24)
//    }