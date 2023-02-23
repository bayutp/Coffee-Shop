package com.example.jetcoffee.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.jetcoffee.model.TextSection

@Composable
fun HomeSection(
    title: String, modifier: Modifier = Modifier, content: @Composable
        () -> Unit
) {
    Column(modifier = modifier) {
        TextSection(title = title)
        content()
    }
}