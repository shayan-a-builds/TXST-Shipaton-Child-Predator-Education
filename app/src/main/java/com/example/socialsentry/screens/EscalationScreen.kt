package com.example.socialsentry.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Flag
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// Mock data for this screen. Kept simple and hardcoded for the MVP.
private const val ESCALATION_USERNAME = "NoobMaster69"
private const val ESCALATION_MESSAGE_ONE = "Wait, I think I go to your school too"
private const val ESCALATION_MESSAGE_TWO =
    "Send a pic of what you look like right now, just to check. No big deal"
private const val ESCALATION_WARNING_LABEL = "Unverified claim + urgent ask"

/**
 * Screen 3: Proximity Claim & Escalation.
 *
 * Shows two chat messages: a normal one, then a second message in a
 * warning-colored bubble representing the risk escalation. Calls onContinue
 * to move on to the decision screen (built by Developer 3).
 */
@Composable
fun EscalationScreen(
    onContinue: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF120F1F))
            .padding(horizontal = 28.dp, vertical = 32.dp)
    ) {
        SimulationProgressBar(progress = 1.0f)

        Spacer(modifier = Modifier.height(16.dp))

        ProfileHeader(username = ESCALATION_USERNAME)

        Spacer(modifier = Modifier.height(16.dp))

        Divider(color = Color(0xFF2A2740), thickness = 1.dp)

        Spacer(modifier = Modifier.height(28.dp))

        ChatBubble(message = ESCALATION_MESSAGE_ONE)

        Spacer(modifier = Modifier.height(12.dp))

        Column(
            modifier = Modifier.clickable { onContinue() }
        ) {
            ChatBubble(message = ESCALATION_MESSAGE_TWO, isWarning = true)
        }

        Spacer(modifier = Modifier.height(14.dp))

        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(
                imageVector = Icons.Filled.Flag,
                contentDescription = "Warning flag icon",
                tint = Color(0xFFE0973D),
                modifier = Modifier.height(16.dp)
            )
            Spacer(modifier = Modifier.width(6.dp))
            Text(
                text = ESCALATION_WARNING_LABEL,
                color = Color(0xFFE0973D),
                fontSize = 13.sp
            )
        }

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
private fun EscalationScreenPreview() {
    EscalationScreen(onContinue = {})
}