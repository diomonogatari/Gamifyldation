package com.fyld.gamiyldation.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.google.android.material.snackbar.Snackbar;

public class DatabaseHelper extends SQLiteOpenHelper {

    //Singleton
    private static DatabaseHelper model;

    //region Database structure

    public static final String DATABASE_NAME    = "Gamifyldation.db";
    public static final String TABLE_PLAYERS    = "Players";
    public static final String COLUMN_ID        = "PlayerId";
    public static final String COLUMN_FULLNAME  = "FullName";
    public static final String COLUMN_POINTS    = "Points";
    public static final String COLUMN_ISACTIVE  = "IsActive";

    //endregion

    //region Database Commands
    public static final String COMMAND_CREATE_PLAYER_TABLE = "create table " + TABLE_PLAYERS + "(" + COLUMN_ID +"INTEGER PRIMARY KEY AUTOINCREMENT, "+COLUMN_FULLNAME+" TEXT, "+COLUMN_POINTS+" INTEGER, "+COLUMN_ISACTIVE+" INTEGER)";
    public static final String COMMAND_DROP_PLAYER_TABLE = "DROP TABLE IF EXISTS " + TABLE_PLAYERS;
    //endregion


    //region Constructor
    private DatabaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, 1); // create the database
    }

    public static synchronized DatabaseHelper getInstance(Context context) {

        // Use the application context, which will ensure that you
        // don't accidentally leak an Activity's context.
        if (model == null) {
            model = new DatabaseHelper(context.getApplicationContext());
        }
        return model;
    }

    //endregion


    //region Override zone
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(COMMAND_CREATE_PLAYER_TABLE); // create the table in our database
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(COMMAND_DROP_PLAYER_TABLE);
        onCreate(db);
    }
    //endregion
}

