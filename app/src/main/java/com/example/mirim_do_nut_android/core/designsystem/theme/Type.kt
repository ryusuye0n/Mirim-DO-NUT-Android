package com.example.mirim_do_nut_android.core.designsystem.theme

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.mirim_do_nut_android.R

val Pretendard = FontFamily(
    Font(R.font.pretendard_regular, FontWeight.Normal),
    Font(R.font.pretendard_semibold, FontWeight.SemiBold),
    Font(R.font.pretendard_bold, FontWeight.Bold),
    Font(R.font.pretendard_black, FontWeight.Black),
)

object AppType {
    private val base = TextStyle(fontFamily = Pretendard)
    
    val display = base.copy(
        fontWeight = FontWeight.Black,
        fontSize = 40.sp
    )
    val title1 = base.copy(
        fontWeight = FontWeight.Black,
        fontSize = 24.sp
    )
    val title2 = base.copy(
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp
    )
    val title3 = base.copy(
        fontWeight = FontWeight.SemiBold,
        fontSize = 24.sp
    )
    val title4 = base.copy(
        fontWeight = FontWeight.SemiBold,
        fontSize = 20.sp
    )
    val title5 = base.copy(
        fontWeight = FontWeight.Normal,
        fontSize = 20.sp
    )

    val text1 = base.copy(
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp
    )
    val text2 = base.copy(
        fontWeight = FontWeight.SemiBold,
        fontSize = 16.sp
    )
    val text3 = base.copy(
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )
    val text4 = base.copy(
        fontWeight = FontWeight.Normal,
        fontSize = 15.sp
    )
    val text5 = base.copy(
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    )

    val caption1 = base.copy(
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    val caption2 = base.copy(
        fontWeight = FontWeight.SemiBold,
        fontSize = 10.sp
    )
    val caption3 = base.copy(
        fontWeight = FontWeight.Normal,
        fontSize = 10.sp
    )
    val caption4 = base.copy(
        fontWeight = FontWeight.SemiBold,
        fontSize = 8.sp
    )
}