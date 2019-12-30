package com.kevmc.test_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.kevmc.test_app.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
    Method to call when button is pressed
    a) linked to layout element by adding this method
    name to the 'onClick' property of the element
    b) Method is public, has no return type (void), and
    takes a 'View' object as argument
    c) This method takes the text value
    d) The method calls a new activity --> we need to
    create the new activity.  Right-click the project name
    and select New > Activity > Empty Activity
     */
    public void sendMessage(View view){

        //Create Intent (to start new Activity)
        Intent intent = new Intent(this, DisplayMessageActivity.class);

        //Create EditText Object to store the contents of the textbox in
        EditText editText = (EditText) findViewById(R.id.editText5);

        //Assign value of text box to a string so we can use it
        String message = editText.getText().toString();

        //Attach values to the intent
        intent.putExtra(EXTRA_MESSAGE, message);

        //Start the activity
        startActivity(intent);
    }
}
