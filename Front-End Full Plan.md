
# Developer 1 Assignment: Opening and Chat Screens

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

Social Sentry Android Hackathon App

## Your Role

You are responsible for building the first three screens of the application:

1. Briefing screen
2. Icebreaker chat screen
3. Escalation chat screen

Focus only on making these screens look like the provided mockup.

Use hardcoded text and mock data. You do not need to build a backend, database, ViewModel, or complicated navigation.

---

# Before You Begin

The product manager will set up the Android project and GitHub repository.

Before writing code:

1. Clone or pull the latest project.
2. Switch to your assigned branch:



Open the project in Android Studio.
Allow Gradle Sync to finish.
Run the existing app once.
Confirm the app opens before making changes.

If the existing app does not build, tell the product manager immediately.

Do not change Gradle or dependency versions to fix the issue yourself.

Your Branch

Work only on:

dev-1-ui


Do not push directly to:

main

Your Responsibilities

You will build these files:

BriefingScreen.kt
IcebreakerScreen.kt
EscalationScreen.kt


You may also create small reusable UI components if needed:

ChatBubble.kt
ProfileHeader.kt
LevelBadge.kt


Do not edit the main navigation file unless the product manager specifically asks you to.

The product manager will connect your screens later.

Screen 1: Briefing Screen

Build the opening screen shown in the mockup.

Required content

Display:

Screen 1: Briefing

Social Sentry

Level 1 · Novice guardian

Start simulation

Required visual elements

The screen should include:

Dark background
Small screen label at the top
Shield or safety icon near the center
“Social Sentry” title
Light-colored level badge
Purple “Start simulation” button
Rounded button and badge corners
Comfortable spacing between elements

Use an existing Android icon if the exact shield-and-star icon is unavailable.

Do not spend too much time finding the perfect icon. A shield or security icon is acceptable for the MVP.

Required callback

The screen must accept:

onStartSimulation: () -> Unit


When the user taps the Start Simulation button, call:

onStartSimulation()


Do not decide which screen appears next. The product manager will connect that logic.

Screen 2: Icebreaker Screen

Build the first chat screen.

Required content

Display:

Screen 2: Icebreaker

CoolGamer42

That clutch play in your forum post was insane. What rank are you?

Friendly compliment, low stakes

Required visual elements

The screen should include:

Dark background
Screen label at the top
Circular placeholder avatar
Profile name beside the avatar
Thin divider under the profile header
Rounded dark chat bubble
Chat message inside the bubble
Educational label near the bottom
Spacing similar to the supplied mockup

The avatar can be a simple light gray circle.

No real image is required.

Required callback

The screen must accept:

onContinue: () -> Unit


Add a simple way to continue to the next screen.

Preferred options:

Make the chat bubble area tappable, or
Add a small “Continue” button near the bottom.

Use whichever option is easiest and clearest.

When activated, call:

onContinue()


Do not implement navigation inside the screen.

Screen 3: Escalation Screen

Build the second chat screen.

Required content

Display:

Screen 3: Escalation

CoolGamer42

Wait, I think I go to your school too

Send a pic of what you look like right now, just to check. No big deal

Unverified claim + urgent ask

Required visual elements

The screen should include:

Dark background
Screen label at the top
Same profile header as the Icebreaker screen
Same circular placeholder avatar
Divider under the profile header
First dark chat bubble
Second light warning-colored chat bubble
Orange or warning-colored risk label near the bottom
Small flag or warning icon if easily available

The second message should look visually different because the message represents the risk escalation.

Use a light cream, pale pink, or light warning color for the second bubble.

Required callback

The screen must accept:

onContinue: () -> Unit


Add a clear way to continue to the decision screen.

When activated, call:

onContinue()


Do not build the decision screen. Developer 3 owns that screen.

Use Mock Data

You do not need to wait for any other developer.

Put the text directly inside the screens or in a small mock data file.

A simple hardcoded approach is acceptable:

val username = "CoolGamer42"

val icebreakerMessage =
    "That clutch play in your forum post was insane. What rank are you?"

val escalationMessageOne =
    "Wait, I think I go to your school too"

val escalationMessageTwo =
    "Send a pic of what you look like right now, just to check. No big deal"


Do not create:

A database
Local JSON parsing
A repository
A network request
A FastAPI connection
User authentication
Real chat functionality

This application uses a fixed educational simulation for the hackathon demonstration.

Keep the Code Simple

If the project uses Jetpack Compose, use simple Compose components:

Column
Row
Box
Text
Button
Surface
Spacer
Icon


Use Modifier for:

Padding
Size
Background
Click handling
Rounded corners
Full-width buttons


Do not install a new UI library.

If the project uses XML layouts, continue using XML. Do not convert the entire project to Compose.

Reusable Components

You may create these components if doing so saves time.

ProfileHeader

The profile header should receive:

username: String


