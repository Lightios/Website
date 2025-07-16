package pl.michal_cyran.website.core.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import org.jetbrains.compose.resources.StringResource
import pl.michal_cyran.website.achievements.presentation.AchievementsScreen
import pl.michal_cyran.website.education.presentation.EducationScreen
import pl.michal_cyran.website.experience.presentation.ExperienceScreen
import pl.michal_cyran.website.projects.presentation.ProjectDetailsScreen
import pl.michal_cyran.website.projects.presentation.ProjectsScreen
import pl.michal_cyran.website.skills.presentation.SkillsScreen
import pl.michal_cyran.website.social_media.presentation.SocialMediaScreen
import website.composeapp.generated.resources.Res
import website.composeapp.generated.resources.home_screen
import website.composeapp.generated.resources.achievements_screen
import website.composeapp.generated.resources.education_screen
import website.composeapp.generated.resources.experience_screen
import website.composeapp.generated.resources.project_details_screen
import website.composeapp.generated.resources.projects_screen
import website.composeapp.generated.resources.skills_screen
import website.composeapp.generated.resources.social_media_screen


enum class Screen(val title: StringResource) {
    Start(title = Res.string.home_screen),
    Skills(title = Res.string.skills_screen),
    Education(title = Res.string.education_screen),
    Experience(title = Res.string.experience_screen),
    Projects(title = Res.string.projects_screen),
    ProjectsDetails(title = Res.string.project_details_screen),
    Achievements(title = Res.string.achievements_screen),
    SocialMedia(title = Res.string.social_media_screen),
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(
    darkTheme: Boolean,
    onToggleTheme: () -> Unit,
    navController: NavHostController = rememberNavController()
) {
    val scrollState = rememberScrollState()
    var showMenu by remember { mutableStateOf(false) }
    var selectedProjectName by remember { mutableStateOf("") }

    val onSkillsNavigate = { navController.navigate(Screen.Skills.name) }
    val onEducationNavigate = { navController.navigate(Screen.Education.name) }
    val onExperienceNavigate = { navController.navigate(Screen.Experience.name) }
    val onProjectsNavigate = { navController.navigate(Screen.Projects.name) }
    val onAchievementsNavigate = { navController.navigate(Screen.Achievements.name) }
    val onSocialMediaNavigate = { navController.navigate(Screen.SocialMedia.name) }


    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.surface,
                ),
                title = {
                    TopBar(
                        darkTheme = darkTheme,
                        onToggleTheme = onToggleTheme,
                        onHomeNavigate = {
                            navController.navigate(Screen.Start.name) {
                                popUpTo(Screen.Start.name) { inclusive = true }
                            }
                        },
                        onSkillsNavigate = onSkillsNavigate,
                        onEducationNavigate = onEducationNavigate,
                        onExperienceNavigate = onExperienceNavigate,
                        onProjectsNavigate = onProjectsNavigate,
                        onAchievementsNavigate = onAchievementsNavigate,
                        onSocialMediaNavigate = onSocialMediaNavigate,
                    )
                },
                navigationIcon = {
                }
            )
        },
        content = { padding ->
            Column(
                modifier = Modifier
                    .fillMaxWidth(1f)
                    .padding(padding)
                    .verticalScroll(
                        enabled = true,
                        state = scrollState,
                    ),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Top
            ) {
                NavHost(
                    navController = navController,
                    startDestination = Screen.Start.name,
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    composable(Screen.Start.name) {
                        MainScreen(
                            onSkillsNavigate = onSkillsNavigate,
                            onEducationNavigate = onEducationNavigate,
                            onExperienceNavigate = onExperienceNavigate,
                            onProjectsNavigate = onProjectsNavigate,
                            onAchievementsNavigate = onAchievementsNavigate,
                            onSocialMediaNavigate = onSocialMediaNavigate,
                        )
                    }

                    composable(Screen.Skills.name) {
                        SkillsScreen(
                        )
                    }

                    composable(Screen.Education.name) {
                        EducationScreen(
                        )
                    }

                    composable(Screen.Experience.name) {
                        ExperienceScreen(
                        )
                    }
                    composable(Screen.Projects.name) {
                        ProjectsScreen(
                            onProjectClick = { projectName ->
                                selectedProjectName = projectName
                                navController.navigate(Screen.ProjectsDetails.name)
                            }
                        )
                    }

                    composable(Screen.ProjectsDetails.name) {
                        ProjectDetailsScreen(
                            projectName = selectedProjectName,
                            onBackClick = {
                                navController.navigate(Screen.Projects.name) {
                                    popUpTo(Screen.Projects.name) { inclusive = true }
                                }
                            }
                        )
                    }

                    composable(Screen.Achievements.name) {
                        AchievementsScreen(
                        )
                    }
                    composable(Screen.SocialMedia.name) {
                        SocialMediaScreen(
                        )
                    }
                }
            }
        }
    )
}