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
import website.composeapp.generated.resources.globe
import website.composeapp.generated.resources.master_system
import website.composeapp.generated.resources.projects_binary_clock_description
import website.composeapp.generated.resources.projects_binary_clock_shortDescription
import website.composeapp.generated.resources.projects_crypto_tracker_description
import website.composeapp.generated.resources.projects_crypto_tracker_shortDescription
import website.composeapp.generated.resources.projects_daymath_description
import website.composeapp.generated.resources.projects_daymath_shortDescription
import website.composeapp.generated.resources.projects_demiurg_description
import website.composeapp.generated.resources.projects_demiurg_shortDescription
import website.composeapp.generated.resources.projects_generator_tabliczek_description
import website.composeapp.generated.resources.projects_generator_tabliczek_shortDescription
import website.composeapp.generated.resources.projects_master_system_description
import website.composeapp.generated.resources.projects_master_system_shortDescription
import website.composeapp.generated.resources.projects_mobile_remote_description
import website.composeapp.generated.resources.projects_mobile_remote_shortDescription
import website.composeapp.generated.resources.projects_movie_ai_description
import website.composeapp.generated.resources.projects_movie_ai_shortDescription
import website.composeapp.generated.resources.projects_scheduler_description
import website.composeapp.generated.resources.projects_scheduler_shortDescription
import website.composeapp.generated.resources.projects_screenshot_processor_description
import website.composeapp.generated.resources.projects_screenshot_processor_shortDescription
import website.composeapp.generated.resources.projects_subtitles_shifter_description
import website.composeapp.generated.resources.projects_subtitles_shifter_shortDescription
import website.composeapp.generated.resources.projects_tic_tac_toe_description
import website.composeapp.generated.resources.projects_tic_tac_toe_shortDescription
import website.composeapp.generated.resources.projects_todo_list_description
import website.composeapp.generated.resources.projects_todo_list_shortDescription
import website.composeapp.generated.resources.projects_tutor_website_description
import website.composeapp.generated.resources.projects_tutor_website_shortDescription
import website.composeapp.generated.resources.projects_vl_description
import website.composeapp.generated.resources.projects_vl_shortDescription
import website.composeapp.generated.resources.projects_website_description
import website.composeapp.generated.resources.projects_website_shortDescription
import website.composeapp.generated.resources.projects_youtube_downloader_description
import website.composeapp.generated.resources.projects_youtube_downloader_shortDescription
import website.composeapp.generated.resources.recommendation
import website.composeapp.generated.resources.scheduler
import website.composeapp.generated.resources.ss_binary_clock
import website.composeapp.generated.resources.subtitles_shifter
import website.composeapp.generated.resources.tic_tac_toe
import website.composeapp.generated.resources.valorant_lineups
import website.composeapp.generated.resources.youtube_downloader

