package xevidev.dev.financeapp.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices.PIXEL_8
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun GeneralExpensesElementScreen(){
    Column(modifier = Modifier.wrapContentHeight().fillMaxWidth()) {
        Row { Text("Prueba titulo") }
        Row {
            Text("DD/MM/AAAA")
            Text("Total: + 666€")
        }
    }
}

@Preview(showBackground = true, device = PIXEL_8, showSystemUi = true)
@Composable
fun GeneralExpensesElementScreenPreview(){
    GeneralExpensesElementScreen()
}