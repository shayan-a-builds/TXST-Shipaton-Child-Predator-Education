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

/**
 * Controls navigation between the six simulation screens.
 *
 * Replace the Temporary*Screen composables below with the real screens from
 * Developer 1 (Briefing, Icebreaker, Escalation) and Developer 3 (Decision,
 * Success, Retry) once their branches are merged. The callback names already
 * match Screen-Contract.md, so integration should only require swapping
 * which composable is called in each branch of the `when`.
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
            TemporaryDecisionScreen(
                onSafeChoice = { currentScreen = "success" },
                onUnsafeChoice = { currentScreen = "retry" }
            )
        }

        "success" -> {
            TemporarySuccessScreen(
                onRestart = { currentScreen = "briefing" }
            )
        }

        "retry" -> {
            TemporaryRetryScreen(
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

@Composable
fun TemporaryDecisionScreen(
    onSafeChoice: () -> Unit,
    onUnsafeChoice: () -> Unit
) {
    Scaffold { innerPadding ->
        Column(
            modifier = Modifier.fillMaxSize().padding(innerPadding).padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Text("What do you do?")
            Button(onClick = onUnsafeChoice) {
                Text("Okay sure, just one sec")
            }
            Button(onClick = onSafeChoice) {
                Text("Block and report")
            }
        }
    }
}

@Composable
fun TemporarySuccessScreen(
    onRestart: () -> Unit
) {
    Scaffold { innerPadding ->
        Column(
            modifier = Modifier.fillMaxSize().padding(innerPadding).padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Text("Success Screen (placeholder)")
            Text("You made the safe choice.")
            Text("+100 XP · Advanced guardian")
            Button(onClick = onRestart) {
                Text("Restart")
            }
        }
    }
}

@Composable
fun TemporaryRetryScreen(
    onRetry: () -> Unit
) {
    Scaffold { innerPadding ->
        Column(
            modifier = Modifier.fillMaxSize().padding(innerPadding).padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Text("Try Again Screen (placeholder)")
            Text("That wasn't the safe choice. Let's try again.")
            Button(onClick = onRetry) {
                Text("Retry Simulation")
            }
        }
    }
}
