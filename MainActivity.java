package com.example.andriod.broadsheet;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /** Called when the user taps the new broadsheet button */
    public void open_New(View view) {
        // Do something in response to button
        Intent intent = new Intent(this,open_New.class);
        startActivity(intent);

    }
    /** Called when the user taps the EXISTING broadsheet button */
    public  void check_existing(View view){
        // Do something in response to button
        Intent intent = new Intent(this,check_existing.class);
        startActivity(intent);


    }

}
