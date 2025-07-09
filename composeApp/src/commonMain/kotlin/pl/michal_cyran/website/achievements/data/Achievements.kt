package pl.michal_cyran.website.achievements.data

import kotlinx.datetime.LocalDate
import pl.michal_cyran.website.achievements.domain.Achievement
import pl.michal_cyran.website.achievements.domain.AchievementCategory
import pl.michal_cyran.website.achievements.domain.AchievementLevel
import website.composeapp.generated.resources.`Honorable Mention in the 15th District Math Contest 'Procent'`
import website.composeapp.generated.resources.`Honorable Mention in the International Math Contest 'Kangur Matematyczny'`
import website.composeapp.generated.resources.`Honorable Mention in the National History Contest 'Krag'`
import website.composeapp.generated.resources.`Przeworsk County Scholarship`
import website.composeapp.generated.resources.`Qualification to the Semi_Finals of the Polish Edition of the International Pix Programming Challenge`
import website.composeapp.generated.resources.Res
import website.composeapp.generated.resources.`_1st Place in the 14th District Math Contest for Second_Year Middle School Students`
import website.composeapp.generated.resources.`_1st Place in the EXPERT Group at the PIX 2019 Contest _ National School Programming Championship`
import website.composeapp.generated.resources.`_1st Place in the Independence Dictation Contest`
import website.composeapp.generated.resources.`_1st Place in the School Programming Contest`
import website.composeapp.generated.resources.`_2nd Place in the 24th Prof Jan Marszal Mathematics Contest for Middle Schools`
import website.composeapp.generated.resources.`_2nd Place in the School English Contest`

val achievements = listOf(
    Achievement(
        name = Res.string.`_1st Place in the Independence Dictation Contest`,
        organization = "Zespół Szkół Zawodowych w Przeworsku",
        date = LocalDate(2021, 11, 1),
        category = AchievementCategory.OTHER,
        level = AchievementLevel.NATIONAL,
        isFirstPlace = true
    ),

    Achievement(
        name = Res.string.`Przeworsk County Scholarship`,
        organization = "Starosta Przeworski",
        date = LocalDate(2020, 12, 1),
        category = AchievementCategory.SCHOLARSHIP,
        level = AchievementLevel.REGIONAL
    ),
    Achievement(
        name = Res.string.`_1st Place in the EXPERT Group at the PIX 2019 Contest _ National School Programming Championship`,
        organization = "eduLAB",
        date = LocalDate(2019, 12, 1),
        category = AchievementCategory.PROGRAMMING,
        level = AchievementLevel.NATIONAL,
        isFirstPlace = true
    ),

    Achievement(
        name = Res.string.`Qualification to the Semi_Finals of the Polish Edition of the International Pix Programming Challenge`,
        organization = "eduLAB",
        date = LocalDate(2019, 12, 13),
        category = AchievementCategory.PROGRAMMING,
        level = AchievementLevel.NATIONAL
    ),

    Achievement(
        name = Res.string.`Honorable Mention in the National History Contest 'Krag'`,
        organization = "Stowarzyszenie Upowszechniania Wiedzy i Kultury Regionalnej 'Pokolenie'",
        date = LocalDate(2019, 12, 1),
        category = AchievementCategory.OTHER,
        level = AchievementLevel.NATIONAL
    ),

    Achievement(
        name = Res.string.`Przeworsk County Scholarship`,
        organization = "Starosta Przeworski",
        date = LocalDate(2019, 12, 1),
        category = AchievementCategory.SCHOLARSHIP,
        level = AchievementLevel.REGIONAL
    ),

    Achievement(
        name = Res.string.`Przeworsk County Scholarship`,
        organization = "Starosta Przeworski",
        date = LocalDate(2018, 11, 18),
        category = AchievementCategory.SCHOLARSHIP,
        level = AchievementLevel.REGIONAL
    ),

    Achievement(
        name = Res.string.`Honorable Mention in the International Math Contest 'Kangur Matematyczny'`,
        organization = "Wydział Matematyki i Informatyki UMK w Toruniu",
        date = LocalDate(2017, 6, 26),
        category = AchievementCategory.MATH,
        level = AchievementLevel.INTERNATIONAL
    ),

    Achievement(
        name = Res.string.`_2nd Place in the 24th Prof Jan Marszal Mathematics Contest for Middle Schools`,
        organization = "I Liceum Ogólnokształcące w im. H. Sienkiewicza w Łańcucie",
        date = LocalDate(2017, 3, 10),
        category = AchievementCategory.MATH,
        level = AchievementLevel.REGIONAL,
    ),

    Achievement(
        name = Res.string.`_1st Place in the School Programming Contest`,
        organization = "Zespół Szkół w Markowej",
        date = LocalDate(2017, 6, 12),
        category = AchievementCategory.PROGRAMMING,
        level = AchievementLevel.SCHOOL,
        isFirstPlace = true
    ),

    Achievement(
        name = Res.string.`Honorable Mention in the 15th District Math Contest 'Procent'`,
        organization = "Zespół Szkół im. A. Mickiewicza w Żołyni",
        date = LocalDate(2017, 6, 5),
        category = AchievementCategory.MATH,
        level = AchievementLevel.DISTRICT
    ),

    Achievement(
        name = Res.string.`_1st Place in the School Programming Contest`,
        organization = "Zespół Szkół w Markowej",
        date = LocalDate(2016, 6, 12),
        category = AchievementCategory.PROGRAMMING,
        level = AchievementLevel.SCHOOL,
        isFirstPlace = true
    ),

    Achievement(
        name = Res.string.`_1st Place in the 14th District Math Contest for Second_Year Middle School Students`,
        organization = "Publiczne Gimnazjum nr 1 w Łańcucie",
        date = LocalDate(2016, 6, 9),
        category = AchievementCategory.MATH,
        level = AchievementLevel.DISTRICT,
        isFirstPlace = true
    ),

    Achievement(
        name = Res.string.`_2nd Place in the School English Contest`,
        organization = "Zespół Szkół w Markowej",
        date = LocalDate(2016, 6, 24),
        category = AchievementCategory.OTHER,
        level = AchievementLevel.SCHOOL
    )
)

