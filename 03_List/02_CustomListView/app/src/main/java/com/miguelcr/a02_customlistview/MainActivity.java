package com.miguelcr.a02_customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ListViewCompat;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView lista;
    List<Student> studentList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista = (ListView) findViewById(R.id.list_view);

        studentList = new ArrayList<>();
        studentList.add(new Student("Michal",19,"m","https://s3.amazonaws.com/uifaces/faces/twitter/jsa/128.jpg"));
        studentList.add(new Student("Piotrek",18,"m","https://s3.amazonaws.com/uifaces/faces/twitter/jsa/128.jpg"));
        studentList.add(new Student("Wojtek",18,"m","https://s3.amazonaws.com/uifaces/faces/twitter/jsa/128.jpg"));
        studentList.add(new Student("Patryk",18,"m","https://s3.amazonaws.com/uifaces/faces/twitter/jsa/128.jpg"));
        studentList.add(new Student("Alicia",18,"f","https://s3.amazonaws.com/uifaces/faces/twitter/adellecharles/128.jpg"));
        studentList.add(new Student("Carolina",18,"f","https://s3.amazonaws.com/uifaces/faces/twitter/jina/128.jpg"));

        // Adapter
        MyStudentAdapter adapter = new MyStudentAdapter(
                this,
                R.layout.student_item,
                studentList
        );

        lista.setAdapter(adapter);

    }
}
