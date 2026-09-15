package com.example.edusafe_safetyeducationforteenagers

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.edusafe_safetyeducationforteenagers.ui.theme.EduSafeSafetyEducationForTeenagersTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EduSafeSafetyEducationForTeenagersTheme {
                SocialSentryApp()
            }
        }
    }
}
