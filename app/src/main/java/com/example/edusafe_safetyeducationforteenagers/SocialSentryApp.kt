package com.example.edusafe_safetyeducationforteenagers

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import com.example.edusafe_safetyeducationforteenagers.ui.screens.BriefingScreen
import com.example.edusafe_safetyeducationforteenagers.ui.screens.DecisionScreen
import com.example.edusafe_safetyeducationforteenagers.ui.screens.EscalationScreen
import com.example.edusafe_safetyeducationforteenagers.ui.screens.IcebreakerScreen
import com.example.edusafe_safetyeducationforteenagers.ui.screens.RetryScreen
import com.example.edusafe_safetyeducationforteenagers.ui.screens.SuccessScreen

/**
 * Controls navigation between the six simulation screens, all now using the
 * real screens from Developer 1 (Briefing, Icebreaker, Escalation) and
 * Developer 3 (Decision, Success, Retry).
 */
@Composable
fun SocialSentryApp() {
    var currentScreen by rememberSaveable { mutableStateOf("briefing") }

    when (currentScreen) {
        "briefing" -> {
            BriefingScreen(
                onStartSimulation = { currentScreen = "icebreaker" }
            )
        }

        "icebreaker" -> {
            IcebreakerScreen(
                onContinue = { currentScreen = "escalation" }
            )
        }

        "escalation" -> {
            EscalationScreen(
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
