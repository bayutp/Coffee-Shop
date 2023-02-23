package com.example.jetcoffee.model

import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun TextSection(title: String, modifier: Modifier = Modifier) {
    Text(
        text = title,
        style = MaterialTheme.typography.h5.copy(fontWeight = FontWeight.ExtraBold),
        modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
    )
}