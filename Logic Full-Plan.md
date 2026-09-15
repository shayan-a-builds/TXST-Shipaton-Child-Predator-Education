

# Developer 2 Assignment: Connect the Screens and App Logic

IMPORTANT SHARED RULES

1. Read docs/SCREEN_CONTRACT.md before coding.

2. Inspect docs/TXST_SHIPATHON_APP_UI.png for the visual design.

3. Use the existing package name and existing UI system.

4. Modify only the files assigned to this developer.

5. Do not modify MainActivity.kt unless you are Developer 2.

6. Do not modify SocialSentryApp.kt unless you are Developer 2.

7. Do not modify Gradle, SDK, Kotlin, plugin, or dependency versions.

8. Do not create files owned by another developer.

9. If another developer's file needs a change, report it to the product manager.

10. Keep everything hardcoded and local for the MVP.

## Project

Child Education Android Hackathon App

## Your Role

You are responsible for making the application move between its six screens.

Developer 1 is building:

1. Briefing screen
2. Icebreaker screen
3. Escalation screen

Developer 3 is building:

4. Decision screen
5. Success screen
6. Try Again screen

Your job is to connect those screens into one working simulation.

Keep the logic extremely simple.

Do not build:

- A backend
- A database
- A login system
- A complex navigation system
- A production architecture
- A real chat system

---

# Your Branch

Work only on:

dev-2-logic


Do not push directly to:

main

Before You Begin

The product manager will prepare the Android project and GitHub repository.

Before writing code:

Clone or pull the latest project.
Switch to your branch:
git checkout dev-2-logic

Open the project in Android Studio.
Wait for Gradle Sync to finish.
Run the existing application once.
Confirm that the application opens.

If the application does not build before you make changes, tell the product manager immediately.

Do not change Gradle versions or dependencies to fix the problem yourself.

Your Main Responsibility

Connect the six screens in this order:

Briefing
    ↓
Icebreaker
    ↓
Escalation
    ↓
Decision
    ├── Safe choice → Success
    └── Unsafe choice → Try Again


The retry path should work like this:

Try Again
    ↓
Decision


The complete application flow should be:

Start Simulation
    ↓
Read the icebreaker message
    ↓
Continue
    ↓
Read the escalation messages
    ↓
Continue
    ↓
Make a decision
    ├── Block and Report → Success
    └── Send the photo → Try Again

Keep the Logic Simple

Use one variable to remember the current screen.

If the project uses Jetpack Compose, a simple approach is:

var currentScreen by rememberSaveable {
    mutableStateOf("briefing")
}


Then use a when statement:

when (currentScreen) {
    "briefing" -> {
        // Show BriefingScreen
    }

    "icebreaker" -> {
        // Show IcebreakerScreen
    }

    "escalation" -> {
        // Show EscalationScreen
    }

    "decision" -> {
        // Show DecisionScreen
    }

    "success" -> {
        // Show SuccessScreen
    }

    "retry" -> {
        // Show RetryScreen
    }
}


You do not need to create:

A ViewModel
A state machine class
Navigation Compose
Multiple routes
A repository
Use cases
Dependency injection

The goal is to create a stable hackathon demonstration, not a production application.

Recommended File

Create one file that controls the simulation:

SocialSentryApp.kt


The file should contain a composable similar to:

@Composable
fun SocialSentryApp() {
    var currentScreen by rememberSaveable {
        mutableStateOf("briefing")
    }

    when (currentScreen) {
        "briefing" -> {
            BriefingScreen(
                onStartSimulation = {
                    currentScreen = "icebreaker"
                }
            )
        }

        "icebreaker" -> {
            IcebreakerScreen(
                onContinue = {
                    currentScreen = "escalation"
                }
            )
        }

        "escalation" -> {
            EscalationScreen(
                onContinue = {
                    currentScreen = "decision"
                }
            )
        }

        "decision" -> {
            DecisionScreen(
                onSafeChoice = {
                    currentScreen = "success"
                },
                onUnsafeChoice = {
                    currentScreen = "retry"
                }
            )
        }

        "success" -> {
            SuccessScreen(
                onRestart = {
                    currentScreen = "briefing"
                }
            )
        }

        "retry" -> {
            RetryScreen(
                onRetry = {
                    currentScreen = "decision"
                }
            )
        }
    }
}


The exact function names may be slightly different after Developer 1 and Developer 3 finish.

Adjust the function names during integration, but do not rewrite the other developers’ screen designs.

Connecting MainActivity

MainActivity.kt should display the main application controller.

A simple Compose setup may look like:

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            SocialSentryTheme {
                SocialSentryApp()
            }
        }
    }
}


Use the theme that already exists in the project.

Do not create another theme unless necessary.

Temporary Placeholder Screens

Developer 1 and Developer 3 may still be working when you start.

You do not need to wait.

Create temporary placeholder composables so you can test the app flow.

