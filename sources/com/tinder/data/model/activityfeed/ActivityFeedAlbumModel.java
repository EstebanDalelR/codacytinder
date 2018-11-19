package com.tinder.data.model.activityfeed;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.squareup.sqldelight.C6123b.C7265b;
import com.squareup.sqldelight.C6124c;
import com.squareup.sqldelight.ColumnAdapter;
import com.squareup.sqldelight.RowMapper;
import com.tinder.api.ManagerWebServices;
import com.tinder.domain.feed.ActivityFeedImage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public interface ActivityFeedAlbumModel {

    public interface Creator<T extends ActivityFeedAlbumModel> {
        T create(@NonNull String str, @NonNull String str2, @NonNull String str3, @Nullable List<ActivityFeedImage> list);
    }

    public interface Select_activity_feed_albumCreator<T extends Select_activity_feed_albumModel> {
        T create(@NonNull String str, @Nullable List<ActivityFeedImage> list);
    }

    public interface Select_activity_feed_albumModel {
        @Nullable
        List<ActivityFeedImage> images();

        @NonNull
        String name();
    }

    /* renamed from: com.tinder.data.model.activityfeed.ActivityFeedAlbumModel$a */
    public static final class C8718a<T extends ActivityFeedAlbumModel> {
        /* renamed from: a */
        public final Creator<T> f30688a;
        /* renamed from: b */
        public final ColumnAdapter<List<ActivityFeedImage>, byte[]> f30689b;

        public C8718a(Creator<T> creator, ColumnAdapter<List<ActivityFeedImage>, byte[]> columnAdapter) {
            this.f30688a = creator;
            this.f30689b = columnAdapter;
        }

        /* renamed from: a */
        public C6124c m37201a(@NonNull String str, @NonNull String str2) {
            List arrayList = new ArrayList();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SELECT name, images\nFROM activity_feed_album\nWHERE activity_feed_item_id = ");
            stringBuilder.append(ManagerWebServices.QUERY_QUESTION_MARK);
            stringBuilder.append(1);
            arrayList.add(str);
            stringBuilder.append(" AND activity_feed_song_id = ");
            stringBuilder.append(ManagerWebServices.QUERY_QUESTION_MARK);
            stringBuilder.append(2);
            arrayList.add(str2);
            return new C6124c(stringBuilder.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]), Collections.singleton("activity_feed_album"));
        }

        /* renamed from: a */
        public <R extends Select_activity_feed_albumModel> C10868c<R, T> m37202a(Select_activity_feed_albumCreator<R> select_activity_feed_albumCreator) {
            return new C10868c(select_activity_feed_albumCreator, this);
        }
    }

    /* renamed from: com.tinder.data.model.activityfeed.ActivityFeedAlbumModel$c */
    public static final class C10868c<T extends Select_activity_feed_albumModel, T1 extends ActivityFeedAlbumModel> implements RowMapper<T> {
        /* renamed from: a */
        private final Select_activity_feed_albumCreator<T> f35522a;
        /* renamed from: b */
        private final C8718a<T1> f35523b;

        @NonNull
        public /* synthetic */ Object map(@NonNull Cursor cursor) {
            return m43372a(cursor);
        }

        public C10868c(Select_activity_feed_albumCreator<T> select_activity_feed_albumCreator, C8718a<T1> c8718a) {
            this.f35522a = select_activity_feed_albumCreator;
            this.f35523b = c8718a;
        }

        @NonNull
        /* renamed from: a */
        public T m43372a(@NonNull Cursor cursor) {
            return this.f35522a.create(cursor.getString(0), cursor.isNull(1) ? null : (List) this.f35523b.f30689b.decode(cursor.getBlob(1)));
        }
    }

    /* renamed from: com.tinder.data.model.activityfeed.ActivityFeedAlbumModel$b */
    public static final class C13024b extends C7265b {
        /* renamed from: c */
        private final C8718a<? extends ActivityFeedAlbumModel> f41582c;

        public C13024b(SQLiteDatabase sQLiteDatabase, C8718a<? extends ActivityFeedAlbumModel> c8718a) {
            super("activity_feed_album", sQLiteDatabase.compileStatement("INSERT INTO activity_feed_album (activity_feed_item_id, activity_feed_song_id, name, images)\nVALUES (?, ?, ?, ?)"));
            this.f41582c = c8718a;
        }

        /* renamed from: a */
        public void m50776a(@NonNull String str, @NonNull String str2, @NonNull String str3, @Nullable List<ActivityFeedImage> list) {
            this.b.bindString(1, str);
            this.b.bindString(2, str2);
            this.b.bindString(3, str3);
            if (list == null) {
                this.b.bindNull(4);
            } else {
                this.b.bindBlob(4, (byte[]) this.f41582c.f30689b.encode(list));
            }
        }
    }

    @NonNull
    String activity_feed_item_id();

    @NonNull
    String activity_feed_song_id();

    @Nullable
    List<ActivityFeedImage> images();

    @NonNull
    String name();
}
