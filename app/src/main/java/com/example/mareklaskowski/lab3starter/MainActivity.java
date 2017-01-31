package com.example.mareklaskowski.lab3starter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = new TextView(this);
        textView.setText("hello world");

        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.activity_main);
        //LayoutParams is a class to specify layout properties when adding a view to a layout
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        linearLayout.addView(textView, layoutParams);

        //TODO: change things so that TextViews are added in response to button clicks
        //TODO: populate the AutoCompleteTextView using an ArrayAdapter for String arrays
    }
}
