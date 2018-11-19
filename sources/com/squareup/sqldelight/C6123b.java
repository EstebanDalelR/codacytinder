package com.squareup.sqldelight;

import android.database.sqlite.SQLiteStatement;

/* renamed from: com.squareup.sqldelight.b */
public abstract class C6123b {
    /* renamed from: a */
    public final String f22512a;
    /* renamed from: b */
    public final SQLiteStatement f22513b;

    /* renamed from: com.squareup.sqldelight.b$a */
    public static abstract class C7264a extends C6123b {
        protected C7264a(String str, SQLiteStatement sQLiteStatement) {
            super(str, sQLiteStatement);
        }
    }

    /* renamed from: com.squareup.sqldelight.b$b */
    public static abstract class C7265b extends C6123b {
        protected C7265b(String str, SQLiteStatement sQLiteStatement) {
            super(str, sQLiteStatement);
        }
    }

    /* renamed from: com.squareup.sqldelight.b$c */
    public static abstract class C7266c extends C6123b {
        protected C7266c(String str, SQLiteStatement sQLiteStatement) {
            super(str, sQLiteStatement);
        }
    }

    protected C6123b(String str, SQLiteStatement sQLiteStatement) {
        this.f22512a = str;
        this.f22513b = sQLiteStatement;
    }
}
