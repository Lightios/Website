package pl.michal_cyran.website

import androidx.compose.runtime.*
import org.jetbrains.compose.ui.tooling.preview.Preview
import pl.michal_cyran.website.core.presentation.MainScreen
import pl.michal_cyran.website.ui.theme.AppThemeM3

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