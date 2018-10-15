package com.example.gabriel.myapplication

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.typeText
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.rule.ActivityTestRule
import android.view.View
import org.junit.After
import org.junit.Before

import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test

class HomeActivityTest {

    @Rule @JvmField
    var activityTestRule = ActivityTestRule(HomeActivity::class.java)

    lateinit var home : HomeActivity

    @Before
    fun setUp() {
        home = activityTestRule.activity
    }

    @Test
    fun testLaunch() {
        val settingsButton : View
        val accountButton: View
        val featuredButton: View
        val searchButton: View

        settingsButton = home.findViewById(R.id.settingsButton)
        accountButton = home.findViewById(R.id.myAccountButton)
        featuredButton = home.findViewById((R.id.universityButton))
        searchButton = home.findViewById(R.id.searchButton)


        assertNotNull(settingsButton)
        assertNotNull(accountButton)
        assertNotNull(featuredButton)
        assertNotNull(searchButton)

        settingsButton.hasOnClickListeners()
        accountButton.hasOnClickListeners()
        featuredButton.hasOnClickListeners()
        searchButton.hasOnClickListeners()

    }


    @After
    fun tearDown() {
    }
}