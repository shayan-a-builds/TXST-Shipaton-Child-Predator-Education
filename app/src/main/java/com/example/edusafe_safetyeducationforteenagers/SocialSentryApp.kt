package com.example.edusafe_safetyeducationforteenagers

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.edusafe_safetyeducationforteenagers.ui.screens.DecisionScreen
import com.example.edusafe_safetyeducationforteenagers.ui.screens.RetryScreen
import com.example.edusafe_safetyeducationforteenagers.ui.screens.SuccessScreen

/**
 * Controls navigation between the six simulation screens.
 *
 * Decision, Success, and Retry now use Developer 3's real screens. Briefing,
 * Icebreaker, and Escalation still use temporary placeholders until
 * Developer 1 delivers those screens; swap them the same way once available.
 */
@Composable
fun SocialSentryApp() {
    var currentScreen by rememberSaveable { mutableStateOf("briefing") }

    when (currentScreen) {
        "briefing" -> {
            TemporaryBriefingScreen(
                onStartSimulation = { currentScreen = "icebreaker" }
            )
        }

        "icebreaker" -> {
            TemporaryIcebreakerScreen(
                onContinue = { currentScreen = "escalation" }
            )
        }

        "escalation" -> {
            TemporaryEscalationScreen(
                onContinue = { currentScreen = "decision" }
            )
        }

        "decision" -> {
            DecisionScreen(
                onSafeChoice = { currentScreen = "success" },
                onUnsafeChoice = { currentScreen = "retry" }
            )
        }

        "success" -> {
            SuccessScreen(
                onRestart = { currentScreen = "briefing" }
            )
        }

        "retry" -> {
            RetryScreen(
                onRetry = { currentScreen = "decision" }
            )
        }
    }
}

@Composable
fun TemporaryBriefingScreen(
    onStartSimulation: () -> Unit
) {
    Scaffold { innerPadding ->
        Column(
            modifier = Modifier.fillMaxSize().padding(innerPadding).padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Text("Briefing Screen (placeholder)")
            Text("You are about to start a safety simulation.")
            Button(onClick = onStartSimulation) {
                Text("Start Simulation")
            }
        }
    }
}

@Composable
fun TemporaryIcebreakerScreen(
    onContinue: () -> Unit
) {
    Scaffold { innerPadding ->
        Column(
            modifier = Modifier.fillMaxSize().padding(innerPadding).padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Text("Icebreaker Screen (placeholder)")
            Text("Hey! You seem cool, wanna be friends? :)")
            Button(onClick = onContinue) {
                Text("Continue")
            }
        }
    }
}

@Composable
fun TemporaryEscalationScreen(
    onContinue: () -> Unit
) {
    Scaffold { innerPadding ->
        Column(
            modifier = Modifier.fillMaxSize().padding(innerPadding).padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Text("Escalation Screen (placeholder)")
            Text("Can you send me a picture? Just between us.")
            Button(onClick = onContinue) {
                Text("Continue")
            }
        }
    }
}

