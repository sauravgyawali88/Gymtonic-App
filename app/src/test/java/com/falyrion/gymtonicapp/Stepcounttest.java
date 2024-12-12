package com.falyrion.gymtonicapp;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class StepCountGraphTest {

    @Rule
    public ActivityScenarioRule<MainActivity> activityRule =
            new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void testStepCountDisplay() {
        // Verify step count is visible
        onView(withId(R.id.stepCountTextView)).check(matches(isDisplayed()));

        // Optionally, verify default text value
        onView(withId(R.id.stepCountTextView)).check(matches(withText("Steps: 0")));
    }

    @Test
    public void testGraphDisplay() {
        // Verify graph view is visible
        onView(withId(R.id.stepGraphView)).check(matches(isDisplayed()));
    }
}
