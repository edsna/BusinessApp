package com.edsonz.domains.trincoll.edu.businessapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;  //Allows click events in the app
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView hyperLink; //defines hyperLink variable
    Spanned text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hyperLink = (TextView) findViewById(R.id.myWebsite); //Assigns var hyperLink to TextView in XML
        text = Html.fromHtml("<a href='https://www.android-examples.com//'>    Visit Website</a>");

        hyperLink.setMovementMethod(LinkMovementMethod.getInstance());
        hyperLink.setText(text);
    }
}
