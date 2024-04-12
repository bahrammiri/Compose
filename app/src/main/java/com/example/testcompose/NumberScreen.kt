package com.example.testcompose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier


@Composable
fun BaseScreen(numberViewModel: NumberViewModel) {

    NumberScreen(
        onClick = { numberViewModel.generateNumber() },
        number = numberViewModel.number.value.toString()
    )

}

@Composable
fun NumberScreen(
    onClick: () -> Unit,
    number: String,
) {

    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = {
            onClick.invoke()
        }) {
            Text(number)
        }

    }


}