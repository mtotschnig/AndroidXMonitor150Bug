package com.example.myapplication

import android.content.Intent
import androidx.test.core.app.ActivityScenario
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    //This test should fail but it does not with Androidx Test Monitor 1.5.0
    fun appIsAlive() {
        val startIntent = Intent( InstrumentationRegistry.getInstrumentation().targetContext.applicationContext, MainActivity::class.java)
        ActivityScenario.launch<MainActivity>(startIntent)
    }
}