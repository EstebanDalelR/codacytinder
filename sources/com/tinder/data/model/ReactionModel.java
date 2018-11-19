package com.tinder.data.model;

import android.database.sqlite.SQLiteDatabase;
import android.support.annotation.NonNull;
import com.squareup.sqldelight.C6123b.C7265b;
import com.squareup.sqldelight.C6123b.C7266c;

public interface ReactionModel {

    public interface Creator<T extends ReactionModel> {
        T create(long j, @NonNull String str, @NonNull String str2);
    }

    /* renamed from: com.tinder.data.model.ReactionModel$a */
    public static final class C8712a<T extends ReactionModel> {
        /* renamed from: a */
        public final Creator<T> f30677a;

        public C8712a(Creator<T> creator) {
            this.f30677a = creator;
        }
    }

    /* renamed from: com.tinder.data.model.ReactionModel$b */
    public static final class C13014b extends C7265b {
        public C13014b(SQLiteDatabase sQLiteDatabase) {
            super("reaction", sQLiteDatabase.compileStatement("INSERT INTO reaction (reaction_id, message_id)\nVALUES (?, ?)"));
        }

        /* renamed from: a */
        public void m50766a(@NonNull String str, @NonNull String str2) {
            this.b.bindString(1, str);
            this.b.bindString(2, str2);
        }
    }

    /* renamed from: com.tinder.data.model.ReactionModel$c */
    public static final class C13015c extends C7266c {
        public C13015c(SQLiteDatabase sQLiteDatabase) {
            super("reaction", sQLiteDatabase.compileStatement("UPDATE reaction\nSET reaction_id = ?\nWHERE message_id = ?"));
        }

        /* renamed from: a */
        public void m50767a(@NonNull String str, @NonNull String str2) {
            this.b.bindString(1, str);
            this.b.bindString(2, str2);
        }
    }

    long _id();

    @NonNull
    String message_id();

    @NonNull
    String reaction_id();
}
