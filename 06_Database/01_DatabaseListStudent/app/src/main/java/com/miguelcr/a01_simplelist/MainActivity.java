package com.miguelcr.a01_simplelist;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
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
        students.add("Patryk II");
        students.add("Kuba");
        students.add("Sebastian");
        students.add("Adrian");
        students.add("Wojtek");
        students.add("Piotrek");
        students.add("Patryk III");
        students.add("Michal IV");
        students.add("Dawid");
        students.add("Patryk IV");

        // 3. Create the adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, // context
                android.R.layout.simple_list_item_1, // template
                students
        );

        // 4. Connect ListView lista + Adapter
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        String studentName = students.get(i);
        Toast.makeText(this, "Clicked "+studentName, Toast.LENGTH_LONG).show();

        //view.animate().rotationBy(360).setDuration(2000).start();

        TextView t = (TextView) view.findViewById(android.R.id.text1);
        t.setTextColor(ContextCompat.getColor(this,R.color.colorAccent));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.action_new_student:
                Toast.makeText(this, "New student", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}