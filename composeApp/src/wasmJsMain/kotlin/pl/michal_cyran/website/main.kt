package pl.michal_cyran.website

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.ComposeViewport
import coil3.compose.AsyncImage
import kotlinx.browser.document
import org.jetbrains.compose.resources.painterResource

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    ComposeViewport(document.body!!) {
        App()
//        var state by remember { mutableStateOf("Hello, WebAssembly!") }
//        Column {
////            AsyncImage(
////                model = "https://srv77004.seohost.com.pl/VL/Setups/Sage/Ascent/ADefending.jpg",
////                contentDescription = "Website Logo",
////                contentScale = androidx.compose.ui.layout.ContentScale.Fit,
////                onError = { error ->
////                    state = "error ${error.result}"
////                },
////                onLoading = {
////                    state = "loading"
////                },
////                onSuccess = {
////                    state = "success"
////                },
////            )
////
////            Text(
////                text = state,
////            )
//        }
    }
}