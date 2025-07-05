package pl.michal_cyran.website

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowPlacement
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import pl.michal_cyran.website.education.presentation.EducationScreen

fun main() = application {

    val state = rememberWindowState(placement = WindowPlacement.Maximized)
    Window(
        onCloseRequest = ::exitApplication,
        title = "Website",
        state = state,
    ) {
        App()
    }
}