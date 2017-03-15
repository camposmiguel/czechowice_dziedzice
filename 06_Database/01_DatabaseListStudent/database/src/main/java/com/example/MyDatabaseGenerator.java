package com.example;

import org.greenrobot.greendao.generator.DaoGenerator;
import org.greenrobot.greendao.generator.Entity;
import org.greenrobot.greendao.generator.Schema;

public class MyDatabaseGenerator {

    // Design the database schema

    public static void main(String args[]) {

        Schema schema = new Schema(1, "com.miguelcr.a01_simplelist");

        // CREATE TABLE Student ...
        Entity student = schema.addEntity("Student");
        student.addIdProperty().primaryKey().autoincrement();
        student.addStringProperty("name");

        try {
            new DaoGenerator().generateAll(schema, "./app/src/main/java");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