val projects = listOf(
    Project(
        name = "Master System",
        description = Res.string.projects_master_system_description,
        shortDescription = Res.string.projects_master_system_shortDescription,
        logo = Res.drawable.master_system,
        skills = listOf("python", "kivy", "pillow", "fpdf2"),
        type = ProjectType.DESKTOP_APPLICATION,
        links = listOf(),
        category = ProjectCategory.COMMERCIAL,
        screenshots = masterSystemScreenshots,
    ),
    Project(
        name = "Valorant Lineups",
        description = Res.string.projects_vl_description,
        shortDescription = Res.string.projects_vl_shortDescription,
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
        screenshots = valorantLineupsScreenshots,
    ),
    Project(
        name = "DayMath",
        description = Res.string.projects_daymath_description,
        shortDescription = Res.string.projects_daymath_shortDescription,
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
        screenshots = daymathScreenshots
    ),
    Project(
        name = "Demiurg",
        description = Res.string.projects_demiurg_description,
        shortDescription = Res.string.projects_demiurg_shortDescription,
        logo = Res.drawable.demiurg,
        skills = listOf("python", "kivy"),
        type = ProjectType.DESKTOP_APPLICATION,
        links = listOf(
            ProjectLink(
                to = "https://github.com/Lightios/Demiurg_Creator",
                type = ProjectLinkType.GITHUB,
            ),
            ProjectLink(
                to = "https://github.com/ushka1/project-demiurg",
                type = ProjectLinkType.GITHUB,
            )
        ),
        category = ProjectCategory.ACADEMIC,
        screenshots = demiurgScreenshots,
    ),
    Project(
        name = "Movie Recommendation System",
        description = Res.string.projects_movie_ai_description,
        shortDescription = Res.string.projects_movie_ai_shortDescription,
        logo = Res.drawable.recommendation,
        skills = listOf("python", "kivy"),
        type = ProjectType.DESKTOP_APPLICATION,
        links = listOf(
            ProjectLink(
                to = "https://github.com/Lightios/MovieRecommendationSystem",
                type = ProjectLinkType.GITHUB,
            ),
        ),
        category = ProjectCategory.ACADEMIC,
    ),
    Project(
        name = "Generator tabliczek",
        description = Res.string.projects_generator_tabliczek_description,
        shortDescription = Res.string.projects_generator_tabliczek_shortDescription,
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
        screenshots = generatorTabliczekScreenshots
    ),
    Project(
        name = "Scheduler",
        description = Res.string.projects_scheduler_description,
        shortDescription = Res.string.projects_scheduler_shortDescription,
        logo = Res.drawable.scheduler,
        skills = listOf("python", "pillow"),
        type = ProjectType.OTHER,
        links = listOf(
            ProjectLink(
                to = "https://github.com/Lightios/Scheduler",
                type = ProjectLinkType.GITHUB,
            ),
        ),
        category = ProjectCategory.TOOLS,
        screenshots = schedulerScreenshots,
    ),
    Project(
        name = "Binary Clock",
        description = Res.string.projects_binary_clock_description,
        shortDescription = Res.string.projects_binary_clock_shortDescription,
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
                resource = Res.drawable.ss_binary_clock,
                label = "Preview"
            )
        )
    ),

    Project(
        name = "Subtitles Shifter",
        description = Res.string.projects_subtitles_shifter_description,
        shortDescription = Res.string.projects_subtitles_shifter_shortDescription,
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
        description = Res.string.projects_youtube_downloader_description,
        shortDescription = Res.string.projects_youtube_downloader_shortDescription,
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
        description = Res.string.projects_tic_tac_toe_description,
        shortDescription = Res.string.projects_tic_tac_toe_shortDescription,
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
        description = Res.string.projects_crypto_tracker_description,
        shortDescription = Res.string.projects_crypto_tracker_shortDescription,
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
    ),
    Project(
        name = "Tutor Website",
        description = Res.string.projects_tutor_website_description,
        shortDescription = Res.string.projects_tutor_website_shortDescription,
        logo = Res.drawable.globe,
        skills = listOf("kotlin", "jetpack_compose"),
        type = ProjectType.WEB_APPLICATION,
        links = listOf(
            ProjectLink(
                to = "https://lightios.github.io/TutorWebsite/",
                type = ProjectLinkType.WEBSITE,
            ),
            ProjectLink(
                to = "https://github.com/Lightios/TutorWebsiteCode",
                type = ProjectLinkType.GITHUB,
            )
        ),
        category = ProjectCategory.PERSONAL,
        screenshots = emptyList()
    ),
    Project(
        name = "Mobile Remote",
        description = Res.string.projects_mobile_remote_description,
        shortDescription = Res.string.projects_mobile_remote_shortDescription,
        logo = Res.drawable.globe,
        skills = listOf("kotlin", "jetpack_compose", "spring_boot"),
        type = ProjectType.OTHER,
        links = listOf(
            ProjectLink(
                to = "https://github.com/Lightios/MobileRemoteClient",
                type = ProjectLinkType.GITHUB,
            ),
            ProjectLink(
                to = "https://github.com/Lightios/MobileRemoteServer",
                type = ProjectLinkType.GITHUB,
            ),
        ),
        category = ProjectCategory.PERSONAL,
        screenshots = emptyList()
    ),
    Project(
        name = "To Do List",
        description = Res.string.projects_todo_list_description,
        shortDescription = Res.string.projects_todo_list_shortDescription,
        logo = Res.drawable.globe,
        skills = listOf("kotlin", "jetpack_compose"),
        type = ProjectType.MOBILE_APPLICATION,
        links = listOf(
            ProjectLink(
                to = "https://github.com/Lightios/ToDoList",
                type = ProjectLinkType.GITHUB,
            ),
        ),
        category = ProjectCategory.PRACTICE,
        screenshots = emptyList()
    ),
    Project(
        name = "Screenshot Processor",
        description = Res.string.projects_screenshot_processor_description,
        shortDescription = Res.string.projects_screenshot_processor_shortDescription,
        logo = Res.drawable.globe,
        skills = listOf("kotlin", "jetpack_compose"),
        type = ProjectType.DESKTOP_APPLICATION,
        links = listOf(
            ProjectLink(
                to = "https://github.com/Lightios/ScreenshotProcessor",
                type = ProjectLinkType.GITHUB,
            ),
        ),
        category = ProjectCategory.TOOLS,
        screenshots = emptyList()
    ),
    Project(
        name = "Portfolio",
        description = Res.string.projects_website_description,
        shortDescription = Res.string.projects_website_shortDescription,
        logo = Res.drawable.globe,
        skills = listOf("kotlin", "jetpack_compose"),
        type = ProjectType.WEB_APPLICATION,
        links = listOf(
            ProjectLink(
                to = "https://github.com/Lightios/Website",
                type = ProjectLinkType.GITHUB,
            ),
        ),
        category = ProjectCategory.PERSONAL,
        screenshots = emptyList()
    )
)
