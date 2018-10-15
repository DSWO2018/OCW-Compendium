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

class LogInActivityTest {

    @Rule @JvmField
    var activityTestRule = ActivityTestRule(LogInActivity::class.java)

    lateinit var aLogIn : LogInActivity

    @Before
    fun setUp() {
        aLogIn = activityTestRule.activity
    }

    @Test
    fun testLaunch() {
        val emailTextView : View
        val passwordTextView: View
        val ocwImageView: View
        val loginButton: View
        val signUpButton: View
        val guestButton: View

        emailTextView = aLogIn.findViewById(R.id.email)
        passwordTextView = aLogIn.findViewById(R.id.password)
        ocwImageView = aLogIn.findViewById((R.id.ocwImageView))
        loginButton = aLogIn.findViewById(R.id.loginButton)
        signUpButton = aLogIn.findViewById(R.id.signUpButton)
        guestButton = aLogIn.findViewById(R.id.guestButton)


        assertNotNull(emailTextView)
        assertNotNull(passwordTextView)
        assertNotNull(ocwImageView)
        assertNotNull(loginButton)
        assertNotNull(signUpButton)
        assertNotNull(guestButton)

        assert(guestButton.hasOnClickListeners())
    }

    @Test
    fun logInPetition() {
        //onView(withId(R.id.email)).perform(typeText("prueba@test.com"))
        //onView(withId(R.id.password)).perform(typeText("123456"))

    }

    @After
    fun tearDown() {
    }
}