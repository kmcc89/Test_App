package com.kevmc.test_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    /*
    This activity is started when the Send button is clicked in the Main Activity
    It takes text passed from the first activity's intent and displays it in this
    activity
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        //get the intent that was used to start this activity and extract the string
        //EXTRA_MESSAGE is the name of the
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        //Write the string contents into the text display area on this page
        TextView textView = findViewById(R.id.textView);
        textView.setText(message);
    }
}


/*


 */