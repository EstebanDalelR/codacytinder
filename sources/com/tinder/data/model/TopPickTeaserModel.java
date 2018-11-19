package com.tinder.data.model;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.squareup.sqldelight.C6123b.C7264a;
import com.squareup.sqldelight.C6123b.C7265b;
import com.squareup.sqldelight.C6124c;
import com.squareup.sqldelight.ColumnAdapter;
import com.squareup.sqldelight.RowMapper;
import com.tinder.domain.recs.model.Tag;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.joda.time.DateTime;

public interface TopPickTeaserModel {

    public interface Creator<T extends TopPickTeaserModel> {
        T create(@NonNull String str, @NonNull DateTime dateTime, @NonNull String str2, @Nullable List<Tag> list);
    }

    /* renamed from: com.tinder.data.model.TopPickTeaserModel$b */
    public static final class C8715b<T extends TopPickTeaserModel> {
        /* renamed from: a */
        public final Creator<T> f30682a;
        /* renamed from: b */
        public final ColumnAdapter<DateTime, Long> f30683b;
        /* renamed from: c */
        public final ColumnAdapter<List<Tag>, byte[]> f30684c;

        public C8715b(Creator<T> creator, ColumnAdapter<DateTime, Long> columnAdapter, ColumnAdapter<List<Tag>, byte[]> columnAdapter2) {
            this.f30682a = creator;
            this.f30683b = columnAdapter;
            this.f30684c = columnAdapter2;
        }

        /* renamed from: a */
        public C6124c m37195a(@NonNull DateTime dateTime) {
            List arrayList = new ArrayList();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SELECT * FROM top_pick_teaser WHERE expiration_time >= ");
            stringBuilder.append(this.f30683b.encode(dateTime));
            return new C6124c(stringBuilder.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]), Collections.singleton("top_pick_teaser"));
        }

        /* renamed from: a */
        public C10865d<T> m37196a() {
            return new C10865d(this);
        }
    }

    /* renamed from: com.tinder.data.model.TopPickTeaserModel$d */
    public static final class C10865d<T extends TopPickTeaserModel> implements RowMapper<T> {
        /* renamed from: a */
        private final C8715b<T> f35519a;

        public /* synthetic */ Object map(@NonNull Cursor cursor) {
            return m43369a(cursor);
        }

        public C10865d(C8715b<T> c8715b) {
            this.f35519a = c8715b;
        }

        /* renamed from: a */
        public T m43369a(@NonNull Cursor cursor) {
            return this.f35519a.f30682a.create(cursor.getString(0), (DateTime) this.f35519a.f30683b.decode(Long.valueOf(cursor.getLong(1))), cursor.getString(2), cursor.isNull(3) ? null : (List) this.f35519a.f30684c.decode(cursor.getBlob(3)));
        }
    }

    /* renamed from: com.tinder.data.model.TopPickTeaserModel$a */
    public static final class C13019a extends C7264a {
        /* renamed from: c */
        private final C8715b<? extends TopPickTeaserModel> f41578c;

        public C13019a(SQLiteDatabase sQLiteDatabase, C8715b<? extends TopPickTeaserModel> c8715b) {
            super("top_pick_teaser", sQLiteDatabase.compileStatement("DELETE FROM top_pick_teaser WHERE expiration_time <= ?"));
            this.f41578c = c8715b;
        }

        /* renamed from: a */
        public void m50771a(@NonNull DateTime dateTime) {
            this.b.bindLong(1, ((Long) this.f41578c.f30683b.encode(dateTime)).longValue());
        }
    }

    /* renamed from: com.tinder.data.model.TopPickTeaserModel$c */
    public static final class C13020c extends C7265b {
        /* renamed from: c */
        private final C8715b<? extends TopPickTeaserModel> f41579c;

        public C13020c(SQLiteDatabase sQLiteDatabase, C8715b<? extends TopPickTeaserModel> c8715b) {
            super("top_pick_teaser", sQLiteDatabase.compileStatement("INSERT OR REPLACE INTO top_pick_teaser (id, expiration_time, photo_url, tags) VALUES (?, ?, ?, ?)"));
            this.f41579c = c8715b;
        }

        /* renamed from: a */
        public void m50772a(@NonNull String str, @NonNull DateTime dateTime, @NonNull String str2, @Nullable List<Tag> list) {
            this.b.bindString(1, str);
            this.b.bindLong(2, ((Long) this.f41579c.f30683b.encode(dateTime)).longValue());
            this.b.bindString(3, str2);
            if (list == null) {
                this.b.bindNull(4);
            } else {
                this.b.bindBlob(4, (byte[]) this.f41579c.f30684c.encode(list));
            }
        }
    }

    @NonNull
    DateTime expiration_time();

    @NonNull
    String id();

    @NonNull
    String photo_url();

    @Nullable
    List<Tag> tags();
}
