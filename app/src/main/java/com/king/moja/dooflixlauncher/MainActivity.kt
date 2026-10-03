package com.king.moja.dooflixlauncher

import android.app.Activity
import android.content.Intent
import android.os.Bundle

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val launchIntent = Intent().apply {
            setClassName(
                "com.king.moja",
                "com.dooflixv4.in.activities.SplashActivity"
            )
        }
        startActivity(launchIntent)
        finish() // close the shortcut activity so it doesn’t stay in the stack
    }
}
