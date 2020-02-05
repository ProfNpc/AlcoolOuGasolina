package com.belval.aoug;

import android.content.Context;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;

import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class MainActivityInstrumentedTest {
    @Test
    public void possuiCampoEtanol() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();

        String packageName = appContext.getPackageName();

        int id = getResourceId("editAlcool");
        assertNotEquals(id, 0);
        //onView(withId(id)).perform(click());;

        //assertEquals("com.belval.aoug", appContext.getPackageName());
    }

    @Test
    public void possuiCampoGasolina() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();

        String packageName = appContext.getPackageName();

        int id = getResourceId("editGasolina");
        assertNotEquals(id, 0);
        //onView(withId(id)).perform(click());

        //assertEquals("com.belval.aoug", appContext.getPackageName());
    }

    private static int getResourceId(String id) {
        Context targetContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        String packageName = targetContext.getPackageName();
        return targetContext.getResources().getIdentifier(id, "id", packageName);
    }
}
