package pl.michal_cyran.website

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import pl.michal_cyran.website.education.presentation.EducationScreen

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Website",
    ) {
        EducationScreen()
//        App()
//        NavigationCardPreview()
    }
}