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
import androidx.compose.ui.unit.dp
import xevidev.dev.financeapp.composables.FloatingButton

@Composable
fun HomeScreen(modifier: Modifier) {
    val context = LocalContext.current
    Box(modifier = modifier) {
        LazyColumn(modifier = Modifier.fillMaxSize()) {
            items(60) { item ->
                Text("Itemaasdfasdsf")
            }
        }
        FloatingButton(
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(16.dp)
        ) { Toast.makeText(context, "TEETEST", Toast.LENGTH_LONG).show() }
    }
}