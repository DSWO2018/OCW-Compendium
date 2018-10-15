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

class UniversityListActivityTest {

    @Rule @JvmField
    var activityTestRule = ActivityTestRule(UniversityListActivity::class.java)

    lateinit var universityList : UniversityListActivity

    @Before
    fun setUp() {
        universityList = activityTestRule.activity
    }

    @Test
    fun testLaunch() {
        val recyclerView : View


        recyclerView = universityList.findViewById(R.id.recyclerView_university)


        assertNotNull(recyclerView)
    }


    @After
    fun tearDown() {
    }
}