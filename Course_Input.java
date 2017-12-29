package com.example.andriod.broadsheet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class Course_Input extends AppCompatActivity {
        String row, column;
        String Course_list[];
        LinearLayout ll;
        EditText editText;
        ArrayList<String> NameList;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_course__input);
            Intent intent = getIntent();
            NameList = intent.getStringArrayListExtra("Student_Names");

            ListView animalList = (ListView) findViewById(R.id.listViewAnimals);


            NameList = new ArrayList<String>();
            //inputscreen toadd=new inputscreen();

            // getAnimalNames();
           // addStudent();
            // Create The Adapter with passing ArrayList as 3rd parameter
            ArrayAdapter<String> arrayAdapter =new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, NameList);
            // Set The Adapter
            animalList.setAdapter(arrayAdapter);

        }
    }
