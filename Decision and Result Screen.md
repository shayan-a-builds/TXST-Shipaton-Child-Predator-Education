

# Developer 3 Assignment: Decision and Result Screens

## Project

Social Sentry Android Hackathon App

## Your Role

You are responsible for building the final three screens of the application:

1. Decision screen
2. Success screen
3. Try Again screen

Focus only on making these screens look like the provided mockup.

Use hardcoded text and mock data.

You do not need to build:

- Navigation
- A backend
- A database
- A ViewModel
- XP storage
- A working countdown timer
- A real reporting system

Developer 2 will connect your screens to the rest of the application.

---

# Your Branch

Work only on:

dev-3-results


Do not push directly to:

main

Before You Begin

The product manager will prepare the Android project and GitHub repository.

Before writing code:

Clone or pull the latest project.
Switch to your assigned branch:
git checkout dev-3-results

Open the project in Android Studio.
Wait for Gradle Sync to finish.
Run the existing application once.
Confirm that the application opens before making changes.

If the project does not build before you make changes, tell the product manager immediately.

Do not update Gradle, Kotlin, SDK versions, or dependencies to fix the issue yourself.

Your Responsibilities

You will build these files:

DecisionScreen.kt
SuccessScreen.kt
RetryScreen.kt


You may create small reusable UI components if doing so makes the work easier:

ResultCard.kt
DecisionButton.kt


Do not edit:

MainActivity.kt
SocialSentryApp.kt


Developer 2 owns the file that connects the screens.

Screen 4: Decision Screen

Build the decision screen shown in the mockup.

Required content

Display:

Screen 4: Decision

What do you do?

Okay sure, just one sec

Block and report

Required visual elements

The screen should include:

Dark background
Small screen label at the top
Clock or timer icon near the center
“What do you do?” text
Light-colored unsafe-choice button
Green safe-choice button
Rounded button corners
Buttons positioned near the bottom
Shield, block, or security icon inside the safe button if easily available

The clock does not need to function.

It is only a visual icon for the hackathon MVP.

Required callbacks

The screen must accept:

onSafeChoice: () -> Unit
onUnsafeChoice: () -> Unit


When the user taps:

Block and report


Call:

onSafeChoice()


When the user taps:

Okay sure, just one sec


Call:

onUnsafeChoice()


Do not decide which screen appears next. Developer 2 will connect the callbacks.

Screen 5: Success Screen

Build the success result screen shown in the mockup.

Required content

Display:

Success

Grooming tactic spotted

Claiming to know you and rushing you for a photo is a red flag, not a coincidence.

+100 XP · Advanced guardian


You may also include a button:

Restart simulation


The button is helpful because it allows the demonstration to return to the beginning.

Required visual elements

The screen should include:

Pale green background
Green circular icon background
White checkmark icon
Green “Success” label
“Grooming tactic spotted” heading
White rounded explanation card
XP reward near the bottom
Star icon beside the XP reward if easily available
Rounded corners and spacing similar to the mockup

The exact icon does not need to match perfectly. Use an existing Material checkmark or completed icon.

Required callback

The screen must accept:

onRestart: () -> Unit


If you add a Restart Simulation button, call:

onRestart()


Developer 2 will connect the callback to the opening screen.

Important XP instruction

The +100 XP reward is display text only.

Hardcode:

+100 XP · Advanced guardian


Do not create:

XP calculations
A database
DataStore
SharedPreferences
User profiles
Level progression logic

The demonstration only needs to show the reward.

Screen 6: Try Again Screen

Build the unsafe-choice result screen shown in the mockup.

Required content

Display:

Try again

That wasn’t safe

Online strangers who ask for a photo right away are testing if you’ll say yes. It’s never “no big deal.”

Retry simulation

Required visual elements

The screen should include:

Pale pink or pale warning-colored background
Orange circular icon background
Warning triangle icon
Orange or dark red “Try again” label
“That wasn’t safe” heading
White rounded explanation card
Dark orange or red Retry Simulation button
Rounded corners and spacing similar to the mockup

Use an existing Material warning icon.

Do not install another icon library.

Required callback

The screen must accept:

onRetry: () -> Unit


When the user taps:

Retry simulation


Call:

onRetry()


Developer 2 will connect this callback to the Decision screen.

Use Hardcoded Text

You do not need to wait for another developer.

Put the text directly inside your screen composables.

Example:

val successTitle = "Grooming tactic spotted"

val successExplanation =
    "Claiming to know you and rushing you for a photo is a red flag, not a coincidence."

