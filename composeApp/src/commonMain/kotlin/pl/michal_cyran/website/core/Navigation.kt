package pl.michal_cyran.website.core

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.rememberLazyListState
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
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import org.jetbrains.compose.resources.StringResource
import pl.michal_cyran.website.education.presentation.EducationScreen
import website.composeapp.generated.resources.Res
import website.composeapp.generated.resources.app_name
import website.composeapp.generated.resources.choose_flavor
import website.composeapp.generated.resources.choose_pickup_date
import website.composeapp.generated.resources.education
import website.composeapp.generated.resources.order_summary


enum class Screen(val title: StringResource) {
    Start(title = Res.string.app_name),
    Flavor(title = Res.string.choose_flavor),
    Pickup(title = Res.string.choose_pickup_date),
    Summary(title = Res.string.order_summary),
    Education(title = Res.string.education),
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(
    darkTheme: Boolean,
    onToggleTheme: () -> Unit,
    navController: NavHostController = rememberNavController()
) {
    val listState = rememberLazyListState()
    var showMenu by remember { mutableStateOf(false) }

    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.surface,
                ),
                title = {
                    TopBar(
                        darkTheme = darkTheme,
                        listState = listState,
                        onToggleTheme = onToggleTheme
                    )
                },
                navigationIcon = {
                }
            )
        },
        content = { padding ->
            Column(
                modifier = Modifier.fillMaxWidth(1f).padding(padding),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                NavHost(
                    navController = navController,
                    startDestination = Screen.Start.name,
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    composable(Screen.Start.name) {
                        MainScreen(
                            onEducationNavigate = { navController.navigate("education") },
                        )
                    }

                    composable(Screen.Education.name) {
                        EducationScreen(
                        )
                    }
                }
            }
        }
    )
}