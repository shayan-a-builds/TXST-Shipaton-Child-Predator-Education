# Social Sentry Screen Contract

Do not rename these functions or callback parameters.

## Developer 1 : Adeel

kotlin
@Composable
fun BriefingScreen(
    onStartSimulation: () -> Unit
)

@Composable
fun IcebreakerScreen(
    onContinue: () -> Unit
)

@Composable
fun EscalationScreen(
    onContinue: () -> Unit
)

# Developer 3: Sherbaz

@Composable
fun DecisionScreen(
    onSafeChoice: () -> Unit,
    onUnsafeChoice: () -> Unit
)

@Composable
fun SuccessScreen(
    onRestart: () -> Unit
)

@Composable
fun RetryScreen(
    onRetry: () -> Unit
)



