Example:

@Composable
fun TemporaryBriefingScreen(
    onStartSimulation: () -> Unit
) {
    Column {
        Text("Briefing Screen")

        Button(onClick = onStartSimulation) {
            Text("Start Simulation")
        }
    }
}


You may create temporary placeholders for:

Briefing
Icebreaker
Escalation
Decision
Success
Try Again


Keep placeholder screens inside your own file if possible.

When the real screens arrive, delete or stop using the placeholders and connect the real screen functions.

Placeholder Decision Screen

The temporary decision screen only needs two buttons:

@Composable
fun TemporaryDecisionScreen(
    onSafeChoice: () -> Unit,
    onUnsafeChoice: () -> Unit
) {
    Column {
        Text("What do you do?")

        Button(onClick = onUnsafeChoice) {
            Text("Okay sure, just one sec")
        }

        Button(onClick = onSafeChoice) {
            Text("Block and report")
        }
    }
}


This allows the full app flow to be tested before the final UI is merged.

Screen Callback Agreement

Use these callbacks when connecting the screens.

Briefing screen
onStartSimulation: () -> Unit


Result:

Briefing → Icebreaker

Icebreaker screen
onContinue: () -> Unit


Result:

Icebreaker → Escalation

Escalation screen
onContinue: () -> Unit


Result:

Escalation → Decision

Decision screen
onSafeChoice: () -> Unit
onUnsafeChoice: () -> Unit


Results:

Safe choice → Success
Unsafe choice → Try Again

Success screen
onRestart: () -> Unit


Result:

Success → Briefing


If Developer 3 does not add a restart button to the Success screen, this callback can be removed.

Try Again screen
onRetry: () -> Unit


Result:

Try Again → Decision

About XP

The mockup displays:

+100 XP · Advanced guardian


For tonight, this can be hardcoded directly on the Success screen.

You do not need to calculate, store, or save XP.

Developer 3 can display the +100 XP text as part of the Success screen.

Do not add:

DataStore
SharedPreferences
A database
User profiles
Level calculations

The hackathon demonstration only needs to show the reward.

About the Timer

The Decision screen includes a timer icon.

For tonight, the timer can be visual only.

You do not need to implement:

A countdown
Automatic failure
Timer cancellation
Timer restoration

Developer 3 may display a clock icon without making it functional.

A real timer is optional and should only be added if the complete application already works.

About the Icebreaker and Escalation Flow

Developer 1 may add a Continue button to the chat screens.

If Developer 1 makes the entire screen tappable instead, connect the same callback:

onContinue = {
    currentScreen = "escalation"
}


For the Escalation screen:

onContinue = {
    currentScreen = "decision"
}


Do not implement automatic delays between messages unless all required screens already work.

What You May Modify

You may create or modify:

SocialSentryApp.kt
MainActivity.kt


You may also create one simple file for screen names:

AppScreen.kt


However, this additional file is optional.

If you create it, keep it simple:

enum class AppScreen {
    BRIEFING,
    ICEBREAKER,
    ESCALATION,
    DECISION,
    SUCCESS,
    RETRY
}


Then the state can be:

var currentScreen by rememberSaveable {
    mutableStateOf(AppScreen.BRIEFING)
}


Using an enum avoids spelling mistakes, but using strings is acceptable for the hackathon.

Choose the option that your team understands best.

What You Must Not Change

Do not change:

Gradle version
Android Gradle Plugin version
Kotlin version
minSdk
compileSdk
Package name
Application ID


Do not add:

FastAPI
Database
DataStore
ChromaDB
Ollama
Authentication
Networking
Navigation libraries
Dependency injection
Complex architecture


Do not redesign the UI screens created by Developer 1 or Developer 3.

Do not let the coding agent restructure the entire project.

Your Dependency on the Other Developers

You can start without waiting for anyone by using placeholder screens.

Later, you need these files from Developer 1:

BriefingScreen.kt
IcebreakerScreen.kt
EscalationScreen.kt


You need these files from Developer 3:

DecisionScreen.kt
SuccessScreen.kt
RetryScreen.kt


After those branches are merged, connect the real screens inside SocialSentryApp.kt.

If a callback name is different, make the smallest possible change needed to connect it.

Coding Agent Instructions

Copy the prompt below into your AI coding agent together with the Android project.

You are assisting with a small Android hackathon application called Social Sentry.

Your task is to connect six application screens into one working simulation.

First inspect the project and determine whether it uses Jetpack Compose or XML.

Keep the solution extremely simple and beginner-friendly.

The required application flow is:

Briefing
→ Icebreaker
→ Escalation
→ Decision

From Decision:

Safe choice
→ Success

Unsafe choice
→ Retry

From Retry:

Retry button
→ Decision

From Success:

Restart button
→ Briefing

If the project uses Jetpack Compose, create a simple SocialSentryApp composable.

