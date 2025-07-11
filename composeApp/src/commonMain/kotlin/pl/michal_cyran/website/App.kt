package pl.michal_cyran.website

import androidx.compose.foundation.Image
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import coil3.compose.AsyncImage
import coil3.compose.SubcomposeAsyncImage
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import pl.michal_cyran.website.core.presentation.MainScreen
import pl.michal_cyran.website.ui.theme.AppThemeM3
import website.composeapp.generated.resources.Res
import website.composeapp.generated.resources.app_name
import website.composeapp.generated.resources.screenshots

@Composable
@Preview
fun App() {
    var darkTheme by remember { mutableStateOf(true) }
    AppThemeM3(
        darkTheme = darkTheme,
    ) {
//        SubcomposeAsyncImage(
//            model = Res.getUri("drawable/android.png"),
//            contentDescription = null,
//            onError = {
//                println("Error loading image: ${it.result.throwable.message}")
//            }
//
//        )
//        Text(
//            "?"
//        )
        MainScreen(
            darkTheme = darkTheme,
            onToggleTheme = { darkTheme = !darkTheme },
        )
    }
}

