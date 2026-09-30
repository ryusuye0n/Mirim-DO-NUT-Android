package com.example.mirim_do_nut_android.core.designsystem.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.example.mirim_do_nut_android.core.designsystem.theme.AppColor
import com.example.mirim_do_nut_android.core.designsystem.theme.AppType

@Composable
fun AppDropDown(
    hintString: String,
    options: List<String>,
    selectedText: String?, // 읽기용
    onOptionSelected: (String) -> Unit, // 쓰기용
    modifier: Modifier = Modifier,
) {
    var expanded by remember { mutableStateOf(false) }
    Box(
        modifier = modifier
            .height(44.dp)
            .width(333.dp)
            .clip(RoundedCornerShape(15.dp))
            .background(color = AppColor.gray10040)
            .padding(horizontal = 20.dp, vertical = 13.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clickable {
                    expanded = true
                },
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(selectedText ?: hintString, style = AppType.text5.copy(color = AppColor.gray450))
            Icon(imageVector = Icons.Default.KeyboardArrowDown, contentDescription = null)
        }
        DropdownMenu(
            expanded,
            onDismissRequest = { expanded = false },
        ) {
            options.forEach { option ->
                DropdownMenuItem(
                    text = { Text(option, style = AppType.text5.copy(color = AppColor.gray450)) },
                    onClick = {
                        onOptionSelected(option)
                        expanded = false
                    }
                )
            }
        }
    }
}