val retryTitle = "That wasn’t safe"

val retryExplanation =
    "Online strangers who ask for a photo right away are testing if you’ll say yes. It’s never \"no big deal.\""


Hardcoded text is acceptable for the hackathon MVP.

Do not create:

JSON files
Scenario models
A repository
API requests
A FastAPI server
A cloud database
Real chat functionality
Keep the Code Simple

If the project uses Jetpack Compose, use basic components:

Column
Row
Box
Text
Button
Surface
Spacer
Icon


Use modifiers for:

Padding
Size
Background color
Full-width buttons
Rounded corners
Alignment


If the project uses XML layouts, continue using XML.

Do not convert the entire project from XML to Compose or from Compose to XML.

Suggested Function Signatures

Use these signatures unless the existing project requires a small adjustment.

Decision screen
@Composable
fun DecisionScreen(
    onSafeChoice: () -> Unit,
    onUnsafeChoice: () -> Unit
)

Success screen
@Composable
fun SuccessScreen(
    onRestart: () -> Unit
)

Retry screen
@Composable
fun RetryScreen(
    onRetry: () -> Unit
)


These names are important because Developer 2 will use them to connect the application.

Do not rename the callbacks unless you tell Developer 2 and the product manager.

Optional Reusable Components

Only create reusable components if the components make the code easier.

DecisionButton

Possible inputs:

text: String
onClick: () -> Unit
isSafeChoice: Boolean


Behavior:

Safe choice:
Use a green background.

Unsafe choice:
Use a light background.

ResultCard

Possible inputs:

title: String
explanation: String
isSuccess: Boolean


Behavior:

Success:
Use green colors and a checkmark.

Retry:
Use warning colors and a warning icon.


Reusable components are optional. Three simple screen files are completely acceptable tonight.

What You Must Not Change

Do not change:

Gradle version
Android Gradle Plugin version
Kotlin version
minSdk
compileSdk
Package name
Application ID
Project directory structure


Do not add:

FastAPI
Database
DataStore
SharedPreferences
ChromaDB
Ollama
Authentication
Networking
Real XP storage
A real countdown timer
Complex animations
New UI libraries
Navigation libraries


Do not edit:

MainActivity.kt
SocialSentryApp.kt
Developer 1 screen files


Only modify another developer’s file if the product manager specifically asks you to.

Coding Agent Instructions

Copy the prompt below into your AI coding agent together with the Android project.

You are assisting with a small Android hackathon application called Social Sentry.

Your task is to build only the final three application screens:

1. DecisionScreen
2. SuccessScreen
3. RetryScreen

First inspect the existing project and determine whether it uses Jetpack Compose or XML. Continue using the existing UI system.

Keep the implementation simple and beginner-friendly.

SCREEN 4: DECISION

Display:
- Screen 4: Decision
- Clock or timer icon
- "What do you do?"
- Unsafe-choice button:
  "Okay sure, just one sec"
- Safe-choice button:
  "Block and report"

Visual requirements:
- Dark background
- Light-colored unsafe button
- Green safe button
- Rounded button corners
- Buttons near the bottom

The screen must accept:

onSafeChoice: () -> Unit
onUnsafeChoice: () -> Unit

The safe button must call onSafeChoice.

The unsafe button must call onUnsafeChoice.

The timer icon is visual only. Do not implement a countdown.

SCREEN 5: SUCCESS

Display:
- Success
- Green circle with checkmark
- Grooming tactic spotted
- "Claiming to know you and rushing you for a photo is a red flag, not a coincidence."
- "+100 XP · Advanced guardian"
- Optional Restart Simulation button

Visual requirements:
- Pale green background
- Green success elements
- White rounded explanation card
- Clear XP reward

The screen must accept:

onRestart: () -> Unit

If a Restart Simulation button is included, call onRestart when it is tapped.

The XP reward is hardcoded display text. Do not calculate or store XP.

SCREEN 6: RETRY

Display:
- Try again
- Warning icon
- That wasn’t safe
- "Online strangers who ask for a photo right away are testing if you’ll say yes. It’s never \"no big deal.\""
- Retry simulation button

Visual requirements:
- Pale pink or warning-colored background
- Orange warning elements
- White rounded explanation card
- Dark orange or red Retry Simulation button

The screen must accept:

onRetry: () -> Unit

Call onRetry when the Retry Simulation button is tapped.

You may create:
- DecisionScreen.kt
- SuccessScreen.kt
- RetryScreen.kt
- DecisionButton.kt
- ResultCard.kt

Use hardcoded text and mock data.

