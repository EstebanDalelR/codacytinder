package com.tinder.data.model;

import android.database.sqlite.SQLiteDatabase;
import android.support.annotation.NonNull;
import com.squareup.sqldelight.C6123b.C7265b;
import com.squareup.sqldelight.C6123b.C7266c;

public interface GifModel {

    public interface Creator<T extends GifModel> {
        T create(long j, @NonNull String str, @NonNull String str2, @NonNull String str3, long j2, long j3, @NonNull String str4, long j4, long j5);
    }

    /* renamed from: com.tinder.data.model.GifModel$a */
    public static final class C8703a<T extends GifModel> {
        /* renamed from: a */
        public final Creator<T> f30655a;

        public C8703a(Creator<T> creator) {
            this.f30655a = creator;
        }
    }

    /* renamed from: com.tinder.data.model.GifModel$b */
    public static final class C12985b extends C7265b {
        public C12985b(SQLiteDatabase sQLiteDatabase) {
            super("gif", sQLiteDatabase.compileStatement("INSERT INTO gif (gif_id, message_id, url, width, height, fixed_height_url, fixed_height_width, fixed_height_height)\nVALUES (?, ?, ?, ?, ?, ?, ?, ?)"));
        }

        /* renamed from: a */
        public void m50741a(@NonNull String str, @NonNull String str2, @NonNull String str3, long j, long j2, @NonNull String str4, long j3, long j4) {
            this.b.bindString(1, str);
            this.b.bindString(2, str2);
            this.b.bindString(3, str3);
            this.b.bindLong(4, j);
            this.b.bindLong(5, j2);
            this.b.bindString(6, str4);
            this.b.bindLong(7, j3);
            this.b.bindLong(8, j4);
        }
    }

    /* renamed from: com.tinder.data.model.GifModel$c */
    public static final class C12986c extends C7266c {
        public C12986c(SQLiteDatabase sQLiteDatabase) {
            super("gif", sQLiteDatabase.compileStatement("UPDATE gif\nSET gif_id = ?, url = ?, width = ?, height = ?, fixed_height_url = ?, fixed_height_width = ?, fixed_height_height = ?\nWHERE message_id = ?"));
        }

        /* renamed from: a */
        public void m50742a(@NonNull String str, @NonNull String str2, long j, long j2, @NonNull String str3, long j3, long j4, @NonNull String str4) {
            this.b.bindString(1, str);
            this.b.bindString(2, str2);
            this.b.bindLong(3, j);
            this.b.bindLong(4, j2);
            this.b.bindString(5, str3);
            this.b.bindLong(6, j3);
            this.b.bindLong(7, j4);
            this.b.bindString(8, str4);
        }
    }

    long _id();

    long fixed_height_height();

    @NonNull
    String fixed_height_url();

    long fixed_height_width();

    @NonNull
    String gif_id();

    long height();

    @NonNull
    String message_id();

    @NonNull
    String url();

    long width();
}
