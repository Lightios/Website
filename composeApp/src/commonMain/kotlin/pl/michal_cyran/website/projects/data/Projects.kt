package pl.michal_cyran.website.projects.data

import pl.michal_cyran.website.projects.domain.Project
import pl.michal_cyran.website.projects.domain.ProjectCategory
import pl.michal_cyran.website.projects.domain.ProjectLink
import pl.michal_cyran.website.projects.domain.ProjectLinkType
import pl.michal_cyran.website.projects.domain.ProjectType
import pl.michal_cyran.website.projects.domain.Screenshot
import website.composeapp.generated.resources.Res
import website.composeapp.generated.resources.binary_clock
import website.composeapp.generated.resources.daymath
import website.composeapp.generated.resources.demiurg
import website.composeapp.generated.resources.generator_tabliczek
import website.composeapp.generated.resources.master_system
import website.composeapp.generated.resources.recommendation
import website.composeapp.generated.resources.scheduler
import website.composeapp.generated.resources.subtitles_shifter
import website.composeapp.generated.resources.tic_tac_toe
import website.composeapp.generated.resources.valorant_lineups
import website.composeapp.generated.resources.youtube_downloader

val projects = listOf(
    Project(
        name = "Master System",
        description = "projects.master-system.description",
        shortDescription = "projects.master-system.shortDescription",
        logo = Res.drawable.master_system,
        skills = listOf("python", "kivy", "pillow", "fpdf2"),
        type = ProjectType.DESKTOP_APPLICATION,
        links = listOf(),
        category = ProjectCategory.COMMERCIAL,
        screenshots = listOf(
            Screenshot(
                label = "Main screen",
                url = "https://github.com/Lightios/Lightios.github.io/blob/main/static/screenshots/master_system/1.png?raw=true"
            ),
            Screenshot(
                label = "Contact",
				url = "https://github.com/Lightios/Lightios.github.io/blob/main/static/screenshots/master_system/2.png?raw=true"
            ),
            Screenshot(
                label = "Tournament screen - 8 teams version",
                url = "https://github.com/Lightios/Lightios.github.io/blob/main/static/screenshots/master_system/3.png?raw=true"
            ),
            Screenshot(
                label = "Tournament screen - 16 teams version",
                url = "https://github.com/Lightios/Lightios.github.io/blob/main/static/screenshots/master_system/4.png?raw=true"
            ),
            Screenshot(
                label = "Graph zoom",
                url = "https://github.com/Lightios/Lightios.github.io/blob/main/static/screenshots/master_system/5.png?raw=true"
            ),
            Screenshot(
                label = "PDF preview",
                url = "https://github.com/Lightios/Lightios.github.io/blob/main/static/screenshots/master_system/6.png?raw=true"
            ),
        )
    ),
    Project(
        name = "Valorant Lineups",
        description = "projects.valorant-lineups.description",
        shortDescription = "projects.valorant-lineups.shortDescription",
        logo = Res.drawable.valorant_lineups,
        skills = listOf("python", "kivy", "kotlin", "jetpack_compose"),
        type = ProjectType.MOBILE_APPLICATION,
        links = listOf(
            ProjectLink(
                to = "https://play.google.com/store/apps/details?id=pl.ppistudio.valorantlineups.ppistudio.valorantlineups&hl=pl/",
                type = ProjectLinkType.GOOGLE_PLAY,
            )
        ),
        category = ProjectCategory.COMMERCIAL,
        screenshots = emptyList()
    ),
    Project(
        name = "DayMath",
        description = "projects.daymath.description",
        shortDescription = "projects.daymath.shortDescription",
        logo = Res.drawable.daymath,
        skills = listOf("kotlin", "jetpack_compose", "python", "manim", "latex"),
        type = ProjectType.MOBILE_APPLICATION,
        links = listOf(
            ProjectLink(
                to = "https://play.google.com/store/apps/details?id=pl.ppistudio.daymath&hl=pl/",
                type = ProjectLinkType.GOOGLE_PLAY,
            )
        ),
        category = ProjectCategory.COMMERCIAL,
        screenshots = emptyList()
    ),
    Project(
        name = "Demiurg",
        description = "projects.demiurg.description",
        shortDescription = "projects.demiurg.shortDescription",
        logo = Res.drawable.demiurg,
        skills = listOf("python", "kivy"),
        type = ProjectType.DESKTOP_APPLICATION,
        links = listOf(
            ProjectLink(
                to = "",
                type = ProjectLinkType.GITHUB,
            ),
            ProjectLink(
                to = "",
                type = ProjectLinkType.GITHUB,
            )
        ),
        category = ProjectCategory.ACADEMIC,
        screenshots = listOf(
            Screenshot(
                label = "Project selection",
                url = "",
            ),
        ),
    ),
    Project(
        name = "Movie Recommendation System",
        description = "projects.movie-ai.description",
        shortDescription = "projects.movie-ai.shortDescription",
        logo = Res.drawable.recommendation,
        skills = listOf("python", "kivy"),
        type = ProjectType.DESKTOP_APPLICATION,
        links = listOf(
            ProjectLink(
                to = "",
                type = ProjectLinkType.GITHUB,
            ),
        ),
        category = ProjectCategory.ACADEMIC,
        screenshots = emptyList()
    ),
    Project(
        name = "Generator tabliczek",
        description = "projects.generator-tabliczek.description",
        shortDescription = "projects.generator-tabliczek.shortDescription",
        logo = Res.drawable.generator_tabliczek,
        skills = listOf("c#"),
        type = ProjectType.DESKTOP_APPLICATION,
        links = listOf(
            ProjectLink(
                to = "https://github.com/Lightios/WPFProject",
                type = ProjectLinkType.GITHUB,
            ),
        ),
        category = ProjectCategory.ACADEMIC,
        screenshots = listOf(
            Screenshot(
                label = "Główne okno",
                url = "https://github.com/Lightios/Lightios.github.io/blob/main/static/screenshots/generator_tabliczek/1.png?raw=true",
            ),
            Screenshot(
                label = "Parametry napisu",
                url = "https://github.com/Lightios/Lightios.github.io/blob/main/static/screenshots/generator_tabliczek/2.png?raw=true"
            ),
            Screenshot(
                label = "Wybór kolorów",
				url = "https://github.com/Lightios/Lightios.github.io/blob/main/static/screenshots/generator_tabliczek/3.png?raw=true"
            ),
			Screenshot(
				label = "Eksport do PDF",
				url = "https://github.com/Lightios/Lightios.github.io/blob/main/static/screenshots/generator_tabliczek/4.png?raw=true"
            ),
        ),
    ),
    Project(
        name = "Scheduler",
        description = "projects.scheduler.description",
        shortDescription = "projects.scheduler.shortDescription",
        logo = Res.drawable.scheduler,
        skills = listOf("python", "pillow"),
        type = ProjectType.OTHER,
        links = listOf(
            ProjectLink(
                to = "https://github.com/Lightios/Scheduler",
                type = ProjectLinkType.GITHUB,
            ),
        ),
        screenshots = listOf(
            Screenshot(
                label = "Example result 1",
                url = "https://github.com/Lightios/Lightios.github.io/blob/main/static/screenshots/scheduler/1.png?raw=true",
            ),
            Screenshot(
                label = "Example result 2",
                url = "https://github.com/Lightios/Lightios.github.io/blob/main/static/screenshots/scheduler/2.png?raw=true",
            ),
            Screenshot(
                label = "Data scheme",
                url = "https://github.com/Lightios/Lightios.github.io/blob/main/static/screenshots/scheduler/5.png?raw=true",
            ),
            Screenshot(
                label = "Parameters",
                url = "https://github.com/Lightios/Lightios.github.io/blob/main/static/screenshots/scheduler/3.png?raw=true",
            ),
            Screenshot(
                label = "Discord integration",
                url = "https://github.com/Lightios/Lightios.github.io/blob/main/static/screenshots/scheduler/4.png?raw=true"
            )
        ),
        category = ProjectCategory.TOOLS,
    ),
    Project(
        name = "Binary Clock",
        description = "projects.binary-clock.description",
        shortDescription = "projects.binary-clock.shortDescription",
        logo = Res.drawable.binary_clock,
        skills = listOf("kotlin", "jetpack_compose"),
        type = ProjectType.MULTIPLATFORM_APPLICATION,
        links = listOf(
            ProjectLink(
                to = "https://github.com/Lightios/BinaryClock",
                type = ProjectLinkType.GITHUB,
            ),
        ),
        category = ProjectCategory.PRACTICE,
        screenshots = listOf(
            Screenshot(
                label = "Result",
                url = "https://github.com/Lightios/Lightios.github.io/blob/main/static/screenshots/binary_clock/1.png?raw=true",
            )
        ),
    ),

    Project(
        name = "Subtitles Shifter",
        description = "projects.subtitles-shifter.description",
        shortDescription = "projects.subtitles-shifter.shortDescription",
        logo = Res.drawable.subtitles_shifter,
        skills = listOf("python"),
        type = ProjectType.CONSOLE,
        links = listOf(
            ProjectLink(
                to = "https://github.com/Lightios/SubtitlesShifter",
                type = ProjectLinkType.GITHUB,
            ),
        ),
        category = ProjectCategory.TOOLS,
        screenshots = emptyList()
    ),
    Project(
        name = "Subtitles Shifter",
        description = "projects.subtitles-shifter.description",
        shortDescription = "projects.subtitles-shifter.shortDescription",
        logo = Res.drawable.subtitles_shifter,
        skills = listOf("python"),
        type = ProjectType.CONSOLE,
        links = listOf(
            ProjectLink(
                to = "https://github.com/Lightios/SubtitlesShifter",
                type = ProjectLinkType.GITHUB,
            ),
        ),
        category = ProjectCategory.TOOLS,
        screenshots = emptyList()
    ),

    Project(
        name = "YouTube Downloader",
        description = "projects.youtube-downloader.description",
        shortDescription = "projects.youtube-downloader.shortDescription",
        logo = Res.drawable.youtube_downloader,
        skills = listOf("python"),
        type = ProjectType.CONSOLE,
        links = listOf(
            ProjectLink(
                to = "https://github.com/Lightios/YouTubeDownloader",
                type = ProjectLinkType.GITHUB,
            ),
        ),
        category = ProjectCategory.TOOLS,
        screenshots = emptyList()
    ),

    Project(
        name = "Tic Tac Toe Cog",
        description = "projects.tic-tac-toe.description",
        shortDescription = "projects.tic-tac-toe.shortDescription",
        logo = Res.drawable.tic_tac_toe,
        skills = listOf("python"),
        type = ProjectType.OTHER,
        links = listOf(
            ProjectLink(
                to = "https://github.com/Lightios/DiscordBot-TicTacToeCog",
                type = ProjectLinkType.GITHUB,
            ),
        ),
        category = ProjectCategory.PRACTICE,
        screenshots = emptyList()
    ),

    Project(
        name = "Crypto Tracker",
        description = "projects.crypto-tracker.description",
        shortDescription = "projects.crypto-tracker.shortDescription",
        logo = Res.drawable.tic_tac_toe,
        skills = listOf("kotlin", "jetpack_compose"),
        type = ProjectType.MOBILE_APPLICATION,
        links = listOf(
            ProjectLink(
                to = "https://github.com/Lightios/CryptoTracker",
                type = ProjectLinkType.GITHUB,
            ),
        ),
        category = ProjectCategory.PRACTICE,
        screenshots = emptyList()
    )
)
