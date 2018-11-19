package com.tinder.data.model.activityfeed;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.annotation.NonNull;
import com.squareup.sqldelight.C6123b.C7265b;
import com.squareup.sqldelight.C6124c;
import com.squareup.sqldelight.RowMapper;
import com.tinder.api.ManagerWebServices;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public interface ActivityEventNewMatchModel {

    public interface Creator<T extends ActivityEventNewMatchModel> {
        T create(long j, @NonNull String str, long j2, long j3, long j4);
    }

    public interface Select_activity_event_new_matchCreator<T extends Select_activity_event_new_matchModel> {
        T create(long j, long j2, long j3);
    }

    public interface Select_activity_event_new_matchModel {
        long other_user_number();

        long timestamp();

        long user_number();
    }

    /* renamed from: com.tinder.data.model.activityfeed.ActivityEventNewMatchModel$a */
    public static final class C8717a<T extends ActivityEventNewMatchModel> {
        /* renamed from: a */
        public final Creator<T> f30687a;

        public C8717a(Creator<T> creator) {
            this.f30687a = creator;
        }

        /* renamed from: a */
        public C6124c m37199a(@NonNull String str) {
            List arrayList = new ArrayList();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SELECT user_number, other_user_number, timestamp\nFROM activity_event_new_match\nWHERE activity_feed_item_id = ");
            stringBuilder.append(ManagerWebServices.QUERY_QUESTION_MARK);
            stringBuilder.append(1);
            arrayList.add(str);
            return new C6124c(stringBuilder.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]), Collections.singleton("activity_event_new_match"));
        }

        /* renamed from: a */
        public <R extends Select_activity_event_new_matchModel> C10867c<R> m37200a(Select_activity_event_new_matchCreator<R> select_activity_event_new_matchCreator) {
            return new C10867c(select_activity_event_new_matchCreator);
        }
    }

    /* renamed from: com.tinder.data.model.activityfeed.ActivityEventNewMatchModel$c */
    public static final class C10867c<T extends Select_activity_event_new_matchModel> implements RowMapper<T> {
        /* renamed from: a */
        private final Select_activity_event_new_matchCreator<T> f35521a;

        @NonNull
        public /* synthetic */ Object map(@NonNull Cursor cursor) {
            return m43371a(cursor);
        }

        public C10867c(Select_activity_event_new_matchCreator<T> select_activity_event_new_matchCreator) {
            this.f35521a = select_activity_event_new_matchCreator;
        }

        @NonNull
        /* renamed from: a */
        public T m43371a(@NonNull Cursor cursor) {
            return this.f35521a.create(cursor.getLong(0), cursor.getLong(1), cursor.getLong(2));
        }
    }

    /* renamed from: com.tinder.data.model.activityfeed.ActivityEventNewMatchModel$b */
    public static final class C13023b extends C7265b {
        public C13023b(SQLiteDatabase sQLiteDatabase) {
            super("activity_event_new_match", sQLiteDatabase.compileStatement("INSERT INTO activity_event_new_match (activity_feed_item_id, user_number, other_user_number, timestamp)\nVALUES (?, ?, ?, ?)"));
        }

        /* renamed from: a */
        public void m50775a(@NonNull String str, long j, long j2, long j3) {
            this.b.bindString(1, str);
            this.b.bindLong(2, j);
            this.b.bindLong(3, j2);
            this.b.bindLong(4, j3);
        }
    }

    long _id();

    @NonNull
    String activity_feed_item_id();

    long other_user_number();

    long timestamp();

    long user_number();
}
