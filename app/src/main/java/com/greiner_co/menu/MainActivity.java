package com.greiner_co.menu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void printToLogs(View view) {
        // Find first menu item TextView and print the text to the logs
        TextView firstMenuTextView = (TextView) findViewById(R.id.menu_item_1);
        Log.v("MainActivity.java", firstMenuTextView.getText().toString());
        // Find second menu item TextView and print the text to the logs
        TextView secondMenuTextView = (TextView) findViewById(R.id.menu_item_2);
        Log.v("MainActivity.java", secondMenuTextView.getText().toString());
        // Find third menu item TextView and print the text to the logs
        TextView thirdMenuTextView = (TextView) findViewById(R.id.menu_item_3);
        Log.v("MainActivity.java", thirdMenuTextView.getText().toString());
    }
}
