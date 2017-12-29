package com.example.andriod.broadsheet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.*;
import android.widget.ArrayAdapter;
//import android.widget.TextView;
import java.util.ArrayList;

public class inputscreen extends AppCompatActivity {
    //TextView tvView;
    String row,column;
    String Student_names[];
    LinearLayout ll;
    EditText editText;
    //ArrayList<String> StudentNameList;
    int std_num;
    String name;
    EditText user;
    Button btn;
    String ag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inputscreen);

        //ll = (LinearLayout) findViewById(R.id.linearlayout);
        Intent intent=getIntent();
        row=intent.getStringExtra("row");
        column=intent.getStringExtra("column");
        std_num=Integer.parseInt(row);
        //int cos_num=Integer.parseInt(column);
        //String student_list[];
        //TextView[] textViewArray = new TextView[std_num];
       // EditText[] editarray=new EditText[std_num];
        //user=(EditText)findViewById(R.id.user_text);
        TextView tvView = (TextView) findViewById(R.id.tvView);
      //  for (int i=0; i<std_num; i++) { //loop to create editText in a linear layout.
            //tvView = new TextView(this);
                //editText= new EditText(this);
           // editText.setHint("Student name" + (i + 1));
            //ll.addView(editText);
            //i++;
        //}


    }
        ArrayList<String> StudentNameList=new ArrayList<String>();
    //ListView animalList = (ListView) findViewById(R.id.listViewAnimals);
        public void addData(View view){
            user=(EditText)findViewById(R.id.user_text);
            ag=user.getText().toString().trim();
            //btn=(Button)findViewById(R.id.addon);
            if(ag.length() != 0) {
                StudentNameList.add(ag);
                ArrayAdapter<String> arrayAdapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, StudentNameList);
                StudentNameList.setAdapter(arrayAdapter);
                user.setText(""); // adds text to arraylist and make edittext blank again

            }
        }
    public  void subject(View view){
            //addStudent();
        Intent intent = new Intent(this,Course_Input.class);
        //intent.putExtra("row",student_Number);
        intent.putStringArrayListExtra("Student_Names",StudentNameList);
       startActivity(intent);


    }
    void addStudent(){
        for(int i=0; i<std_num;i++) { //loop to add the student names in arraylist
            //editText= new EditText(this);
            StudentNameList.add("add this mofo");
        }
        }
}
