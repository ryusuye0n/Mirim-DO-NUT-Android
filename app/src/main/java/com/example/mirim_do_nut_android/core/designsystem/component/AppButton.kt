package com.example.mirim_do_nut_android.core.designsystem.component

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.mirim_do_nut_android.core.designsystem.theme.AppColor
import com.example.mirim_do_nut_android.core.designsystem.theme.AppType

@Composable
fun AppButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
) {
    Button(
        onClick = onClick,
        modifier = modifier.height(65.dp).width(353.dp),
        enabled = enabled,
        shape = RoundedCornerShape(500.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = AppColor.black,
            disabledContainerColor = AppColor.gray100
        )
    ) {
        Text(
            text = text,
            style = AppType.text1,
            color = if (enabled) AppColor.white else AppColor.gray500
        )
    }
}