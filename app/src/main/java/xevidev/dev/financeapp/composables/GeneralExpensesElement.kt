package xevidev.dev.financeapp.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices.PIXEL_8
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun GeneralExpensesElementScreen() {
    Column(
        modifier = Modifier
            .padding(20.dp)
            .wrapContentHeight()
            .fillMaxWidth()
    ) {
        Row(modifier = Modifier.padding(bottom = 6.dp)) { Text("Prueba titulo") }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text("DD/MM/AAAA")
            Text("Total: + 666€")
        }
    }
}

@Preview(showBackground = true, device = PIXEL_8, showSystemUi = true)
@Composable
fun GeneralExpensesElementScreenPreview() {
    GeneralExpensesElementScreen()
}