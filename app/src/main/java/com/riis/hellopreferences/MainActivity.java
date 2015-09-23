package com.riis.hellopreferences;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    private static String USERLOGIN = "godfreynolan";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UserPreferences uPref = new UserPreferences();
        uPref.saveSharedPreferences(this, USERLOGIN);

        TextView myTextView = (TextView) findViewById(R.id.txt_field);
        myTextView.setText(uPref.getSharedPreferences(this));
    }





}
