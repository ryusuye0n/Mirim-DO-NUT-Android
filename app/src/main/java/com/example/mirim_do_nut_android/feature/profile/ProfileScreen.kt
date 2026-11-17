package com.example.mirim_do_nut_android.feature.profile

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.mirim_do_nut_android.core.designsystem.theme.AppColor
import com.example.mirim_do_nut_android.feature.profile.component.ProfileHeader

@Composable
fun ProfileScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(AppColor.white)
            .padding(horizontal = 24.dp, vertical = 32.dp),
    ) {
        ProfileHeader(
            nickname = "두넛",
            introduction = "한 줄 소개를 입력해 주세요",
        )
    }
}
