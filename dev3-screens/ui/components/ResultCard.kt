package com.txstshipaton.socialsentry.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/**
 * White rounded card used on the Success and Retry screens to show the
 * short educational explanation.
 *
 * @param title Short heading, e.g. "Grooming tactic spotted" or "That wasn't safe".
 * @param explanation Longer plain-language explanation shown under the title.
 * @param isSuccess true = success styling (green title), false = retry/warning styling (orange title).
 */
@Composable
fun ResultCard(
    title: String,
    explanation: String,
    isSuccess: Boolean,
    modifier: Modifier = Modifier
) {
    val titleColor = if (isSuccess) Color(0xFF2E7D32) else Color(0xFFD84315)

    Column(
        modifier = modifier
            .fillMaxWidth()
            .background(Color.White, RoundedCornerShape(20.dp))
            .padding(20.dp)
    ) {
        Text(
            text = title,
            color = titleColor,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = explanation,
            color = Color(0xFF3A3A3A),
            fontSize = 14.sp,
            lineHeight = 20.sp
        )
    }
}
