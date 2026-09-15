package com.txstshipaton.socialsentry.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/**
 * Reusable button for the Decision screen's two choices.
 *
 * @param text Button label.
 * @param onClick Called when the button is tapped.
 * @param isSafeChoice true = green "safe" styling, false = light "unsafe" styling.
 * @param icon Optional glyph shown before the label, as plain text (e.g. a lock
 *             emoji). Kept as plain text on purpose -- zero icon-library
 *             dependency, so this always compiles no matter which Material
 *             icon artifacts (if any) the project includes.
 */
@Composable
fun DecisionButton(
    text: String,
    onClick: () -> Unit,
    isSafeChoice: Boolean,
    modifier: Modifier = Modifier,
    icon: String? = null
) {
    val backgroundColor = if (isSafeChoice) Color(0xFF2E7D32) else Color(0xFFE0E0E0)
    val contentColor = if (isSafeChoice) Color.White else Color(0xFF1A1A1A)

    Button(
        onClick = onClick,
        modifier = modifier
            .fillMaxWidth()
            .height(56.dp)
            .padding(vertical = 6.dp),
        shape = RoundedCornerShape(16.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = backgroundColor,
            contentColor = contentColor
        )
    ) {
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            if (icon != null) {
                Text(text = icon, fontSize = 16.sp)
                Spacer(modifier = Modifier.width(8.dp))
            }
            Text(text = text, fontSize = 16.sp, fontWeight = FontWeight.SemiBold)
        }
    }
}
