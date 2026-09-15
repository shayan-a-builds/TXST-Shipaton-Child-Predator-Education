package com.example.socialsentry.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/**
 * Small pill-shaped badge showing the player's current level.
 * Example: "Level 1 · Novice guardian"
 */
@Composable
fun LevelBadge(text: String) {
    Text(
        text = text,
        color = Color(0xFF4A3B0A),
        fontSize = 13.sp,
        fontWeight = FontWeight.Medium,
        modifier = Modifier
            .background(color = Color(0xFFF3E3B8), shape = RoundedCornerShape(20.dp))
            .padding(horizontal = 16.dp, vertical = 8.dp)
    )
}

@Preview(showBackground = true, backgroundColor = 0xFF14121F)
@Composable
private fun LevelBadgePreview() {
    LevelBadge(text = "Level 1 · Novice guardian")
}