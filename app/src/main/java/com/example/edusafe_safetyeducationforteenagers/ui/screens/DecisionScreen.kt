package com.example.edusafe_safetyeducationforteenagers.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
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
import com.example.edusafe_safetyeducationforteenagers.ui.components.DecisionButton

/**
 * Screen 4: Decision.
 *
 * Shows the moment-of-choice screen. This screen does NOT decide what
 * happens next -- it only reports the player's choice through the two
 * callbacks. Developer 2 wires those callbacks to the rest of the app.
 *
 * The clock and lock are plain-text emoji glyphs (visual only, no real
 * countdown, no icon-library dependency), so this file only needs core
 * Compose + Material3 + the DecisionButton component below.
 */
@Composable
fun DecisionScreen(
    onSafeChoice: () -> Unit,
    onUnsafeChoice: () -> Unit
) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFF121212)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Screen 4: Decision",
                color = Color(0xFF9E9E9E),
                fontSize = 13.sp,
                modifier = Modifier.padding(top = 8.dp)
            )

            Column(
                modifier = Modifier.weight(1f),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "⏱️", fontSize = 48.sp) // clock/timer glyph, visual only
                Text(
                    text = "What do you do?",
                    color = Color.White,
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }

            DecisionButton(
                text = "Okay sure, just one sec",
                onClick = onUnsafeChoice,
                isSafeChoice = false
            )

            DecisionButton(
                text = "Block and report",
                onClick = onSafeChoice,
                isSafeChoice = true,
                icon = "🔒" // lock glyph, visual only
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun DecisionScreenPreview() {
    DecisionScreen(onSafeChoice = {}, onUnsafeChoice = {})
}