Use one current-screen state variable and a when statement.

Preferred state:

var currentScreen by rememberSaveable {
    mutableStateOf("briefing")
}

The UI screens should expose these callbacks:

BriefingScreen:
onStartSimulation: () -> Unit

IcebreakerScreen:
onContinue: () -> Unit

EscalationScreen:
onContinue: () -> Unit

DecisionScreen:
onSafeChoice: () -> Unit
onUnsafeChoice: () -> Unit

SuccessScreen:
onRestart: () -> Unit

RetryScreen:
onRetry: () -> Unit

Connect the callbacks so that each interaction changes the current screen.

If the real screen files do not exist yet, create temporary placeholder composables inside SocialSentryApp.kt.

The placeholder screens should contain only:
- A screen title
- The necessary button or buttons
- The required callbacks

Keep the placeholders clearly labeled so they can be replaced later.

Connect MainActivity to SocialSentryApp.

Rules:

- Do not build the final visual designs.
- Do not rewrite UI screens owned by other developers.
- Do not create a backend.
- Do not create a database.
- Do not add login.
- Do not add networking.
- Do not add DataStore.
- Do not implement real XP storage.
- Do not implement a countdown timer.
- Do not add Navigation Compose.
- Do not create a ViewModel unless one already exists and is required.
- Do not add dependency injection.
- Do not modify Gradle files.
- Do not modify SDK versions.
- Do not change the package name.
- Do not add dependencies.
- Do not restructure the project.
- Do not edit unrelated files.

The goal is a simple working hackathon demonstration.

Before making changes:

1. Inspect the project structure.
2. Identify the existing UI system.
3. List the files you intend to modify.
4. Confirm that no Gradle changes are needed.

After making changes:

1. Check for compilation errors.
2. List every file created or modified.
3. Explain the complete screen flow.
4. Explain how placeholder screens can be replaced with the final screens.
5. Provide manual testing steps.
6. Report build errors without upgrading Gradle or dependencies.

How to Test Your Work

Test the screen flow in this order.

Test 1: Safe path
1. Launch the application.
2. Confirm the Briefing screen appears.
3. Tap Start Simulation.
4. Confirm the Icebreaker screen appears.
5. Continue.
6. Confirm the Escalation screen appears.
7. Continue.
8. Confirm the Decision screen appears.
9. Select Block and Report.
10. Confirm the Success screen appears.

Test 2: Unsafe path
1. Return to the Briefing screen or restart the application.
2. Move through the simulation again.
3. Reach the Decision screen.
4. Select the unsafe choice.
5. Confirm the Try Again screen appears.
6. Tap Retry Simulation.
7. Confirm the Decision screen appears again.

Test 3: Restart path

If the Success screen has a restart button:

1. Complete the safe path.
2. Tap Restart.
3. Confirm the Briefing screen appears.

Your Testing Checklist

Before saying your work is finished:

[ ] Gradle Sync succeeds
[ ] The project builds
[ ] The application launches
[ ] Briefing opens first
[ ] Start opens Icebreaker
[ ] Icebreaker continues to Escalation
[ ] Escalation continues to Decision
[ ] Safe choice opens Success
[ ] Unsafe choice opens Try Again
[ ] Retry returns to Decision
[ ] No Gradle files were changed
[ ] No dependencies were added
[ ] No unrelated files were changed

Your Deliverables

When finished, provide:

1. SocialSentryApp.kt
2. Updated MainActivity.kt, if required
3. Any temporary placeholder screen code
4. A working safe-choice path
5. A working unsafe-choice path
6. Working retry behavior
7. A compiling GitHub branch
8. A list of changed files
9. Short manual testing instructions


Your branch must be:

dev-2-logic

How to Submit Your Work

Commit your work:

git add .
git commit -m "feat: connect social sentry simulation flow"
git push origin dev-2-logic


Then send the product manager this message:

Developer 2 work is ready.

Branch:
dev-2-logic

Created or modified:
- SocialSentryApp.kt
- MainActivity.kt
- List any other files here

Working paths:
- Briefing to Decision
- Safe choice to Success
- Unsafe choice to Try Again
- Retry to Decision

Placeholder screens used:
Yes / No

Build result:
Successful / Not tested / Failed

Gradle files changed:
No

Dependencies added:
No

Known problems:
None / Describe the problem


Do not merge the branch yourself.

The product manager will merge the screen branches and connect any final callback names.

Definition of Done

Your assignment is complete when:

The application starts on the Briefing screen.
The user can move through all simulation stages.
The safe decision displays the Success screen.
The unsafe decision displays the Try Again screen.
Retry returns to the Decision screen.
Placeholder screens can be replaced easily.
The code is pushed to dev-2-logic.
The project still builds.
No Gradle or SDK versions were changed.

Your responsibility is functionality, not visual design.

Developer 1 and Developer 3 will provide the final screen designs.


