# Dev 3 (Sherbaz) — Decision & Result Screens

These 5 files are your finished assignment: the Decision, Success, and Retry
screens plus two small reusable pieces (`DecisionButton`, `ResultCard`).

## What's in here
- `ui/screens/DecisionScreen.kt`
- `ui/screens/SuccessScreen.kt`
- `ui/screens/RetryScreen.kt`
- `ui/components/DecisionButton.kt`
- `ui/components/ResultCard.kt`

Every callback name matches the contract exactly: `onSafeChoice`,
`onUnsafeChoice`, `onRestart`, `onRetry`. Nothing here touches
`MainActivity.kt`, `SocialSentryApp.kt`, navigation, a database, a
ViewModel, or Gradle files — per the assignment rules. All text is
hardcoded. The timer is a plain emoji glyph (visual only, no countdown
logic) and every icon used (`Lock`, `Check`, `Warning`, `Star`) is a
default/core Material icon, so no new dependency is needed.

## One assumption you may need to fix
These files use the package name `com.txstshipaton.socialsentry`
(top line of each file, and the `import com.txstshipaton.socialsentry...`
lines). If the real shared project (or the one you create yourself) uses a
different package name, just find-and-replace `com.txstshipaton.socialsentry`
with the real one in all 5 files — that's the only change needed.

## Where these files need to end up
Once you have a real Android Studio Compose project open, move these into:

```
app/src/main/java/<your package, with dots turned into folders>/ui/screens/DecisionScreen.kt
app/src/main/java/<your package, with dots turned into folders>/ui/screens/SuccessScreen.kt
app/src/main/java/<your package, with dots turned into folders>/ui/screens/RetryScreen.kt
app/src/main/java/<your package, with dots turned into folders>/ui/components/DecisionButton.kt
app/src/main/java/<your package, with dots turned into folders>/ui/components/ResultCard.kt
```

(Android Studio's Project view lets you just drag-and-drop these into the
right package folders — it'll offer to fix the package line automatically.)

## How to see them without running the whole app
Open any of the three screen files in Android Studio. Each one has its own
`@Preview` function at the bottom (e.g. `DecisionScreenPreview`). Click the
"Split" or "Design" view in the top-right of the editor and Android Studio
will render that screen right there — no need to run the app, no
navigation, no MainActivity changes required.

## Committing your work
1. In GitHub Desktop, review the changed files (should be these 5 `.kt`
   files, plus this one).
2. Write a summary like: `feat: build decision and result screens`
3. Click "Commit to Sherbaz".
4. Click "Push origin" (top right) to push to GitHub.

Then let the product manager (Shayan) know Dev 3's work is ready on your
branch, per the handoff template at the bottom of
`Decision and Result Screen.md`.
