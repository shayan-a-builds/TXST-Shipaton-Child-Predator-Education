

# Developer 4 Assignment: Presentation, Testing, and Demo

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

You are responsible for preparing the presentation and making sure the team can successfully demonstrate the application.

You are not responsible for building the main Android screens or navigation.

Your main responsibilities are:

1. Create the presentation
2. Prepare the speaking script
3. Test the finished application
4. Capture screenshots
5. Help prepare the final APK
6. Record a backup demonstration video

Your goal is to make the team ready to present, even if the live demonstration has a technical problem.

---

# You Do Not Need a Coding Branch

Most of your work will be outside the Android code.

You can work in:

PowerPoint
Google Slides
Canva
Microsoft Word
Google Docs


If the product manager wants presentation files stored in GitHub, use:

dev-4-presentation


Otherwise, keep the presentation in the team’s shared folder.

Do not edit Android code unless the product manager specifically asks you to help with a small problem.

Your Main Deliverables

You must prepare:

1. A short presentation
2. A simple speaking script
3. Final application screenshots
4. A completed testing checklist
5. The final APK or confirmation that it works
6. A backup screen recording
7. A backup plan if the live demo fails

Part 1: Create the Presentation

Keep the presentation short.

Use approximately:

5 to 7 slides


The total presentation should be understandable in approximately:

3 to 5 minutes


Do not make a long presentation with heavy paragraphs.

Use:

Short sentences
Large headings
Screenshots
Simple diagrams
Clear problem and solution statements
Presentation Structure
Slide 1: Project Introduction
Title
Social Sentry

Subtitle
An interactive safety simulation that teaches young users how to recognize risky online behavior.

Include
Project name
Team name
Team members
Hackathon name, if required
Social Sentry logo or shield icon
Speaker message
Social Sentry is an interactive Android application that helps young users recognize warning signs in online conversations through short, realistic simulations.

Slide 2: The Problem
Heading
The Problem

Main points
- Risky online conversations can begin with harmless compliments.
- A stranger may quickly claim a personal connection.
- Young users may not recognize pressure, urgency, or requests for private information.
- Traditional safety lessons may not provide realistic decision practice.

Speaker message
Online safety risks do not always begin with obvious threats. A conversation may start with a friendly compliment and then quickly become personal. Social Sentry helps users practice recognizing that escalation before it becomes dangerous.


Keep this slide simple and general.

Do not include disturbing images or graphic examples.

Slide 3: Our Solution
Heading
Our Solution

Main points
- Short interactive safety scenarios
- Realistic conversation simulations
- Safe and unsafe decision options
- Immediate educational feedback
- Positive rewards for identifying warning signs

Speaker message
Instead of only telling users what is safe, Social Sentry places users inside a simulated conversation. Users make a decision and immediately learn why that decision was safe or unsafe.

Slide 4: How the App Works
Heading
How Social Sentry Works

Show this flow
Briefing
    ↓
Friendly Message
    ↓
Conversation Escalation
    ↓
User Decision
    ├── Safe Choice → Success and +100 XP
    └── Unsafe Choice → Explanation and Retry

Speaker message
The user begins with a short briefing. A simulated account starts with a friendly message, then escalates by making an unverified claim and requesting private information. The user chooses how to respond and receives immediate educational feedback.


Use a simple flow diagram or arrows.

Do not create a complicated technical diagram for this slide.

Slide 5: Application Screens
Heading
The Social Sentry Experience


Add screenshots of:

1. Briefing screen
2. Icebreaker screen
3. Escalation screen
4. Decision screen
5. Success screen
6. Try Again screen


If six screenshots do not fit clearly, use two slides:

Slide 5: Simulation Screens
Slide 6: Decision Outcomes

Speaker message
The experience is designed as a short, focused lesson. The interface uses clear colors and immediate feedback to help users understand the difference between a safe response and an unsafe response.


Developer 4 must wait until the app is integrated before taking the final screenshots.

