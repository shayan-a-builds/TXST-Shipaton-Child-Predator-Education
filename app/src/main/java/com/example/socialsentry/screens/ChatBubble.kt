package com.example.socialsentry.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/**
 * A single chat message bubble.
 *
 * isWarning = false -> normal dark bubble.
 * isWarning = true  -> light warning-colored bubble with an orange outline,
 *                      used to flag a risky message so it visually stands out.
 *
 * The bubble wraps its content instead of stretching full width, so it reads
 * like a chat message card rather than a banner.
 */
@Composable
fun ChatBubble(
    message: String,
    isWarning: Boolean = false
) {
    val backgroundColor = if (isWarning) Color(0xFFFBEAD3) else Color(0xFF201D30)
    val textColor = if (isWarning) Color(0xFF5C3B18) else Color(0xFFEDEBFA)
    val shape = RoundedCornerShape(18.dp)

    var modifier = Modifier
        .widthIn(max = 260.dp)
        .background(color = backgroundColor, shape = shape)

    if (isWarning) {
        modifier = modifier.border(
            border = BorderStroke(1.dp, Color(0xFFE0973D)),
            shape = shape
        )
    }

    Text(
        text = message,
        color = textColor,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        modifier = modifier.padding(horizontal = 16.dp, vertical = 12.dp)
    )
}

@Preview(showBackground = true, backgroundColor = 0xFF14121F)
@Composable
private fun ChatBubbleNormalPreview() {
    ChatBubble(message = "That clutch play in your forum post was insane. What rank are you?")
}

@Preview(showBackground = true, backgroundColor = 0xFF14121F)
@Composable
private fun ChatBubbleWarningPreview() {
    ChatBubble(
        message = "Send a pic of what you look like right now, just to check. No big deal",
        isWarning = true
    )
}