Rules:
- Do not implement navigation.
- Do not edit MainActivity.
- Do not edit SocialSentryApp.
- Do not create a ViewModel.
- Do not create a backend.
- Do not create a database.
- Do not create JSON parsing.
- Do not add networking.
- Do not add authentication.
- Do not add DataStore or SharedPreferences.
- Do not calculate or save XP.
- Do not implement a real timer.
- Do not modify Gradle files.
- Do not modify SDK versions.
- Do not modify the package name.
- Do not add dependencies.
- Do not restructure the project.
- Do not edit unrelated files.
- Use existing Android or Material icons.
- Keep the code easy for beginner developers to understand.

If the project uses Jetpack Compose, add previews for the three screens if previews already work in the project.

Before making changes:
1. Inspect the project.
2. State which files you will create or modify.
3. Confirm that no Gradle changes are needed.

After making changes:
1. Check the code for compilation errors.
2. List all files created or modified.
3. Explain how each screen can be previewed or tested.
4. Confirm the callback names.
5. Report build errors without upgrading Gradle or dependencies.

Testing Your Work

If Compose previews work, preview each screen independently.

Decision screen test

Verify:

1. The screen has a dark background.
2. The question is visible.
3. Both decision buttons are visible.
4. The safe button calls onSafeChoice.
5. The unsafe button calls onUnsafeChoice.

Success screen test

Verify:

1. The pale green background is visible.
2. The success icon is visible.
3. The explanation card is readable.
4. The +100 XP message is visible.
5. The Restart button calls onRestart, if included.

Retry screen test

Verify:

1. The warning-colored background is visible.
2. The warning icon is visible.
3. The explanation text is readable.
4. The Retry Simulation button is visible.
5. The button calls onRetry.


If previews do not work, do not spend time repairing previews. Tell the product manager that the screens need to be connected before visual testing.

Your Testing Checklist

Before saying the assignment is complete:

[ ] Gradle Sync still succeeds
[ ] The project builds
[ ] Decision screen displays correctly
[ ] Both decision buttons are clickable
[ ] Success screen displays correctly
[ ] Try Again screen displays correctly
[ ] Retry button is clickable
[ ] All text is readable
[ ] Text is not cut off
[ ] Callback names match the assignment
[ ] XP is hardcoded and not stored
[ ] Timer is visual only
[ ] No Gradle files were changed
[ ] No dependencies were added
[ ] No unrelated files were changed

Your Deliverables

When finished, provide:

1. DecisionScreen.kt
2. SuccessScreen.kt
3. RetryScreen.kt
4. Any reusable UI component files created
5. Working safe and unsafe choice callbacks
6. Working retry callback
7. Optional restart callback
8. A compiling GitHub branch
9. A list of changed files
10. Screenshots or previews, if available


Your branch must be:

dev-3-results

How to Submit Your Work

Commit and push your work:

git add .
git commit -m "feat: build decision and result screens"
git push origin dev-3-results


Then send the product manager this message:

Developer 3 work is ready.

Branch:
dev-3-results

Created or modified:
- DecisionScreen.kt
- SuccessScreen.kt
- RetryScreen.kt
- List any additional component files here

Callbacks available:
- onSafeChoice
- onUnsafeChoice
- onRetry
- onRestart

Build result:
Successful / Not tested / Failed

XP implementation:
Hardcoded display text only

Timer implementation:
Visual icon only

Gradle files changed:
No

Dependencies added:
No

Known problems:
None / Describe the problem


Do not merge the branch yourself.

The product manager will merge the branch and Developer 2 will connect the callbacks.

Definition of Done

Your assignment is complete when:

The Decision screen closely resembles the mockup.
Both decision buttons expose the correct callbacks.
The Success screen displays the educational explanation and XP reward.
The Try Again screen displays the warning and retry button.
All content uses hardcoded text.
The code is pushed to dev-3-results.
The project still builds.
No Gradle, dependency, or SDK versions were changed.
Developer 2 can connect the screens without rewriting them.

Your responsibility is the final three screens and their buttons.

Developer 2 is responsible for deciding which screen appears after each button is pressed.


### Simple handoff summary

Dev 3 builds:
DecisionScreen.kt
SuccessScreen.kt
RetryScreen.kt

Dev 3 uses:
Hardcoded text
Visual timer icon
Hardcoded +100 XP

Dev 3 does not build:
Navigation
Backend
Database
ViewModel
Real timer
XP storage

Dev 3 gives Dev 2:
onSafeChoice
onUnsafeChoice
onRetry
onRestart
