package com.example.socialsentry.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/**
 * Avatar (showing the username's initials) next to the username.
 * Used at the top of the chat screens (Icebreaker, Escalation).
 */
@Composable
fun ProfileHeader(username: String) {
    // Take up to the first two letters of the username as a simple placeholder avatar.
    val initials = username.filter { it.isUpperCase() }.take(2)

    Row(verticalAlignment = Alignment.CenterVertically) {
        Box(
            modifier = Modifier
                .size(38.dp)
                .background(color = Color(0xFF5D5498), shape = CircleShape),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = initials,
                color = Color(0xFFEDEBFA),
                fontSize = 13.sp,
                fontWeight = FontWeight.SemiBold
            )
        }
        Spacer(modifier = Modifier.width(12.dp))
        Text(
            text = username,
            color = Color.White,
            fontSize = 16.sp,
            fontWeight = FontWeight.SemiBold
        )
    }
}

@Preview(showBackground = true, backgroundColor = 0xFF14121F)
@Composable
private fun ProfileHeaderPreview() {
    ProfileHeader(username = "CoolGamer42")
}