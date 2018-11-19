package com.foursquare.internal.data.db;

import android.database.sqlite.SQLiteDatabase;
import java.util.Collections;
import java.util.List;

/* renamed from: com.foursquare.internal.data.db.a */
public abstract class C1916a {
    protected static final String COLUMN_TYPE_INTEGER = "INTEGER";
    protected static final String COLUMN_TYPE_REAL = "REAL";
    protected static final String COLUMN_TYPE_TEXT = "TEXT";

    public abstract String getCreateTableSQL();

    public int getLastSchemaChangedVersion() {
        return 36;
    }

    public abstract String getTableName();

    public void createTable(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(getCreateTableSQL());
    }

    public void upgradeTable(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (getMigrations() != null) {
            if (!getMigrations().isEmpty()) {
                for (Migration migration : getMigrations()) {
                    int databaseVersion = migration.getDatabaseVersion();
                    if (databaseVersion > i && databaseVersion <= i2) {
                        migration.apply(sQLiteDatabase);
                    }
                }
                return;
            }
        }
        i = new StringBuilder();
        i.append("DROP TABLE IF EXISTS ");
        i.append(getTableName());
        sQLiteDatabase.execSQL(i.toString());
        createTable(sQLiteDatabase);
    }

    public void downgradeTable(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        i = new StringBuilder();
        i.append("DROP TABLE IF EXISTS ");
        i.append(getTableName());
        sQLiteDatabase.execSQL(i.toString());
        createTable(sQLiteDatabase);
    }

    public void reset() {
        upgradeTable(C1916a.getReadableDatabase(), 0, 0);
    }

    public void onLogout() {
        reset();
    }

    public List<Migration> getMigrations() {
        return Collections.emptyList();
    }

    protected static SQLiteDatabase getDatabase() {
        return DatabaseProvider.m6655a().m6657b();
    }

    protected static SQLiteDatabase getReadableDatabase() {
        return DatabaseProvider.m6655a().getReadableDatabase();
    }
}
