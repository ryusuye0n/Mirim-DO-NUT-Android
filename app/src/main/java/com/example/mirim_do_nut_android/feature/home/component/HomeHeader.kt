package com.example.mirim_do_nut_android.feature.home.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.mirim_do_nut_android.core.designsystem.theme.AppColor
import com.example.mirim_do_nut_android.core.designsystem.theme.AppType

@Composable
fun HomeHeader(
    title: String,
    subtitle: String,
    modifier: Modifier = Modifier,
) {
    Column(modifier = modifier.fillMaxWidth()) {
        Text(
            text = title,
            style = AppType.title1,
            color = AppColor.gray950,
        )
        Text(
            text = subtitle,
            modifier = Modifier.padding(top = 6.dp),
            style = AppType.text5,
            color = AppColor.gray600,
        )
    }
}
