package com.miguelcr.a01_simplelist;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by miguelcampos on 9/3/17.
 */

public class MyStudentAdapter extends ArrayAdapter<Student> {
    Context ctx;
    int layoutTemplate;
    List<Student> values;

    public MyStudentAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<Student> objects) {
        super(context, resource, objects);
        ctx = context;
        layoutTemplate = resource;
        values = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View v = LayoutInflater.from(ctx).inflate(layoutTemplate, parent, false);

        // We get the current student to draw into the template
        Student current = values.get(position);
        String name = current.getName();

        TextView textViewName = (TextView)v.findViewById(R.id.textViewName);

        textViewName.setText(name);

        return v;
    }
}
