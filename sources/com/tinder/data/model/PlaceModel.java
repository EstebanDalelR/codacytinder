package com.tinder.data.model;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.annotation.NonNull;
import com.squareup.sqldelight.C6123b.C7265b;
import com.squareup.sqldelight.C6123b.C7266c;
import com.squareup.sqldelight.RowMapper;

public interface PlaceModel {

    public interface Creator<T extends PlaceModel> {
        T create(@NonNull String str, @NonNull String str2);
    }

    /* renamed from: com.tinder.data.model.PlaceModel$a */
    public static final class C8711a<T extends PlaceModel> {
        /* renamed from: a */
        public final Creator<T> f30676a;

        public C8711a(Creator<T> creator) {
            this.f30676a = creator;
        }
    }

    /* renamed from: com.tinder.data.model.PlaceModel$c */
    public static final class C10863c<T extends PlaceModel> implements RowMapper<T> {
        /* renamed from: a */
        private final C8711a<T> f35517a;

        public /* synthetic */ Object map(@NonNull Cursor cursor) {
            return m43367a(cursor);
        }

        public C10863c(C8711a<T> c8711a) {
            this.f35517a = c8711a;
        }

        /* renamed from: a */
        public T m43367a(@NonNull Cursor cursor) {
            return this.f35517a.f30676a.create(cursor.getString(0), cursor.getString(1));
        }
    }

    /* renamed from: com.tinder.data.model.PlaceModel$b */
    public static final class C13012b extends C7265b {
        public C13012b(SQLiteDatabase sQLiteDatabase) {
            super("place", sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO place (id, name) VALUES (?, ?)"));
        }

        /* renamed from: a */
        public void m50764a(@NonNull String str, @NonNull String str2) {
            this.b.bindString(1, str);
            this.b.bindString(2, str2);
        }
    }

    /* renamed from: com.tinder.data.model.PlaceModel$d */
    public static final class C13013d extends C7266c {
        public C13013d(SQLiteDatabase sQLiteDatabase) {
            super("place", sQLiteDatabase.compileStatement("UPDATE place SET name = ? WHERE id = ?"));
        }

        /* renamed from: a */
        public void m50765a(@NonNull String str, @NonNull String str2) {
            this.b.bindString(1, str);
            this.b.bindString(2, str2);
        }
    }

    @NonNull
    String id();

    @NonNull
    String name();
}
