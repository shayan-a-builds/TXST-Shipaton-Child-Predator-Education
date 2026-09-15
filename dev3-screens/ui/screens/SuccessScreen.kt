package com.txstshipaton.socialsentry.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.weight
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.txstshipaton.socialsentry.ui.components.ResultCard

/**
 * Screen 5: Success -- shown when the player makes the safe choice.
 *
 * All text and the XP reward are hardcoded display text for the hackathon
 * MVP. No XP calculation, storage, or persistence happens here. The
 * checkmark and star are plain-text emoji glyphs, so no icon-library
 * dependency is required.
 */
@Composable
fun SuccessScreen(
    onRestart: () -> Unit
) {
    val successTitle = "Grooming tactic spotted"
    val successExplanation =
        "Claiming to know you and rushing you for a photo is a red flag, not a coincidence."

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFFE8F5E9)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(32.dp))

            Box(
                modifier = Modifier
                    .size(72.dp)
                    .background(Color(0xFF2E7D32), CircleShape),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "✓",
                    color = Color.White,
                    fontSize = 34.sp,
                    fontWeight = FontWeight.Bold
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Success",
                color = Color(0xFF2E7D32),
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(4.dp))

            Text(
                text = successTitle,
                color = Color(0xFF1B1B1B),
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(20.dp))

            ResultCard(
                title = successTitle,
                explanation = successExplanation,
                isSuccess = true
            )

            Spacer(modifier = Modifier.weight(1f))

            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(text = "⭐", fontSize = 18.sp)
                Spacer(modifier = Modifier.width(6.dp))
                Text(
                    text = "+100 XP · Advanced guardian",
                    color = Color(0xFF1B1B1B),
                    fontSize = 15.sp,
                    fontWeight = FontWeight.SemiBold
                )
            }

            Spacer(modifier = Modifier.height(20.dp))

            Button(
                onClick = onRestart,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(52.dp),
                shape = RoundedCornerShape(16.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF2E7D32))
            ) {
                Text(text = "Restart simulation", fontSize = 16.sp, fontWeight = FontWeight.SemiBold)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun SuccessScreenPreview() {
    SuccessScreen(onRestart = {})
}
