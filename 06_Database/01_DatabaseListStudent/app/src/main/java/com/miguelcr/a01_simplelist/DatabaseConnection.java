package com.miguelcr.a01_simplelist;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by miguelcampos on 15/3/17.
 */

public class DatabaseConnection {

    private static SQLiteDatabase db;
    private static DaoMaster daoMaster;
    private static DaoSession daoSession;

    public static DaoSession getConnection(Context ctx) {
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(ctx,"students-db", null);
        db = helper.getWritableDatabase();
        daoMaster = new DaoMaster(db);
        daoSession = daoMaster.newSession();

        return daoSession;
    }

    public static StudentDao getStudentDao (Context ctx) {
        DaoSession daoSession = DatabaseConnection.getConnection(ctx);
        return daoSession.getStudentDao();
    }

}
