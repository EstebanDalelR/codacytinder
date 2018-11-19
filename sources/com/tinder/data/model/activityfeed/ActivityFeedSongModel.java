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

public interface ActivityFeedSongModel {

    public interface Creator<T extends ActivityFeedSongModel> {
        T create(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4);
    }

    public interface Select_activity_feed_songCreator<T extends Select_activity_feed_songModel> {
        T create(@NonNull String str, @NonNull String str2, @NonNull String str3);
    }

    public interface Select_activity_feed_songModel {
        @NonNull
        String id();

        @NonNull
        String name();

        @NonNull
        String url();
    }

    /* renamed from: com.tinder.data.model.activityfeed.ActivityFeedSongModel$a */
    public static final class C8723a<T extends ActivityFeedSongModel> {
        /* renamed from: a */
        public final Creator<T> f30696a;

        public C8723a(Creator<T> creator) {
            this.f30696a = creator;
        }

        /* renamed from: a */
        public C6124c m37211a(@NonNull String str) {
            List arrayList = new ArrayList();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SELECT id, name, url\nFROM activity_feed_song\nWHERE activity_feed_item_id = ");
            stringBuilder.append(ManagerWebServices.QUERY_QUESTION_MARK);
            stringBuilder.append(1);
            arrayList.add(str);
            return new C6124c(stringBuilder.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]), Collections.singleton("activity_feed_song"));
        }

        /* renamed from: a */
        public <R extends Select_activity_feed_songModel> C10873c<R> m37212a(Select_activity_feed_songCreator<R> select_activity_feed_songCreator) {
            return new C10873c(select_activity_feed_songCreator);
        }
    }

    /* renamed from: com.tinder.data.model.activityfeed.ActivityFeedSongModel$c */
    public static final class C10873c<T extends Select_activity_feed_songModel> implements RowMapper<T> {
        /* renamed from: a */
        private final Select_activity_feed_songCreator<T> f35530a;

        @NonNull
        public /* synthetic */ Object map(@NonNull Cursor cursor) {
            return m43377a(cursor);
        }

        public C10873c(Select_activity_feed_songCreator<T> select_activity_feed_songCreator) {
            this.f35530a = select_activity_feed_songCreator;
        }

        @NonNull
        /* renamed from: a */
        public T m43377a(@NonNull Cursor cursor) {
            return this.f35530a.create(cursor.getString(0), cursor.getString(1), cursor.getString(2));
        }
    }

    /* renamed from: com.tinder.data.model.activityfeed.ActivityFeedSongModel$b */
    public static final class C13030b extends C7265b {
        public C13030b(SQLiteDatabase sQLiteDatabase) {
            super("activity_feed_song", sQLiteDatabase.compileStatement("INSERT INTO activity_feed_song (id, activity_feed_item_id, name, url)\nVALUES (?, ?, ?, ?)"));
        }

        /* renamed from: a */
        public void m50782a(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4) {
            this.b.bindString(1, str);
            this.b.bindString(2, str2);
            this.b.bindString(3, str3);
            this.b.bindString(4, str4);
        }
    }

    @NonNull
    String activity_feed_item_id();

    @NonNull
    String id();

    @NonNull
    String name();

    @NonNull
    String url();
}
