package com.example.mirim_do_nut_android.feature.map

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.mirim_do_nut_android.core.designsystem.component.AppChip
import com.example.mirim_do_nut_android.core.designsystem.theme.AppColor
import com.example.mirim_do_nut_android.core.designsystem.theme.AppType

private val filters = listOf("전체", "인기", "가까운 순")

@Composable
fun MapScreen() {
    var selectedFilter by remember { mutableStateOf(filters.first()) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(AppColor.white),
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp, vertical = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            filters.forEach { filter ->
                AppChip(
                    text = filter,
                    selected = filter == selectedFilter,
                    onClick = { selectedFilter = filter },
                )
            }
        }
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(AppColor.gray50),
            contentAlignment = Alignment.Center,
        ) {
            Text(
                text = "지도 영역",
                style = AppType.text3,
                color = AppColor.gray500,
            )
        }
    }
}
