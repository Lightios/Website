package pl.michal_cyran.website.core.presentation.composables

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.StringResource
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import website.composeapp.generated.resources.Res
import website.composeapp.generated.resources.school

@Composable
fun ScreenButton(
    text: StringResource,
    icon: DrawableResource,
    onClick: () -> Unit,
) {

    TextButton(
        onClick = onClick,
        modifier = Modifier.padding(start = 8.dp)
    ) {
        Icon(
            painter = painterResource(icon),
            contentDescription = null,
        )

        Spacer(
            modifier = Modifier.width(8.dp)
        )

        Text(
            text = stringResource(text),
            style = MaterialTheme.typography.bodyMedium
        )


    }
}