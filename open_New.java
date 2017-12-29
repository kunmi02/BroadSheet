package com.example.andriod.broadsheet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;

public class open_New extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open__new);
    }
    public void generate(View view){
    //get the number of courses
        EditText courseField = (EditText) findViewById(R.id.course_num);
        Editable courseEditable = courseField.getText();
        String course_Number = courseEditable.toString();
        // GET THE STUDENT NUMBER
        EditText stdField = (EditText) findViewById(R.id.std_num);
        Editable stdEditable = stdField.getText();
        String student_Number = stdEditable.toString();



        Intent intent = new Intent(this,inputscreen.class);
        intent.putExtra("row",student_Number);
        intent.putExtra("column",course_Number);
        startActivity(intent);

    }

}
