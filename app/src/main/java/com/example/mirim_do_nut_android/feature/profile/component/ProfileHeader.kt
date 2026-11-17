package com.example.mirim_do_nut_android.feature.profile.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.mirim_do_nut_android.R
import com.example.mirim_do_nut_android.core.designsystem.theme.AppColor
import com.example.mirim_do_nut_android.core.designsystem.theme.AppType

@Composable
fun ProfileHeader(
    nickname: String,
    introduction: String,
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Image(
            painter = painterResource(R.drawable.donut_icon),
            contentDescription = "프로필 이미지",
            modifier = Modifier
                .size(72.dp)
                .clip(CircleShape)
                .background(AppColor.primaryLight),
            contentScale = ContentScale.Fit,
        )
        Column(modifier = Modifier.padding(start = 16.dp)) {
            Text(
                text = nickname,
                style = AppType.title4,
                color = AppColor.gray950,
            )
            Text(
                text = introduction,
                modifier = Modifier.padding(top = 4.dp),
                style = AppType.text5,
                color = AppColor.gray600,
            )
        }
    }
}
