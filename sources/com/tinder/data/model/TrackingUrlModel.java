package com.tinder.data.model;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.squareup.sqldelight.C6123b.C7265b;
import com.squareup.sqldelight.C6123b.C7266c;
import com.squareup.sqldelight.C6124c;
import com.squareup.sqldelight.ColumnAdapter;
import com.squareup.sqldelight.RowMapper;
import com.tinder.api.ManagerWebServices;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.joda.time.DateTime;

public interface TrackingUrlModel {

    public interface Creator<T extends TrackingUrlModel> {
        T create(@NonNull String str, @NonNull String str2, @NonNull String str3, boolean z, @Nullable DateTime dateTime, @Nullable String str4);
    }

    /* renamed from: com.tinder.data.model.TrackingUrlModel$a */
    public static final class C8716a<T extends TrackingUrlModel> {
        /* renamed from: a */
        public final Creator<T> f30685a;
        /* renamed from: b */
        public final ColumnAdapter<DateTime, Long> f30686b;

        public C8716a(Creator<T> creator, ColumnAdapter<DateTime, Long> columnAdapter) {
            this.f30685a = creator;
            this.f30686b = columnAdapter;
        }

        /* renamed from: a */
        public C6124c m37197a(@NonNull String str, @NonNull String str2) {
            List arrayList = new ArrayList();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SELECT * FROM tracking_url\n  WHERE template_id = ");
            stringBuilder.append(ManagerWebServices.QUERY_QUESTION_MARK);
            stringBuilder.append(1);
            arrayList.add(str);
            stringBuilder.append("\n  AND event = ");
            stringBuilder.append(ManagerWebServices.QUERY_QUESTION_MARK);
            stringBuilder.append(2);
            arrayList.add(str2);
            return new C6124c(stringBuilder.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]), Collections.singleton("tracking_url"));
        }

        /* renamed from: a */
        public C6124c m37198a(@NonNull String str, @Nullable String str2, @NonNull String str3) {
            List arrayList = new ArrayList();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SELECT * FROM tracking_url\n  WHERE template_id = ");
            stringBuilder.append(ManagerWebServices.QUERY_QUESTION_MARK);
            stringBuilder.append(1);
            arrayList.add(str);
            stringBuilder.append("\n  AND line_item_id = ");
            str = 2;
            if (str2 == null) {
                stringBuilder.append(ManagerWebServices.NULL_STRING_VALUE);
            } else {
                stringBuilder.append(ManagerWebServices.QUERY_QUESTION_MARK);
                stringBuilder.append(2);
                arrayList.add(str2);
                str = 3;
            }
            stringBuilder.append("\n  AND event = ");
            stringBuilder.append(ManagerWebServices.QUERY_QUESTION_MARK);
            stringBuilder.append(str);
            arrayList.add(str3);
            stringBuilder.append("\n  AND (is_unique = 0 OR (ping_time IS NULL AND is_unique = 1))");
            return new C6124c(stringBuilder.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]), Collections.singleton("tracking_url"));
        }
    }

    /* renamed from: com.tinder.data.model.TrackingUrlModel$c */
    public static final class C10866c<T extends TrackingUrlModel> implements RowMapper<T> {
        /* renamed from: a */
        private final C8716a<T> f35520a;

        public /* synthetic */ Object map(@NonNull Cursor cursor) {
            return m43370a(cursor);
        }

        public C10866c(C8716a<T> c8716a) {
            this.f35520a = c8716a;
        }

        /* renamed from: a */
        public T m43370a(@NonNull Cursor cursor) {
            Creator creator = this.f35520a.f30685a;
            boolean z = false;
            String string = cursor.getString(0);
            String string2 = cursor.getString(1);
            String string3 = cursor.getString(2);
            if (cursor.getInt(3) == 1) {
                z = true;
            }
            String str = null;
            DateTime dateTime = cursor.isNull(4) ? null : (DateTime) this.f35520a.f30686b.decode(Long.valueOf(cursor.getLong(4)));
            if (!cursor.isNull(5)) {
                str = cursor.getString(5);
            }
            return creator.create(string, string2, string3, z, dateTime, str);
        }
    }

    /* renamed from: com.tinder.data.model.TrackingUrlModel$b */
    public static final class C13021b extends C7265b {
        /* renamed from: c */
        private final C8716a<? extends TrackingUrlModel> f41580c;

        public C13021b(SQLiteDatabase sQLiteDatabase, C8716a<? extends TrackingUrlModel> c8716a) {
            super("tracking_url", sQLiteDatabase.compileStatement("INSERT INTO tracking_url(template_id, url, event, is_unique, ping_time, line_item_id) VALUES (?, ?, ?, ?, ?, ?)"));
            this.f41580c = c8716a;
        }

        /* renamed from: a */
        public void m50773a(@NonNull String str, @NonNull String str2, @NonNull String str3, boolean z, @Nullable DateTime dateTime, @Nullable String str4) {
            this.b.bindString(1, str);
            this.b.bindString(2, str2);
            this.b.bindString(3, str3);
            this.b.bindLong(true, z ? true : 0);
            if (dateTime == null) {
                this.b.bindNull(5);
            } else {
                this.b.bindLong(5, ((Long) this.f41580c.f30686b.encode(dateTime)).longValue());
            }
            if (str4 == null) {
                this.b.bindNull(6);
            } else {
                this.b.bindString(6, str4);
            }
        }
    }

    /* renamed from: com.tinder.data.model.TrackingUrlModel$d */
    public static final class C13022d extends C7266c {
        /* renamed from: c */
        private final C8716a<? extends TrackingUrlModel> f41581c;

        public C13022d(SQLiteDatabase sQLiteDatabase, C8716a<? extends TrackingUrlModel> c8716a) {
            super("tracking_url", sQLiteDatabase.compileStatement("UPDATE tracking_url\n  SET ping_time = ?\n  WHERE template_id = ?\n  AND event = ?\n  AND url = ?"));
            this.f41581c = c8716a;
        }

        /* renamed from: a */
        public void m50774a(@Nullable DateTime dateTime, @NonNull String str, @NonNull String str2, @NonNull String str3) {
            if (dateTime == null) {
                this.b.bindNull(1);
            } else {
                this.b.bindLong(1, ((Long) this.f41581c.f30686b.encode(dateTime)).longValue());
            }
            this.b.bindString(2, str);
            this.b.bindString(3, str2);
            this.b.bindString(4, str3);
        }
    }

    @NonNull
    String event();

    boolean is_unique();

    @Nullable
    String line_item_id();

    @Nullable
    DateTime ping_time();

    @NonNull
    String template_id();

    @NonNull
    String url();
}
