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

class CreateAccountActivityTest {

    @Rule @JvmField
    var activityTestRule = ActivityTestRule(CreateAccountActivity::class.java)

    lateinit var createAccount : CreateAccountActivity

    @Before
    fun setUp() {
        createAccount = activityTestRule.activity
    }

    @Test
    fun testLaunch() {
        val username : View
        val name: View
        val emailEdit: View
        val emailView: View
        val passwordText: View
        val passwordView: View
        val confirmPasswordText: View
        val confirmPasswordView: View
        val tosCheck: View
        val privacyPolicy: View

        username = createAccount.findViewById(R.id.usernameEditText)
        name = createAccount.findViewById(R.id.nameTextView)
        emailEdit = createAccount.findViewById((R.id.emailEditText))
        emailView = createAccount.findViewById(R.id.emailTextView)
        passwordText = createAccount.findViewById(R.id.passwordEditText)
        passwordView = createAccount.findViewById(R.id.passwordTextView)
        confirmPasswordText = createAccount.findViewById(R.id.confirmPasswordEditText)
        confirmPasswordView = createAccount.findViewById(R.id.confirmPasswordTextView)
        tosCheck = createAccount.findViewById(R.id.termsOfServiceCheckBox)
        privacyPolicy = createAccount.findViewById(R.id.privacyPolicyCheckBox)


        assertNotNull(username)
        assertNotNull(name)
        assertNotNull(emailEdit)
        assertNotNull(emailView)
        assertNotNull(passwordText)
        assertNotNull(passwordView)
        assertNotNull(confirmPasswordText)
        assertNotNull(confirmPasswordView)
        assertNotNull(tosCheck)
        assertNotNull(privacyPolicy)
    }

    @After
    fun tearDown() {
    }
}