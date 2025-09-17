package xevidev.dev.financeapp.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun GeneralExpensesElementScreen(){
    Column {
        Row { Text("Prueba titulo") }
        Row {
            Text("DD/MM/AAAA")
            Text("Total: + 666€")
        }
    }
}