Placeholder images may be used while creating the presentation layout.

Slide 6: Technical Build
Heading
How We Built It

Main points
- Native Android application
- Developed in Android Studio
- Kotlin
- Jetpack Compose or the existing project UI system
- Hardcoded scenario content for the hackathon MVP
- Simple screen-state navigation
- Offline-first demonstration
- No account or personal data required


Only say Jetpack Compose if the final project actually uses Jetpack Compose.

If the project uses XML layouts, replace Jetpack Compose with:

Android XML layouts

Simple technical flow
User taps a button
        ↓
Application changes the current screen
        ↓
Next simulation screen appears
        ↓
Decision sends user to Success or Try Again

Speaker message
We built Social Sentry as a native Android application. The hackathon version uses local scenario content and simple screen-state navigation, which allows the entire experience to work without requiring an internet connection or user account.

Slide 7: Future Vision
Heading
What Comes Next

Main points
- More online safety scenarios
- Additional levels and achievements
- Parent and educator resources
- Reviewed scenario content
- Anonymous learning progress
- Accessibility improvements
- Additional languages

Speaker message
The current application demonstrates one complete safety lesson. Future versions could include additional scenarios, learning levels, accessibility support, and resources for educators and families.


Do not claim that future features already work.

Clearly separate:

Current MVP


from:

Future roadmap

Part 2: Prepare the Demo Script

The live application demonstration should take approximately:

60 to 90 seconds


Use this sequence.

Demo Step 1: Open the App

Say:

The user begins at Level 1 as a Novice Guardian.


Tap:

Start simulation

Demo Step 2: Show the Icebreaker

Say:

The conversation begins with a friendly compliment designed to establish trust.


Continue to the next screen.

Demo Step 3: Show the Escalation

Say:

The account then claims to attend the user’s school and immediately requests a photo. Social Sentry identifies the unverified claim and urgent request as warning signs.


Continue to the Decision screen.

Demo Step 4: Demonstrate the Unsafe Choice

Tap:

Okay sure, just one sec


Say:

If the user selects the unsafe response, the application immediately explains why the request is risky and allows the user to retry.


Tap:

Retry simulation

Demo Step 5: Demonstrate the Safe Choice

Tap:

Block and report


Say:

When the user identifies the safe response, Social Sentry explains the warning signs and rewards the user with 100 XP.


End the application demonstration on the Success screen.

Part 3: Test the Finished Application

After Developers 1, 2, and 3 finish, the product manager will combine their work.

You must test the integrated application.

Do not test only one path.

Test both the safe path and the unsafe path.

Application Testing Checklist
Application Startup
[ ] The application installs successfully
[ ] The application opens without crashing
[ ] The Briefing screen appears first
[ ] The screen fits the demonstration device
[ ] Text is readable
[ ] Buttons are visible

Safe Path
[ ] Start Simulation opens the Icebreaker screen
[ ] Icebreaker continues to Escalation
[ ] Escalation continues to Decision
[ ] Block and Report opens the Success screen
[ ] Success explanation is visible
[ ] +100 XP is visible
[ ] Restart works, if a Restart button exists

Unsafe Path
[ ] The unsafe choice can be selected
[ ] The unsafe choice opens the Try Again screen
[ ] The safety explanation is visible
[ ] Retry Simulation returns to the Decision screen
[ ] The user can select Block and Report after retrying

Visual Testing
[ ] Dark screens resemble the mockup
[ ] Success screen has a pale green background
[ ] Try Again screen has a pale warning background
[ ] Chat bubbles are readable
[ ] Buttons are not cut off
[ ] Text does not overlap
[ ] Icons are visible
[ ] Screen titles are visible

Device Testing
[ ] The app works on the presentation emulator
[ ] The app works on a physical Android device, if available
[ ] The app works without internet
[ ] The app still works after closing and reopening it
[ ] The device is charged
[ ] Notifications are disabled before presenting

Reporting Bugs

