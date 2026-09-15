package com.example.edusafe_safetyeducationforteenagers.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import com.example.edusafe_safetyeducationforteenagers.ui.components.ResultCard

/**
 * Screen 6: Try Again -- shown when the player makes the unsafe choice.
 *
 * The warning glyph is a plain-text emoji, so no icon-library dependency is
 * required.
 */
@Composable
fun RetryScreen(
    onRetry: () -> Unit
) {
    val retryTitle = "That wasn't safe"
    val retryExplanation =
        "Online strangers who ask for a photo right away are testing if you'll say yes. It's never \"no big deal.\""

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFFFBE9E7)
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
                    .background(Color(0xFFE64A19), CircleShape),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "⚠️", fontSize = 32.sp)
            }

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Try again",
                color = Color(0xFFD84315),
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(4.dp))

            Text(
                text = retryTitle,
                color = Color(0xFF1B1B1B),
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(20.dp))

            ResultCard(
                title = retryTitle,
                explanation = retryExplanation,
                isSuccess = false
            )

            Spacer(modifier = Modifier.weight(1f))

            Button(
                onClick = onRetry,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(52.dp),
                shape = RoundedCornerShape(16.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFD84315))
            ) {
                Text(text = "Retry simulation", fontSize = 16.sp, fontWeight = FontWeight.SemiBold)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun RetryScreenPreview() {
    RetryScreen(onRetry = {})
}
