package com.example.mirim_do_nut_android.core.designsystem.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.mirim_do_nut_android.R
import com.example.mirim_do_nut_android.core.designsystem.theme.AppColor
import com.example.mirim_do_nut_android.core.designsystem.theme.AppType

@Composable
fun AppNavigationBar(
    isSelected: (String) -> Unit,
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier
            .height(73.dp)
            .width(333.dp)
            .clip(RoundedCornerShape(500.dp))
            .background(color = AppColor.primary)
            .padding(vertical = 12.dp, horizontal = 56.dp),
        horizontalArrangement = Arrangement.spacedBy(35.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.clickable {
                isSelected("HOME")
            }) {
            Icon(painter = painterResource(id = R.drawable.home), contentDescription = null)
            Text("HOME", style = AppType.caption3)
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.clickable {
                isSelected("PROFILE")
            }) {
            Icon(painter = painterResource(id = R.drawable.person), contentDescription = null)
            Text("PROFILE", style = AppType.caption3)
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.clickable {
                isSelected("MAP")
            }) {
            Icon(painter = painterResource(id = R.drawable.map), contentDescription = null)
            Text("MAP", style = AppType.caption3)
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.clickable {
                isSelected("CHAT")
            }) {
            Icon(painter = painterResource(id = R.drawable.chat), contentDescription = null)
            Text("CHAT", style = AppType.caption3)
        }

    }
}