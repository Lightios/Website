package pl.michal_cyran.website.core.presentation.composables

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.StringResource
import org.jetbrains.compose.resources.stringResource

@Composable
fun ScreenButton(
    text: StringResource,
    onClick: () -> Unit,
) {

    TextButton(
        onClick = onClick,
        modifier = Modifier.padding(start = 8.dp)
    ) {
        Text(
            text = stringResource(text),
            style = MaterialTheme.typography.bodyMedium
        )
    }
}