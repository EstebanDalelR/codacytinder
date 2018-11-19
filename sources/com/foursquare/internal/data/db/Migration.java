package com.foursquare.internal.data.db;

import android.database.sqlite.SQLiteDatabase;

public interface Migration {
    void apply(SQLiteDatabase sQLiteDatabase);

    int getDatabaseVersion();
}
