package xevidev.dev.financeapp.composables

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import xevidev.dev.financeapp.R

@Composable
fun FloatingButton(modifier: Modifier, onClick: () -> Unit) {
    FloatingActionButton(modifier = modifier, onClick = { onClick() }) {
        Icon(Icons.Filled.Add, stringResource(R.string.composable_floating_button))
    }
}