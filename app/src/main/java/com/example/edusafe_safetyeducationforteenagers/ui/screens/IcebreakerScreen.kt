package com.example.edusafe_safetyeducationforteenagers.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// Mock data for this screen. Kept simple and hardcoded for the MVP.
private const val ICEBREAKER_USERNAME = "NoobMaster69"
private const val ICEBREAKER_MESSAGE =
    "That clutch play in your forum post was insane. What rank are you?"
private const val ICEBREAKER_LABEL = "Friendly compliment, low stakes"

/**
 * Screen 2: Low-Stakes Icebreaker.
 *
 * Shows the first chat message from CoolGamer42, plus a short educational label
 * explaining what's happening. Calls onContinue when the user is ready to move on.
 */
@Composable
fun IcebreakerScreen(
    onContinue: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF120F1F))
            .padding(horizontal = 28.dp, vertical = 32.dp)
    ) {
        SimulationProgressBar(progress = 0.66f)

        Spacer(modifier = Modifier.height(16.dp))

        ProfileHeader(username = ICEBREAKER_USERNAME)

        Spacer(modifier = Modifier.height(16.dp))

        Divider(color = Color(0xFF2A2740), thickness = 1.dp)

        Spacer(modifier = Modifier.height(28.dp))

        Column(
            modifier = Modifier.clickable { onContinue() }
        ) {
            ChatBubble(message = ICEBREAKER_MESSAGE)
        }

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = ICEBREAKER_LABEL,
            color = Color(0xFF8A87A6),
            fontSize = 13.sp
        )

        Spacer(modifier = Modifier.weight(1f))

        Button(
            onClick = onContinue,
            shape = RoundedCornerShape(28.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF4B3F9E)),
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
        ) {
            Text(text = "Continue", color = Color.White, fontSize = 17.sp, fontWeight = FontWeight.Bold)
        }
    }
}

@Preview(showBackground = true, backgroundColor = 0xFF120F1F)
@Composable
private fun IcebreakerScreenPreview() {
    IcebreakerScreen(onContinue = {})
}