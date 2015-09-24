package com.riis.hellopreferences;

import android.app.Activity;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import static org.hamcrest.CoreMatchers.is;


import static org.junit.Assert.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class UserPreferencesTest {

    public UserPreferences tUserPreferences = Mockito.mock(UserPreferences.class);

    private Activity tActivity;

    @Before
    public void setUp() {
            Mockito.when(tUserPreferences.getSharedPreferences(tActivity)).thenReturn("true");
    }

    @Test
    public void downloadUrlTest_ReturnsTrue() {
        assertThat(tUserPreferences.getSharedPreferences(tActivity), is("true"));
    }
}

