# Social Sentry

## What This Is

Social Sentry is a small Android app built to teach kids and teens how to recognize online grooming before it goes too far. Instead of just reading a warning, the user walks through a realistic chat with a stranger online. It starts friendly, then slowly escalates into a request for a photo. At the key moment, the user has to make a choice: go along with it, or block and report. Picking wrong shows exactly why that choice was dangerous and lets them try again. Picking right shows why it worked.

This was built in one day for a hackathon by a small team, each person owning a piece: one dev built the intro and chat screens, another built the decision and outcome screens, and the logic connecting all six screens together into one working app was handled separately. Everything is hardcoded on purpose. No backend, no login, no database. The goal was a working, testable demo, not a production app.

## Try It On Your Phone (Easiest Way)

You don't need Android Studio or any code to try the app. Just download and install it directly:

1. Go to the [Releases page](../../releases) of this repo.
2. Under the latest release, download `app-debug.apk` to your phone.
3. Open the downloaded file. Your phone will warn you it's from an unknown source since it's not from the Play Store, this is expected. Tap **Settings**, then allow installs from that app (Files, Chrome, Drive, whatever you used).
4. Go back and tap **Install**.
5. Open the app and tap **Start simulation**.

That's it, the whole thing runs on your phone with no internet connection needed.

## Run It Yourself in Android Studio

If you want to open the actual project and run it from source:

1. Install [Android Studio](https://developer.android.com/studio) if you don't already have it.
2. Clone this repo, then open the project folder in Android Studio.
3. Wait for Gradle Sync to finish (a progress bar at the bottom of the window). This can take a few minutes the first time.
4. You need a phone to run it on. Two options:
   - **Real phone:** plug your Android phone in with a USB cable, enable USB debugging in your phone's Developer Options, and it should show up in the device dropdown at the top of Android Studio.
   - **Virtual phone (emulator):** click the **Device Manager** tab on the right side of the window. Click **Add a new device**, pick any phone (Medium Phone is a safe default), pick a system image to download if asked, and finish setup. Your new virtual device will now show up in the device dropdown at the top.
5. With a device selected in that dropdown, click the green Run (play) button near the top of the screen.
6. The app will build and launch automatically on whichever device you picked.

## Demo Video

A recorded demo namely as "Social_Sentry-Demo_Video" of the app running through the full simulation is also included in this repo, so you can see exactly how it works without installing anything yourself.
