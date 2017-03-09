package com.miguelcr.a01_simplelist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView lista;
    // String[] students = {"Mat","Carolina","Patryk","Dawid"};
    List<String> students;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1. Connect the "lista" var with the ListView
        // component
        lista = (ListView) findViewById(R.id.list_view);

        // 2. List of elements (dynamic list)
        students = new ArrayList<>();
        students.add("Alicia");
        students.add("Carolina");
        students.add("Patryk I");
        students.add("Michal I");
        students.add("Mat");
        students.add("Michal II");
        students.add("Michal III");
        students.add("Wiktoria");
        students.add("Weronika");
        students.add("Patryk");
        students.add("Kuba");
        students.add("Sebastian");
        students.add("Adrian");
        students.add("Wojtek");
        students.add("Piotrek");
        students.add("Kuba");



    }
}
