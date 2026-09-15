# Developer 1 — Implementation Notes

## Branch
`Adeel`

## Gradle changes

Added to `app/build.gradle.kts` (Module :app), inside the `dependencies { }` block:

```kotlin
implementation("androidx.navigation:navigation-compose:2.7.7")
implementation("androidx.compose.material:material-icons-extended:1.7.8")
```

- **navigation-compose** — added per the PM's instruction to use Jetpack Compose with Navigation UI.
- **material-icons-extended** — required because the screens use `Icons.Filled.Shield` and `Icons.Filled.Flag`, which are not included in the default Compose icon set. Without this dependency, the project fails to compile with `Unresolved reference` errors on those icons.

No other Gradle files, SDK versions, or Kotlin/plugin versions were changed. Min SDK set to **API 26 (Android Oreo 8.0)** per the PM's spec.

## Final screens

### 1. BriefingScreen.kt
Entry point of the simulation.
- Displays the app name ("Social Sentry"), a shield icon, and a level badge ("Level 1 · Novice guardian")
- Includes a progress bar at the top showing simulation progress (33%)
- "Start simulation" button triggers `onStartSimulation: () -> Unit`

### 2. IcebreakerScreen.kt
First chat message screen — low-stakes contact from the stranger.
- Shows `ProfileHeader` (avatar initials + username: **NoobMaster69**)
- Chat bubble: "That clutch play in your forum post was insane. What rank are you?"
- Educational label under the bubble: "Friendly compliment, low stakes"
- Progress bar at 66%
- "Continue" button (and the chat bubble itself is also tappable) triggers `onContinue: () -> Unit`

### 3. EscalationScreen.kt
Second chat screen — the risk escalation moment.
- Same `ProfileHeader` as Icebreaker
- First chat bubble (normal): "Wait, I think I go to your school too"
- Second chat bubble (warning-colored, orange outline): "Send a pic of what you look like right now, just to check. No big deal"
- Warning label with flag icon: "Unverified claim + urgent ask"
- Progress bar at 100%
- "Continue" button triggers `onContinue: () -> Unit`, handing off to the Decision screen (owned by Developer 3)

## Reusable components

- **ProfileHeader.kt** — circular avatar showing the username's initials (derived from capital letters, e.g. "NoobMaster69" → "NM") plus the username text
- **ChatBubble.kt** — chat message bubble; `isWarning = true` switches it to a light warning color with an orange border
- **LevelBadge.kt** — pill-shaped badge showing the current level text
- **SimulationProgressBar.kt** — thin top-of-screen progress bar, takes a `progress: Float` between 0f and 1f

## Callbacks exposed

| Screen | Callback |
|---|---|
| BriefingScreen | `onStartSimulation: () -> Unit` |
| IcebreakerScreen | `onContinue: () -> Unit` |
| EscalationScreen | `onContinue: () -> Unit` |

No navigation logic, ViewModel, database, or backend was implemented in this part — all data is hardcoded per the MVP scope, and navigation will be wired up by the PM.

## Build result
Successful — all three screens compile and render correctly in Compose previews.

## Known issues
None.