If you find a problem, send the product manager a short message.

Use this format:

Bug:

Screen:
Decision Screen

Action:
Tapped Block and Report

Expected:
Success screen should appear

Actual:
Application remained on the Decision screen

Frequency:
Happens every time

Screenshot:
Attached


Do not try to redesign the application yourself.

Report:

Which screen has the problem
What action caused it
What should have happened
What actually happened
Whether it happens every time

The responsible developer can then fix the issue quickly.

Part 4: Capture Final Screenshots

Once the app is working, capture these screenshots:

1. Briefing screen
2. Icebreaker screen
3. Escalation screen
4. Decision screen
5. Success screen
6. Try Again screen

Screenshot rules

Before taking screenshots:

1. Close unnecessary applications.
2. Disable visible notifications.
3. Make sure the Android emulator is fully visible.
4. Make sure no error message appears.
5. Use the same device size for every screenshot.
6. Use final application screens, not mockup placeholders.


Save the screenshots with clear names:

01-briefing.png
02-icebreaker.png
03-escalation.png
04-decision.png
05-success.png
06-try-again.png


Use these screenshots in the presentation.

Part 5: Prepare the Final APK

The product manager or Developer 2 may generate the APK.

You must help confirm that the APK works.

The debug APK will normally be located at:

app/build/outputs/apk/debug/app-debug.apk


Rename a copy to:

SocialSentry-Hackathon.apk


Do not rename or move the original file if Android Studio still needs it.

APK test
1. Copy the APK to the demonstration device.
2. Install the APK.
3. Open the installed application.
4. Test the safe path.
5. Test the unsafe path.
6. Close and reopen the application.
7. Confirm the application still launches.


Store a copy in:

Google Drive
OneDrive
USB drive
Team laptop


Keep at least two copies of the final APK.

Part 6: Record a Backup Demonstration

A backup recording protects the presentation if:

The emulator stops working
Android Studio crashes
The demonstration device disconnects
The projector has a problem
The app unexpectedly crashes
There is not enough presentation time

Record a complete walkthrough.

Recording sequence
1. Open Social Sentry.
2. Start the simulation.
3. Show the Icebreaker screen.
4. Show the Escalation screen.
5. Open the Decision screen.
6. Select the unsafe choice.
7. Show the Try Again explanation.
8. Retry.
9. Select Block and Report.
10. Show the Success screen and +100 XP.


Keep the recording approximately:

60 to 90 seconds


Use a simple filename:

SocialSentry-Backup-Demo.mp4


Test the video after recording it.

Confirm:

[ ] The video opens
[ ] The complete app is visible
[ ] The text is readable
[ ] No personal notifications appear
[ ] The final Success screen is visible


Keep a copy of the video on the presentation laptop and in cloud storage.

Part 7: Prepare the Presentation Environment

Before the team presents:

[ ] Presentation opens correctly
[ ] Fonts appear correctly
[ ] Screenshots are visible
[ ] Backup demonstration video plays
[ ] Android emulator is already open
[ ] App is already installed
[ ] App is reset to the Briefing screen
[ ] Presentation device is charged
[ ] Charger is available
[ ] Notifications are disabled
[ ] Internet is not required
[ ] Final APK is backed up


Do not begin the presentation with Android Studio compiling the project.

The application should already be:

Installed
Open
Ready on the Briefing screen

Part 8: Final Team Speaking Roles

The team can divide the presentation like this.

Speaker 1: Problem
Explain the online safety problem and why interactive learning matters.

Speaker 2: Solution
Explain Social Sentry and the simulation process.

Speaker 3: Technical Build
Briefly explain Android Studio, Kotlin, the UI, and simple screen-state navigation.

Speaker 4: Live Demo and Future Vision
Demonstrate both choices and finish with future possibilities.


If only one person presents, use this order:

Problem
Solution
Live demonstration
Technical summary
Future vision

Coding Agent Instructions

Most of your work does not require a coding agent.

