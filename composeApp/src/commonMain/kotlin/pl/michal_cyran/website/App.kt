package pl.michal_cyran.website

import androidx.compose.material3.Text
import androidx.compose.runtime.*
import org.jetbrains.compose.resources.stringResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import pl.michal_cyran.website.core.presentation.MainScreen
import pl.michal_cyran.website.ui.theme.AppThemeM3
import website.composeapp.generated.resources.Res
import website.composeapp.generated.resources.app_name

@Composable
@Preview
fun App() {
    var darkTheme by remember { mutableStateOf(true) }
    AppThemeM3(
        darkTheme = darkTheme,
    ) {
        MainScreen(
            darkTheme = darkTheme,
            onToggleTheme = { darkTheme = !darkTheme },
        )
    }
}

