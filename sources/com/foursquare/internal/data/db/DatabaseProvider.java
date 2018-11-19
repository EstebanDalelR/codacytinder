package com.foursquare.internal.data.db;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.foursquare.internal.util.FsLog;
import java.util.List;

public final class DatabaseProvider extends SQLiteOpenHelper {
    /* renamed from: a */
    private static final String f5135a = "com.foursquare.internal.data.db.DatabaseProvider";
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: f */
    private static DatabaseProvider f5136f;
    /* renamed from: b */
    private List<C1916a> f5137b;
    /* renamed from: c */
    private SQLiteDatabase f5138c;
    /* renamed from: d */
    private OnSchemaChangeListener f5139d;
    /* renamed from: e */
    private Context f5140e;

    public interface OnSchemaChangeListener {
        void tableChanged(C1916a c1916a);

        void tableCreated(C1916a c1916a);
    }

    /* renamed from: a */
    public static DatabaseProvider m6655a() {
        return f5136f;
    }

    /* renamed from: a */
    public static void m6656a(Context context, String str, int i, OnSchemaChangeListener onSchemaChangeListener, List<C1916a> list) {
        f5136f = new DatabaseProvider(context, onSchemaChangeListener, list, str, i);
    }

    private DatabaseProvider(Context context, OnSchemaChangeListener onSchemaChangeListener, List<C1916a> list, String str, int i) {
        super(context, str, null, i);
        this.f5139d = onSchemaChangeListener;
        this.f5140e = context;
        this.f5137b = list;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        for (C1916a c1916a : this.f5137b) {
            c1916a.createTable(sQLiteDatabase);
            if (this.f5139d != null) {
                this.f5139d.tableCreated(c1916a);
            }
        }
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        String str = f5135a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Upgrading database from ");
        stringBuilder.append(i);
        stringBuilder.append(" to new version ");
        stringBuilder.append(i2);
        FsLog.m6805c(str, stringBuilder.toString());
        for (C1916a c1916a : this.f5137b) {
            if (c1916a.getLastSchemaChangedVersion() > i) {
                c1916a.createTable(sQLiteDatabase);
                c1916a.upgradeTable(sQLiteDatabase, i, i2);
                if (this.f5139d != null) {
                    this.f5139d.tableChanged(c1916a);
                }
            }
        }
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        for (C1916a c1916a : this.f5137b) {
            c1916a.downgradeTable(sQLiteDatabase, i, i2);
            if (this.f5139d != null) {
                this.f5139d.tableChanged(c1916a);
            }
        }
    }

    /* renamed from: b */
    SQLiteDatabase m6657b() {
        if (this.f5138c == null) {
            this.f5138c = getWritableDatabase();
        }
        return this.f5138c;
    }

    /* renamed from: c */
    public void m6658c() {
        for (C1916a onLogout : this.f5137b) {
            onLogout.onLogout();
        }
    }
}