The component displays:

Circular avatar + username

ChatBubble

The chat bubble should receive:

message: String


Optionally:

isWarning: Boolean


When isWarning is false:

Use the normal dark bubble.


When isWarning is true:

Use the light warning-colored bubble.

LevelBadge

The level badge displays:

Level 1 · Novice guardian


Do not spend excessive time making reusable components. If separate screen code is faster and understandable, that is acceptable tonight.

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
ChromaDB
Ollama
Login
Cloud services
Networking
Animations requiring dependencies


Do not edit files owned by other developers unless the product manager gives permission.

Only the product manager should edit the file that connects all screens.

Coding Agent Instructions

Copy the instructions below into your AI coding agent together with the project files.

You are assisting with a small Android hackathon application called Social Sentry.

Your task is to build only the first three application screens:

1. BriefingScreen
2. IcebreakerScreen
3. EscalationScreen

First inspect the existing project and determine whether it uses Jetpack Compose or XML. Continue using the existing UI system.

Keep the implementation simple and beginner-friendly.

SCREEN 1: BRIEFING

Display:
- Screen 1: Briefing
- Shield or safety icon
- Social Sentry
- Level 1 · Novice guardian
- Purple Start simulation button

Use:
- Dark background
- Rounded button
- Rounded level badge
- Centered main content

The screen must accept:

onStartSimulation: () -> Unit

Call the callback when the Start Simulation button is tapped.

SCREEN 2: ICEBREAKER

Display:
- Screen 2: Icebreaker
- Circular placeholder avatar
- CoolGamer42
- Divider
- Dark rounded chat bubble
- "That clutch play in your forum post was insane. What rank are you?"
- "Friendly compliment, low stakes"

The screen must accept:

onContinue: () -> Unit

Provide a simple button or tappable area that calls onContinue.

SCREEN 3: ESCALATION

Display:
- Screen 3: Escalation
- Circular placeholder avatar
- CoolGamer42
- Divider
- First dark chat bubble:
  "Wait, I think I go to your school too"
- Second light warning-colored bubble:
  "Send a pic of what you look like right now, just to check. No big deal"
- Warning label:
  "Unverified claim + urgent ask"

The screen must accept:

onContinue: () -> Unit

Provide a simple button or tappable area that calls onContinue.

Use hardcoded text and mock data.

You may create:
- BriefingScreen.kt
- IcebreakerScreen.kt
- EscalationScreen.kt
- ChatBubble.kt
- ProfileHeader.kt
- LevelBadge.kt

Rules:
- Do not implement navigation.
- Do not create a ViewModel.
- Do not build the Decision screen.
- Do not build the Success screen.
- Do not build the Try Again screen.
- Do not create a backend.
- Do not create a database.
- Do not add networking.
- Do not add authentication.
- Do not modify Gradle files.
- Do not modify SDK versions.
- Do not modify the package name.
- Do not add dependencies unless absolutely necessary.
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
4. Report build errors without upgrading Gradle or dependencies.

Testing Your Work

Before telling the product manager you are finished, verify:

[ ] Gradle Sync still succeeds
[ ] The project builds
[ ] Briefing screen displays correctly
[ ] Start Simulation button is clickable
[ ] Icebreaker screen displays correctly
[ ] Escalation screen displays correctly
[ ] Text is not cut off
[ ] Buttons call callbacks
[ ] No Gradle files were changed
[ ] No unrelated files were changed


If Compose previews work, capture a screenshot of each preview.

If previews do not work, do not waste time repairing the preview system. Tell the product manager that the screens need to be connected before visual testing.

Your Deliverables

When finished, you must provide:

1. BriefingScreen.kt
2. IcebreakerScreen.kt
3. EscalationScreen.kt
4. Any reusable UI component files you created
5. A compiling GitHub branch
6. A list of changed files
7. Screenshots or previews if available
8. Short instructions for connecting each screen


Your branch must be:

dev-1-ui

How to Submit Your Work

Commit your work:

git add .
git commit -m "feat: build briefing and chat screens"
git push origin dev-1-ui


Then send the product manager this message:

Developer 1 work is ready.

Branch:
dev-1-ui

Created or modified:
- BriefingScreen.kt
- IcebreakerScreen.kt
- EscalationScreen.kt
- List any additional component files here

Build result:
Successful / Not tested / Failed

Callbacks available:
- onStartSimulation
- onContinue

Gradle files changed:
No

Known problems:
None / Describe the problem


Do not merge the branch yourself. The product manager will merge and connect the screens.

Definition of Done

Your assignment is complete when:

The first three screens closely resemble the mockup.
All screen content is visible.
Mock data is displayed correctly.
Button callbacks are available.
The code is pushed to dev-1-ui.
The project still builds.
No Gradle versions or project configuration were changed.

The screens do not need real navigation yet. The product manager will connect them to the rest of the application.