You may give the following instructions to an AI assistant to help create presentation content.

You are helping prepare a short hackathon presentation for an Android application called Social Sentry.

Social Sentry is an interactive educational simulation that helps young users recognize warning signs in risky online conversations.

The application flow is:

1. Briefing
2. Friendly icebreaker message
3. Unverified personal claim and urgent request
4. User decision
5. Safe choice produces a success explanation and +100 XP
6. Unsafe choice produces an educational warning and retry option

Create a presentation with 5 to 7 slides.

Required slides:

1. Social Sentry introduction
2. The problem
3. Our solution
4. How the simulation works
5. Application screenshots
6. Technical build
7. Future vision

Presentation rules:

- Keep text short.
- Use large headings.
- Avoid long paragraphs.
- Leave placeholders for six final app screenshots.
- Clearly separate current features from future ideas.
- Do not claim that unfinished features already work.
- Do not claim that the app uses a backend, database, AI, or authentication.
- Describe the MVP as a native Android application with local scenario content.
- Use simple language suitable for a short hackathon pitch.
- Include short speaker notes for each slide.
- Keep the complete presentation between 3 and 5 minutes.

Also create a 60 to 90-second live demonstration script showing:

1. Start Simulation
2. Icebreaker
3. Escalation
4. Unsafe choice
5. Try Again
6. Safe choice
7. Success and +100 XP

What You Must Not Do

Do not:

Change Gradle files
Change Android SDK versions
Change the package name
Add dependencies
Add a backend
Add a database
Add authentication
Add cloud services
Redesign the application
Edit screen files without permission
Merge developer branches
Claim unfinished features are complete
Wait until the last minute to test the demo


Do not spend time creating:

Complicated animations
A large business plan
Detailed financial projections
A production database diagram
A long technical architecture presentation
More than seven slides unless the event requires it

The audience needs to understand:

The problem
The solution
The working application
The educational value
The future potential

Your Deliverables

When finished, provide:

1. Final presentation
2. Speaker notes
3. 60 to 90-second demo script
4. Six final screenshots
5. Completed testing checklist
6. Final APK confirmation
7. Backup demo recording
8. List of discovered bugs
9. Presentation backup copy


Recommended filenames:

SocialSentry-Presentation.pptx
SocialSentry-Demo-Script.md
SocialSentry-Testing-Checklist.md
SocialSentry-Hackathon.apk
SocialSentry-Backup-Demo.mp4

How to Submit Your Work

Send the product manager this message:

Developer 4 work is ready.

Presentation:
Complete / In progress

Slides completed:
- Introduction
- Problem
- Solution
- App flow
- Screenshots
- Technical build
- Future vision

Final screenshots:
Complete / Waiting for app integration

Application testing:
Passed / Issues found / Not tested

Safe path:
Passed / Failed

Unsafe path:
Passed / Failed

Retry:
Passed / Failed

APK:
Created and tested / Created but not tested / Not created

Backup video:
Recorded and tested / Not recorded

Presentation backup:
Saved locally and in shared storage

Known problems:
None / List the problems

Definition of Done

Your assignment is complete when:

The presentation clearly explains the problem and solution.
The presentation contains final application screenshots.
The speaking script is short and understandable.
Both decision paths have been tested.
The APK has been installed and opened successfully.
A backup demonstration video has been recorded and tested.
The presentation and video are available offline.
The demonstration can be completed in 60 to 90 seconds.
The presentation clearly distinguishes working features from future plans.

Your responsibility is to make sure the team can confidently explain and demonstrate Social Sentry.


## Simple handoff summary

Dev 4 creates:
Presentation
Speaking script
Screenshots
Test checklist
Backup video

Dev 4 tests:
Safe path
Unsafe path
Retry button
Final APK

Dev 4 does not build:
Android screens
Navigation
Backend
Database
Authentication

Dev 4 gives the team:
A clear pitch
A tested demonstration
A backup if the live demo fails
