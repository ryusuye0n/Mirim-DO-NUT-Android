package com.example.mirim_do_nut_android.core.designsystem.component


import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.example.mirim_do_nut_android.core.designsystem.theme.AppColor
import com.example.mirim_do_nut_android.core.designsystem.theme.AppType

@Composable
fun AppChip(
    text: String,
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    selected : Boolean = false,
) {
    Box(
        modifier = modifier.clip(RoundedCornerShape(10.dp))
            .background(if(selected) AppColor.primary else AppColor.primary40)
            .clickable(onClick = onClick)
            .padding(horizontal = 15.dp, vertical = 10.dp)
    ) {
        Text(text, style = AppType.text3, color = AppColor.gray950)
    }
}