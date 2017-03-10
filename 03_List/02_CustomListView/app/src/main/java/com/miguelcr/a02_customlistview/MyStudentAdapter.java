package com.miguelcr.a02_customlistview;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

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
        int age = current.getAge();
        String sex = current.getSex();

        TextView textViewName = (TextView)v.findViewById(R.id.textViewName);
        TextView textViewAge = (TextView)v.findViewById(R.id.textViewAge);
        ImageView imageViewAvatar = (ImageView) v.findViewById(R.id.imageViewAvatar);

        textViewName.setText(name);
        textViewAge.setText(String.valueOf(age));

        /*if(sex.equals("f")) {
            imageViewAvatar.setImageResource(R.drawable.ic_girl);
        } else {
            imageViewAvatar.setImageResource(R.drawable.ic_boy);
        }*/

        Picasso.with(ctx).load(current.getPhoto()).into(imageViewAvatar);

        return v;
    }
}
