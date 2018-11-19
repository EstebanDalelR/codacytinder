package com.tinder.data.model;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.annotation.NonNull;
import com.squareup.sqldelight.C6123b.C7265b;
import com.squareup.sqldelight.C6123b.C7266c;
import com.squareup.sqldelight.C6124c;
import com.squareup.sqldelight.RowMapper;
import com.tinder.api.ManagerWebServices;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public interface MessageImageModel {

    public interface Creator<T extends MessageImageModel> {
        T create(@NonNull String str, @NonNull String str2, @NonNull String str3, long j, long j2);
    }

    /* renamed from: com.tinder.data.model.MessageImageModel$a */
    public static final class C8709a<T extends MessageImageModel> {
        /* renamed from: a */
        public final Creator<T> f30671a;

        public C8709a(Creator<T> creator) {
            this.f30671a = creator;
        }

        /* renamed from: a */
        public C6124c m37180a(@NonNull String str) {
            List arrayList = new ArrayList();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SELECT * FROM message_image WHERE message_id = ");
            stringBuilder.append(ManagerWebServices.QUERY_QUESTION_MARK);
            stringBuilder.append(1);
            arrayList.add(str);
            return new C6124c(stringBuilder.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]), Collections.singleton("message_image"));
        }

        /* renamed from: a */
        public C10857c<T> m37181a() {
            return new C10857c(this);
        }
    }

    /* renamed from: com.tinder.data.model.MessageImageModel$c */
    public static final class C10857c<T extends MessageImageModel> implements RowMapper<T> {
        /* renamed from: a */
        private final C8709a<T> f35504a;

        public /* synthetic */ Object map(@NonNull Cursor cursor) {
            return m43361a(cursor);
        }

        public C10857c(C8709a<T> c8709a) {
            this.f35504a = c8709a;
        }

        /* renamed from: a */
        public T m43361a(@NonNull Cursor cursor) {
            return this.f35504a.f30671a.create(cursor.getString(0), cursor.getString(1), cursor.getString(2), cursor.getLong(3), cursor.getLong(4));
        }
    }

    /* renamed from: com.tinder.data.model.MessageImageModel$b */
    public static final class C13003b extends C7265b {
        public C13003b(SQLiteDatabase sQLiteDatabase) {
            super("message_image", sQLiteDatabase.compileStatement("INSERT INTO message_image (message_id, source, url, width, height)\nVALUES (?, ?, ?, ?, ?)"));
        }

        /* renamed from: a */
        public void m50755a(@NonNull String str, @NonNull String str2, @NonNull String str3, long j, long j2) {
            this.b.bindString(1, str);
            this.b.bindString(2, str2);
            this.b.bindString(3, str3);
            this.b.bindLong(4, j);
            this.b.bindLong(5, j2);
        }
    }

    /* renamed from: com.tinder.data.model.MessageImageModel$d */
    public static final class C13004d extends C7266c {
        public C13004d(SQLiteDatabase sQLiteDatabase) {
            super("message_image", sQLiteDatabase.compileStatement("UPDATE message_image\nSET source = ?, url = ?, width = ?, height = ?\nWHERE message_id = ?"));
        }

        /* renamed from: a */
        public void m50756a(@NonNull String str, @NonNull String str2, long j, long j2, @NonNull String str3) {
            this.b.bindString(1, str);
            this.b.bindString(2, str2);
            this.b.bindLong(3, j);
            this.b.bindLong(4, j2);
            this.b.bindString(5, str3);
        }
    }

    long height();

    @NonNull
    String message_id();

    @NonNull
    String source();

    @NonNull
    String url();

    long width();
}
