package com.example.mirim_do_nut_android.feature.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.mirim_do_nut_android.core.designsystem.theme.AppColor
import com.example.mirim_do_nut_android.feature.home.component.HomeHeader

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(AppColor.white)
            .padding(horizontal = 24.dp, vertical = 32.dp),
    ) {
        HomeHeader(
            title = "DO!NUT",
            subtitle = "오늘도 두넛과 함께해요",
        )
    }
}
