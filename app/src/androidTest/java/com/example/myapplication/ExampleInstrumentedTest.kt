package com.example.myapplication

import android.content.Intent
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    //This test correctly fails with Androidx Test Monitor 1.5.0
    fun crashInForeground() {
        val startIntent = Intent( InstrumentationRegistry.getInstrumentation().targetContext.applicationContext, MainActivity::class.java)
        ActivityScenario.launch<MainActivity>(startIntent)
        onView(withId(R.id.foreground_crash)).perform(click())
    }

    //This test should fail but it does succeed with Androidx Test Monitor 1.5.0
    @Test
    fun crashInBackground() {
        val startIntent = Intent( InstrumentationRegistry.getInstrumentation().targetContext.applicationContext, MainActivity::class.java)
        ActivityScenario.launch<MainActivity>(startIntent)
        onView(withId(R.id.background_crash)).perform(click())
    }
}