package xevidev.dev.financeapp.home

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Devices.PIXEL_8
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import xevidev.dev.financeapp.composables.FloatingButton
import xevidev.dev.financeapp.composables.GeneralExpensesElementScreen

@Composable
fun HomeScreen(modifier: Modifier) {
    val context = LocalContext.current
    Box(modifier = modifier.padding(10.dp)) {
        LazyColumn(modifier = Modifier.fillMaxSize()) {
            items(10) { item ->
                GeneralExpensesElementScreen()
            }
        }
        FloatingButton(
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(16.dp)
        ) { Toast.makeText(context, "TEETEST", Toast.LENGTH_LONG).show() }
    }
}

@Preview(showBackground = true, device = PIXEL_8, showSystemUi = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen(Modifier)
}