package com.cocosw.bottomsheet.example;

import android.test.ActivityInstrumentationTestCase2;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

public class MainTest extends ActivityInstrumentationTestCase2<Main> {

    public MainTest() {
        super(Main.class);
    }

    @Override
    public void setUp() throws Exception {
        super.setUp();
        getActivity();
    }

    public void testDisplayed() {
        onView(withId(R.id.listView)).check(matches(isDisplayed()));
    }


    @Override
    public void tearDown() throws Exception {
        super.tearDown();
    }
}