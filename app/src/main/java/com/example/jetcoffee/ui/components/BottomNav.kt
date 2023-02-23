package com.example.jetcoffee.ui.components

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.jetcoffee.R
import com.example.jetcoffee.model.BottomNavItem
import com.example.jetcoffee.ui.theme.LightGray

@Composable
fun BottomNav(modifier: Modifier = Modifier) {
    BottomNavigation(
        backgroundColor = MaterialTheme.colors.background,
        contentColor = MaterialTheme.colors.primary,
        modifier = modifier
    ) {
        val navItems = listOf(
            BottomNavItem(
                title = stringResource(id = R.string.menu_home),
                icon = Icons.Default.Home
            ),
            BottomNavItem(
                title = stringResource(id = R.string.menu_favorite),
                icon = Icons.Default.Favorite
            ),
            BottomNavItem(
                title = stringResource(id = R.string.menu_profile),
                icon = Icons.Default.AccountCircle
            )
        )
        navItems.map {
            BottomNavigationItem(
                icon = {
                    Icon(
                        imageVector = it.icon,
                        contentDescription = it.title
                    )
                },
                label = {
                    Text(text = it.title)
                },
                selected = it.title == navItems[0].title,
                unselectedContentColor = LightGray,
                onClick = {})
        }
    }
}